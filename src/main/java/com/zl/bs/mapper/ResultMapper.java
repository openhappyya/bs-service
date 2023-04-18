package com.zl.bs.mapper;

import com.zl.bs.entity.Result;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zl
 * @since 2023-04-18
 */
@Mapper
public interface ResultMapper extends BaseMapper<Result> {
    @Insert("INSERT INTO result VALUES(#{workId},#{stuId})")
    Boolean insertItem(@Param("workId")  String workId, @Param("stuId") String stuId);
}
