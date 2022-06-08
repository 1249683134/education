package com.education.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GameDaoTest {

    @Autowired
    private GameDao gameDao;

    @Test
    void testGetById(){
        System.out.println(gameDao.selectById(333));
    }

    @Test
    void testGetAll(){
        gameDao.selectList(null);
    }


}