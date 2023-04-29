package com.zl.bs.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zl.bs.entity.Result;
import com.zl.bs.mapper.ResultMapper;
import com.zl.bs.mapper.RosterMapper;
import com.zl.bs.mapper.WillnessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/restart")
public class restartAction {
    @Autowired
    RosterMapper rosterMapper;

    @Autowired
    WillnessMapper willnessMapper;

    @Autowired
    ResultMapper resultMapper;

    @GetMapping(value = "/")
    public ResponseEntity<Object> list(@RequestParam(required = false) Integer current, @RequestParam(required = false) Integer pageSize) {
        rosterMapper.deleteAll();
        willnessMapper.deleteAll();
        resultMapper.deleteAll();
        return new ResponseEntity<>("success!", HttpStatus.OK);
    }
}
