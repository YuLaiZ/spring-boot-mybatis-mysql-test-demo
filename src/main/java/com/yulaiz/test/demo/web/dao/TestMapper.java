package com.yulaiz.test.demo.web.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * Created by YuLai on 2018/1/17.
 */
@Mapper
public interface TestMapper {

    String getTest();
}
