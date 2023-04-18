package com.zl.bs.service.impl;

import com.zl.bs.entity.*;
import com.zl.bs.mapper.ResultMapper;
import com.zl.bs.mapper.RosterMapper;
import com.zl.bs.mapper.StudentMapper;
import com.zl.bs.mapper.WillnessMapper;
import com.zl.bs.service.StudentService;
import com.zl.bs.service.WillnessService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zl
 * @since 2023-04-16
 */
@Service
public class WillnessServiceImpl extends ServiceImpl<WillnessMapper, Willness> implements WillnessService {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    RosterMapper rosterMapper;

    @Autowired
    WillnessMapper willnessMapper;

    @Autowired
    ResultMapper resultMapper;


    @Override
    public Boolean makeRoster() {
        Boolean flag = true;
        List<Student> stuList = studentMapper.findAllStu();
        List<Roster> rosters = rosterMapper.findAll();
        List<Willness> willnesses= new ArrayList<>();
        for(Student stu : stuList){
            List<Willness> item = willnessMapper.findItem(stu.getStuId());
            willnesses.addAll(item);
        }
        System.out.println(stuList);
        System.out.println("啊");
        System.out.println(rosters);
        System.out.println(willnesses);

        //开始输入
        // 输入学生数目n和每个学生的最大工时
        int  n = stuList.size();
        Double[] maxHours = new Double[n];
        for (int i = 0; i < n; i++) {
            maxHours[i] = stuList.get(i).getMaxWorkHours();
        }

        // 输入班次数目m和每个班次的最大值班人数和工作时间
        int m = rosters.size();
        int[] maxWorkers = new int[m];
        Double[] workHours = new Double[m];
        for (int i = 0; i < m; i++) {
            maxWorkers[i] = rosters.get(i).getStuNumber();//最大值班人数
            workHours[i] = rosters.get(i).getWorkHours();
        }

        //初始化学生和班次列表
        List<rosterStu> students = new ArrayList<>();
        List<dut> duties = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            students.add(new rosterStu(stuList.get(i).getStuId(), maxHours[i]));
        }
        for (int i = 0; i < m; i++) {
            duties.add(new dut(rosters.get(i).getGuid(), maxWorkers[i], workHours[i]));
        }

        // 为每个学生选择班次
        for(rosterStu student : students) {
            for(Willness will : willnesses){
                if (will.getStuId().equals(student.getId()) ){
                    for (dut duty:duties) {
                        if (duty.getId().equals(will.getGuid())) {
                            student.addDuty(duty);
                            break;
                        }
                    }
                }
            }
        }
//        for(rosterStu stu:students){
//            System.out.println(stu.getDuties());
//            for (dut d : stu.getDuties()){
//                System.out.println(d.getId());
//                System.out.println(d.getWorkHours());
//                System.out.println(d.getMaxWorkers());
//
//            }
//            System.out.println("学生：");
//            System.out.println(stu.getId());
//            System.out.println(stu.getWorkHours());
//        }

        //分配值班学生
        for (dut duty:duties){
            int numWorkers = duty.getMaxWorkers();
            List<rosterStu> availableStudents = new ArrayList<>();
            for (rosterStu student : students) {
                if(student.getDuties().contains(duty)){
                    availableStudents.add(student);
                }
            }
            while (numWorkers > 0 && !availableStudents.isEmpty()){
                //从可用的学生中选择最大剩余工时的学生
                rosterStu bestStudent = Collections.max(availableStudents);
                if (bestStudent.canWork(duty.getWorkHours())){
                    //如果学生可以工作，则将学生添加到班次的值班学生列表中
                    duty.addWorker(bestStudent);
                    bestStudent.addWork(duty.getWorkHours());
                    numWorkers--;
                }
                availableStudents.remove(bestStudent);
            }
            if (numWorkers > 0) {
                System.err.println("Error: Duty " + duty.getId() + " has not enough workers.");
                flag = false;
            }
        }

        //输出每个班次值班的学生
        for (dut duty : duties) {
            System.out.println(duty.getId() + ":");
            List<rosterStu> workers = duty.getWorkers();
            for (int i = 0;i < workers.size();i++){
                System.out.print(workers.get(i).getId());
                resultMapper.insertItem(duty.getId(),workers.get(i).getId());
                if (i < workers.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        if(flag == false){
            return false;
        } else if(flag == true){
            return true;
        }
        return true;
    }
}
