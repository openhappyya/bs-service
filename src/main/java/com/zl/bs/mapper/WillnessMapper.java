package com.zl.bs.mapper;

import java.util.List;
import com.zl.bs.entity.Roster;
import com.zl.bs.entity.Student;
import com.zl.bs.entity.Willness;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zl
 * @since 2023-04-16
 */
@Mapper
public interface WillnessMapper extends BaseMapper<Willness> {
    @Select("select guid,stu_id from willness where stu_id = #{id}")
    List<Willness> findItem(@Param("id")String id);


}
