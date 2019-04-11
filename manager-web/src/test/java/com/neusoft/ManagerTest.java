package com.neusoft;

import com.neusoft.mapper.UserMapper;
import com.neusoft.pojo.User;
import com.neusoft.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationConext-*.xml")
public class ManagerTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    @Test
    public void insertUserTest() {
        /*User user = new User();
        user.setUserName("linruqing");
        user.setUserAge(34);
        userMapper.insertUser(user);*/

    }
    @Test
    public void beanTest() {
       System.out.println(userService);

    }
}
