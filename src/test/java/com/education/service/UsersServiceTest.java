package com.education.service;

import com.education.domain.Users;
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

    @Test
    void testSave(){
        Users users = new Users();
        users.setId("test");
        users.setPassword("test");
        System.out.println(usersService.saveUsers(users));
    }

    @Test
    void testDelete(){
        System.out.println(usersService.deleteUsers("test"));
    }

    @Test
    void testUpdate(){
        Users users = new Users();
        users.setId("test");
        users.setPassword("test-update");
        System.out.println(usersService.modfiyUsers(users));
    }
}
