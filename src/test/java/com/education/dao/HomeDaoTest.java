package com.education.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HomeDaoTest {

    @Autowired
    private HomeDao homeDao;

    @Test
    void testGetById(){
        System.out.println(homeDao.selectById(1000));
    }

    @Test
    void testGetAll(){
        homeDao.selectList(null);
    }


}