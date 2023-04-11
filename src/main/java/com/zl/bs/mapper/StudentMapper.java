package com.zl.bs.mapper;

import com.zl.bs.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Value;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 
 * @since 2023-04-05
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    @Delete("delete from student where stu_id = #{stuId}")
    boolean deleteByStuId(@Param("stuId") String stuId);

    @Update("update student set stu_name= #{student.stuName}, stu_Department= #{student.stuDepartment}, phone_number=#{student.phoneNumber}, max_work_hours=#{student.maxWorkHours} where stu_id = #{student.stuId}")
    int updateByStuId2(@Param("student") Student student);

    int updateBystuId(Student student);


}
