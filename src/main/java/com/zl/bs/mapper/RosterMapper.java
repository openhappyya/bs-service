package com.zl.bs.mapper;

import com.zl.bs.entity.Roster;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zl
 * @since 2023-04-15
 */
@Mapper
public interface RosterMapper extends BaseMapper<Roster> {
    @Select("select * from work_roster")
    List<Roster> findAll();

    @Update("update work_roster set stu = #{roster.stu}  where guid = #{roster.guid}")
    int updateByGuid(@Param("roster") Roster roster);
}
