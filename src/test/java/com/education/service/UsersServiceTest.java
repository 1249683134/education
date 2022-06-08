package com.education.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UsersServiceTest {

    @Autowired
    private UsersService usersService;

    @Test
    void testGetById(){
        usersService.getById(111);
    }

    @Test
    void testGetAll(){
        usersService.list();
    }
}
