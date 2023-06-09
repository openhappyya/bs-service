package com.zl.bs.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.zl.bs.service.LeaveService;
import com.zl.bs.entity.Leave;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zl
 * @since 2023-04-05
 */
@Controller
@RequestMapping("/leave")
public class LeaveAction {


    @Autowired
    private LeaveService leaveService;

    @GetMapping(value = "/")
    public ResponseEntity<Page<Leave>> list(@RequestParam(required = false) Integer current, @RequestParam(required = false) Integer pageSize) {
        if (current == null) {
            current = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        Page<Leave> aPage = leaveService.page(new Page<>(current, pageSize));
        return new ResponseEntity<>(aPage, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Leave> getById(@PathVariable("id") String id) {
        return new ResponseEntity<>(leaveService.getById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> create(@RequestBody Leave params) {
        leaveService.save(params);
        return new ResponseEntity<>("created successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        leaveService.removeById(id);
        return new ResponseEntity<>("deleted successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<Object> update(@RequestBody Leave params) {
        leaveService.updateById(params);
        return new ResponseEntity<>("updated successfully", HttpStatus.OK);
    }
}
