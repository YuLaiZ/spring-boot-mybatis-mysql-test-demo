package com.yulaiz.test.demo.web.controller;

import com.yulaiz.test.demo.web.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YuLai on 2018/1/17.
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public String test(String name) {
        System.out.println(name);
        return testService.test(name);
    }
}
