package com.education.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GameServiceTest {
    @Autowired
    private GameService gameService;

    @Test
    void testGetById(){
        gameService.getById(333);
    }

    @Test
    void testGetAll(){
        gameService.list();
    }
}
