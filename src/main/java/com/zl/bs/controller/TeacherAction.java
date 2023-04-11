package com.zl.bs.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.zl.bs.service.TeacherService;
import com.zl.bs.entity.Teacher;
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
@RequestMapping("/teacher")
public class TeacherAction {


    @Autowired
    private TeacherService teacherService;

    @GetMapping(value = "/")
    public ResponseEntity<Page<Teacher>> list(@RequestParam(required = false) Integer current, @RequestParam(required = false) Integer pageSize) {
        if (current == null) {
            current = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        Page<Teacher> aPage = teacherService.page(new Page<>(current, pageSize));
        return new ResponseEntity<>(aPage, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Teacher> getById(@PathVariable("id") String id) {
        return new ResponseEntity<>(teacherService.getById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> create(@RequestBody Teacher params) {
        teacherService.save(params);
        return new ResponseEntity<>("created successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        teacherService.removeById(id);
        return new ResponseEntity<>("deleted successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<Object> update(@RequestBody Teacher params) {
//        teacherService.updateById(params);
        teacherService.updateByTeaId(params);
        Page<Teacher> aPage = teacherService.page(new Page<>(1, 10));
        return new ResponseEntity<>(aPage, HttpStatus.OK);
    }
}
