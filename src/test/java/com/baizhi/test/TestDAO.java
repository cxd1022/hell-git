package com.baizhi.test;


import com.baizhi.Application;
import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestDAO {

    @Autowired
    private UserDAO userDAO;

    @Test
    public void testDAO() {
        //userDAO.save(new User(null,"小花花","123456",18));
        List<User> users = userDAO.selectAll();
        for (User user : users) {
            System.out.println(user);
            System.out.println("22222");
        }
    }
}
