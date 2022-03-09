package com.example.demo.pojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("课程信息")
public class CourseInfo {
    @ApiModelProperty("课程ID")
    private Integer courseid;

    @ApiModelProperty("课程编号")
    private String courseno;

    @ApiModelProperty("课程名称")
    private String coursename;

    @ApiModelProperty("任课教师")
    private String courseteacher;

    @ApiModelProperty("课程图片")
    private String courseimage;

}
