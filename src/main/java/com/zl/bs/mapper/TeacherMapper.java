package com.zl.bs.mapper;

import com.zl.bs.entity.Teacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zl
 * @since 2023-04-19
 */
@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {

    @Update("update teacher set login_state = #{teacher.loginState} where teacher_id = #{teacher.teacherId}")
    int updateByTeaId(@Param("teacher") Teacher teacher);

    @Update("update teacher set roster_comfirm = #{teacher.rosterComfirm} where teacher_id = #{teacher.teacherId}")
    int updateComfirmByTeaId(@Param("teacher") Teacher teacher);

}
