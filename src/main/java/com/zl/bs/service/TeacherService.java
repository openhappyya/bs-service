package com.zl.bs.service;

import com.zl.bs.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zl
 * @since 2023-04-05
 */
@Service
public interface TeacherService extends IService<Teacher> {
    int updateByTeaId(Teacher teacher);
}
