package com.example.demo.controller;

import com.example.demo.service.ICourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("课程管理")
@RestController
public class CourseController {
    @Autowired
    ICourseService iCourseService;
    @RequestMapping(value = "courseimage")
    @ApiOperation("查询所有课程信息")
    public String findCourseAll(){
        iCourseService.findCourseAll();

        return "t";
    }

}
