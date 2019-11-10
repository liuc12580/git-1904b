package com.liuc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/")
    public void test(){
        System.out.println("双11活动");
        System.out.println("清仓大促销，跳楼价999");
        System.out.println("双11，睡觉");
    }

}
