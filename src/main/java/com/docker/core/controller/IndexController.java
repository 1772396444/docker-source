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

}
