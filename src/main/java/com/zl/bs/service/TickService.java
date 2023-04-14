package com.zl.bs.service;

import com.zl.bs.entity.Tick;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zl
 * @since 2023-04-11
 */
@Service
public interface TickService extends IService<Tick> {
    int updateByIdAndDate(Tick tick);
}
