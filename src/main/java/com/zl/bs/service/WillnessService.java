package com.zl.bs.service;

import com.zl.bs.entity.Willness;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zl
 * @since 2023-04-16
 */
@Service
public interface WillnessService extends IService<Willness> {
    Boolean makeRoster();
}
