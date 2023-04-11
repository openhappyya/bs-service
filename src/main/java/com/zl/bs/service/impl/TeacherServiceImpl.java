package com.zl.bs.service.impl;

import com.zl.bs.entity.Teacher;
import com.zl.bs.mapper.TeacherMapper;
import com.zl.bs.service.TeacherService;
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
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public int updateByTeaId(Teacher teacher) {
        return teacherMapper.updateByTeaId(teacher);
    }


}
