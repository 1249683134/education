package com.education.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HomeServiceTest {

    @Autowired
    private HomeService homeService;

    @Test
    void testGetById(){
        homeService.getById(1000);
    }

    @Test
    void testGetAll(){
        homeService.list();
    }
}
