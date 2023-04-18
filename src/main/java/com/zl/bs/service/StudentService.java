package com.zl.bs.service;

import com.zl.bs.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zl
 * @since 2023-04-05
 */
@Service
public interface StudentService extends IService<Student> {

    boolean deleteByStuId(String stuId);

    int updateByStuId(Student student);

    List<Student> findAllStu();
}
