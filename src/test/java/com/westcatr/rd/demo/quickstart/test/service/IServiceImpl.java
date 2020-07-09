package com.westcatr.rd.demo.quickstart.test.service;

import com.westcatr.rd.demo.quickstart.test.user.User3;
import org.springframework.stereotype.Service;

/**
 * @author xieshuang
 * @date 2020-07-08 9:44
 */
@Service
public class IServiceImpl implements IService {


    @Override
    public void test() {
        System.out.println("6666");
    }

    @Override
    public User3 get(Integer in) {
        User3 user3 = new User3();
        user3.setId(in*10);
        user3.setName("test");
        user3.setDept("测试部门");
        user3.setAge(111);
        return user3;
    }

    @Override
    public Integer get(int in) {
        return null;
    }
}
