package com.zl.bs.service.impl;

import com.zl.bs.entity.Log;
import com.zl.bs.mapper.LogMapper;
import com.zl.bs.service.LogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zl
 * @since 2023-04-08
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService {

}
