package com.education.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserInfoDaoTest {

    @Autowired
    private UserInfoDao userInfoDao;

    @Test
    void testGetById(){
        System.out.println(userInfoDao.selectById(111));
    }

    @Test
    void testGetAll(){
        userInfoDao.selectList(null);
    }


}
