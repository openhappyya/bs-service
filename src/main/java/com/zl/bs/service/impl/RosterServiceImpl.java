package com.zl.bs.service.impl;

import com.zl.bs.entity.Roster;
import com.zl.bs.mapper.RosterMapper;
import com.zl.bs.service.RosterService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zl
 * @since 2023-04-15
 */
@Service
public class RosterServiceImpl extends ServiceImpl<RosterMapper, Roster> implements RosterService {

    @Autowired
    RosterMapper rosterMapper;

    @Override
    public List<Roster> findAll() {
        List<Roster> list = rosterMapper.findAll();
//        System.out.println(list);

//        list.forEach(item -> System.out.println(item.getId()));
        return list;
    }

    @Override
    public int updateByGuid(Roster roster) {
        return rosterMapper.updateByGuid(roster);
    }
}
