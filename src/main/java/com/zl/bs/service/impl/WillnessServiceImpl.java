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
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;
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

    static List<Map<String, List<rosterStu>>> result = new ArrayList<>();
    static Boolean endFlag = false;

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
        for(rosterStu stu:students){
            System.out.println(stu.getDuties());
            for (dut d : stu.getDuties()){
                System.out.println(d.getId());
                System.out.println(d.getWorkHours());
                System.out.println(d.getMaxWorkers());

            }
            System.out.println("学生：");
            System.out.println(stu.getId());
            System.out.println(stu.getWorkHours());
        }
        List<List<dut>> resultList = new ArrayList<>();
        Map<String, Integer> shiftIndexMap = new HashMap<>();
        for (int i = 0; i < duties.size(); i++) {
            shiftIndexMap.put(duties.get(i).getId(), i);//[A,0] [B,1] [C,2]
        }

        Map<String,Integer> dutyselcet = new HashMap<>();
        for (dut su:duties){
            dutyselcet.put(su.getId(),0);
        }
        for (rosterStu st : students) {
            for (dut dut: st.getDuties()){
                if(dutyselcet.containsKey(dut.getId())){
                    dutyselcet.put(dut.getId(),dutyselcet.get(dut.getId())+1);
                }
            }
        }
        for (String key : dutyselcet.keySet()) {
            if(dutyselcet.get(key) == 0){
                for(dut dut: duties){
                    if(dut.getId() == key){
                        duties.remove(dut);
                    }
                }
            }
        }
        try {
            dfs(duties,students,0,new HashMap<>());
        } catch (ExitRecursionException e) {
            System.out.println(e);
        }

        //分配值班学生
//        for (dut duty:duties){
//            int numWorkers = duty.getMaxWorkers();
//            List<rosterStu> availableStudents = new ArrayList<>();
//            for (rosterStu student : students) {
//                if(student.getDuties().contains(duty)){
//                    availableStudents.add(student);
//                }
//            }
//            while (numWorkers > 0 && !availableStudents.isEmpty()){
//                //从可用的学生中选择最大剩余工时的学生
//                rosterStu bestStudent = Collections.max(availableStudents);
//                if (bestStudent.canWork(duty.getWorkHours())){
//                    //如果学生可以工作，则将学生添加到班次的值班学生列表中
//                    duty.addWorker(bestStudent);
//                    bestStudent.addWork(duty.getWorkHours());
//                    numWorkers--;
//                }
//                availableStudents.remove(bestStudent);
//            }
//            if (numWorkers > 0) {
//                System.err.println("Error: Duty " + duty.getId() + " has not enough workers.");
//                flag = false;
//            }
//        }

        //输出每个班次值班的学生
//        for (dut duty : duties) {
//            System.out.println(duty.getId() + ":");
//            List<rosterStu> workers = duty.getWorkers();
//            for (int i = 0;i < workers.size();i++){
//                System.out.print(workers.get(i).getId());
//                resultMapper.insertItem(duty.getId(),workers.get(i).getId());
//                if (i < workers.size() - 1) {
//                    System.out.print(", ");
//                }
//            }
//            System.out.println();
//        }
        for (Map<String, List<rosterStu>> aa :result) {
            if(isShiftsFull(aa,duties) || isPeopleFull(aa,students)) {
                for (Map.Entry<String, List<rosterStu>> entry : aa.entrySet()) {
                    System.out.println(entry.getKey() + ":");
                    List<rosterStu> workers = entry.getValue();
                    for (int i = 0;i < workers.size();i++){
                        System.out.print(workers.get(i).getId());
                        resultMapper.insertItem(entry.getKey(),workers.get(i).getId());
                        if (i < workers.size() - 1) {
                            System.out.print(", ");
                        }
                    }
                }
                break;
            }
        }

        if(flag == false){
            return false;
        } else if(flag == true){
            return true;
        }
        return true;
    }
    public static class ExitRecursionException extends Exception {
        public ExitRecursionException(String message) {
            super(message);
        }
    }

    private static void dfs(List<dut> duties, List<rosterStu> students, int stuIndex, Map<String, List<rosterStu>> currentAssignment) throws ExitRecursionException{
        if (stuIndex == students.size()) {
            if (endFlag || isShiftsFull(currentAssignment,duties) || isPeopleFull(currentAssignment,students)){
                saveResult(currentAssignment);
                throw new ExitRecursionException("Forced exit from recursion");
            } else {
                dfs(duties,students,0,currentAssignment);
            }
            return;
        }
        if (isShiftsFull(currentAssignment,duties)){
            endFlag = true;
            saveResult(currentAssignment);
            throw new ExitRecursionException("Forced exit from recursion");
        }
        if (isPeopleFull(currentAssignment,students)){
            endFlag = true;
            saveResult(currentAssignment);
            throw new ExitRecursionException("Forced exit from recursion");
        }
        rosterStu currentStudent = students.get(stuIndex);
        for (dut duty : currentStudent.getDuties()){

            if (currentStudent.canWork(duty.getWorkHours()) && !currentAssignment.getOrDefault(duty.getId(), new ArrayList<>()).contains(currentStudent) && currentAssignment.getOrDefault(duty.getId(), new ArrayList<>()).size() < duty.getMaxWorkers()){
                currentAssignment.computeIfAbsent(duty.getId(),k -> new ArrayList<>()).add(currentStudent);
                currentStudent.addWork(duty.getWorkHours());
                dfs(duties,students,stuIndex+1,currentAssignment);

                currentAssignment.get(duty.getId()).remove(currentStudent);
                currentStudent.subWork(duty.getWorkHours());
            }


        }
        dfs(duties,students,stuIndex+1,currentAssignment);
        //当学生没有被分配任何班次
    }

    private static boolean checkLimits(List<dut> duties) {
        for(dut duty:duties){
            if (duty.getWorkers().size() < duty.getMaxWorkers()){
                return false;
            }
        }
        return true;
    }

    public static void saveResult(Map<String, List<rosterStu>> currentAssignment) {
        Map<String, List<rosterStu>> temp = new HashMap<>();
        for (Map.Entry<String, List<rosterStu>> entry : currentAssignment.entrySet()) {
            for(rosterStu stu : entry.getValue()){
                temp.computeIfAbsent(entry.getKey(),k -> new ArrayList<>()).add(stu);
            }
        }
        result.add(temp);
    }

    public static boolean isShiftsFull(Map<String, List<rosterStu>> currentAssignment, List<dut> shifts) {
        for (dut shift : shifts) {
            if (currentAssignment.getOrDefault(shift.getId(), new ArrayList<>()).size() < shift.getMaxWorkers()) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPeopleFull(Map<String, List<rosterStu>> currentAssignment, List<rosterStu> students){
        for(rosterStu stu : students){
            int stuWorkNum = stu.getDuties().size();
            int nowNum = 0;
            for (Map.Entry<String, List<rosterStu>> entry : currentAssignment.entrySet()) {
                for (rosterStu stu5 : entry.getValue()){
                    if(stu5.getId() == stu.getId()){
                        nowNum++;
                    }
                }
            }
            if(nowNum<stuWorkNum){
                return false;
            }
        }
        return true;
    }

}
