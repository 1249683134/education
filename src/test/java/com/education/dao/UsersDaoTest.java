package com.education.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UsersDaoTest {

    @Autowired
    private UsersDao usersDao;

    @Test
    void testGetById(){
        System.out.println(usersDao.selectById(7878));
    }

    @Test
    void testGetAll(){
       usersDao.selectList(null);
    }
}
