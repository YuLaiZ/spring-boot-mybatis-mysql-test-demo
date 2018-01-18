package com.yulaiz.test.demo.web.service;

import com.yulaiz.test.demo.web.dao.TestMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by YuLai on 2018/1/17.
 */
@Service
@Slf4j
public class TestService {

    @Autowired
    private TestMapper testMapper;


    public String test(String name){
        log.info(name + testMapper.getTest());
        return name + testMapper.getTest();
    }
}
