package com.zl.bs.controller;

import com.zl.bs.entity.Roster;
import com.zl.bs.service.RosterService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zl
 * @since 2023-04-15
 */
@Controller
@RequestMapping("/roster")
public class RosterAction {


    @Autowired
    private RosterService rosterService;

    @GetMapping(value = "/")
    public ResponseEntity<Page<Roster>> list(@RequestParam(required = false) Integer current, @RequestParam(required = false) Integer pageSize) {
//        if (current == null) {
//            current = 1;
//        }
//        if (pageSize == null) {
//            pageSize = 10;
//        }
//        Page<Roster> aPage = rosterService.page(new Page<>(current, pageSize));
        System.out.println(rosterService.findAll());
        return new ResponseEntity(rosterService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Roster> getById(@PathVariable("id") String id) {
        return new ResponseEntity<>(rosterService.getById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> create(@RequestBody Roster params) {
        rosterService.save(params);
        return new ResponseEntity<>("created successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        rosterService.removeById(id);
        return new ResponseEntity<>("deleted successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<Object> update(@RequestBody Roster params) {
//        rosterService.updateById(params);
        rosterService.updateByGuid(params);
        return new ResponseEntity<>("updated successfully", HttpStatus.OK);
    }
}
