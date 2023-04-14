package com.zl.bs.mapper;

import com.zl.bs.entity.Tick;
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
 * @since 2023-04-13
 */
@Mapper
public interface TickMapper extends BaseMapper<Tick> {
    @Update("update stu_tick set work_hours = #{tick.workHours}, tick_times = #{tick.tickTimes} where stu_id = #{tick.stuId} and time_string = #{tick.timeString}")
    int updateByIdAndDate(@Param("tick") Tick tick);
}
