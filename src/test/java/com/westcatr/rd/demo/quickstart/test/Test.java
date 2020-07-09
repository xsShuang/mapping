package com.westcatr.rd.demo.quickstart.test;

import com.westcatr.rd.demo.quickstart.resolver.MappingResolver;
import com.westcatr.rd.demo.quickstart.test.user.User;
import com.westcatr.rd.demo.quickstart.test.user.User2;
import com.westcatr.rd.demo.quickstart.test.user.User4;
import com.westcatr.rd.demo.quickstart.test.user.User5;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class Test{

    @org.junit.Test
    public void send(){

        User user = new User();
        user.setId(10);
        User2 mapping = new MappingResolver<User2, User>().mapping(user, User2.class);
        System.out.println(mapping);

        User5 user5 = new User5();
        user5.setId(10);
        User4 mapping2 = new MappingResolver<User4, User5>().mapping(user5, User4.class);
        System.out.println(mapping2);
    }
}
