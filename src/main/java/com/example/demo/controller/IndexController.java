package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api("各形式的测试接口")
@RestController
//解决了前后端跨域问题
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
public class IndexController {

    // @RequestMapping 来映射请求，也就是通过它来指定控制器可以处理哪些URL请求，相当于Servlet中在web.xml中配置
    @RequestMapping("index")
    @ApiOperation("返回字符测试")
    public String index(){
        return "csy";
    }

    @RequestMapping("result")
    @ApiOperation("返回JSON测试")
    public String reJson(){
        JSONObject result = new JSONObject();
        result.put("name","陈老师");
        result.put("info","周老师好");
        return result.toJSONString();
    }
//    測試端口
    @RequestMapping(value = "login")
    @ApiOperation("JSON互传测试")
    public String login(@RequestBody JSONObject jsonParam){
        //打印JSON数据
        System.out.println(jsonParam.toJSONString());
        return jsonParam.toJSONString();

    }
}
