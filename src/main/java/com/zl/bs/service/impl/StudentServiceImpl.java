package com.zl.bs.service.impl;

import com.zl.bs.entity.Student;
import com.zl.bs.mapper.StudentMapper;
import com.zl.bs.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zl
 * @since 2023-04-05
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public boolean deleteByStuId(String stuId) {
        return studentMapper.deleteByStuId(stuId);
    }

    @Override
    public int updateByStuId(Student student) {
        return studentMapper.updateByStuId2(student);
    }
}
