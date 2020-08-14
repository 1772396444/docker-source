package com.docker.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: C-aranlism create by 2020/8/14.
 * @Version 1.0
 * @Parm request
 * @Description
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "Hello DaoCould";
    }

    @RequestMapping("/index2")
    public String index2(){
        return "这是测试自动构建的版本";
    }

}
