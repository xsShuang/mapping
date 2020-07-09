package com.westcatr.rd.demo.quickstart.test.service;

import com.westcatr.rd.demo.quickstart.test.user.User3;

/**
 * @author xieshuang
 * @date 2020-07-08 9:42
 */
public interface IService {

    void test();

    User3 get(Integer in);

    Integer get(int in);
}
