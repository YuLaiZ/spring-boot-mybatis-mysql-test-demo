package com.yulaiz.test.demo.web.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by YuLai on 2018/1/17.
 */
@Mapper
@Repository
public interface TestMapper {

    String getTest();
}
