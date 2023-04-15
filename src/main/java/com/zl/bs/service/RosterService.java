package com.zl.bs.service;

import com.zl.bs.entity.Roster;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zl
 * @since 2023-04-15
 */
public interface RosterService extends IService<Roster> {
    List<Roster> findAll();
}
