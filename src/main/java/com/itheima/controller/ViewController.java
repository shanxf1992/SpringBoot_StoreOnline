package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("view")
public class ViewController {

    public ViewController() {
        System.out.println("ViewController 初始化完成... ...");
    }

    @RequestMapping("{pageName}")
    public String tansfor(@PathVariable("pageName") String pageName) {
        return pageName;
    }

}
