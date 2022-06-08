package com.education.service;

import com.education.domain.Home;
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

    @Test
    void testSave(){
        Home home = new Home();
        home.setHome_id("111");
        home.setHome_password("test");
        home.setHome_name("test");
        System.out.println(homeService.saveHome(home));
    }

    @Test
    void testUpdate(){
        Home home = new Home();
        home.setHome_id("111");
        home.setHome_password("test-update");
        home.setHome_name("test-update");
        System.out.println(homeService.modfiyHome(home));
    }

    @Test
    void testDelete(){
        System.out.println(homeService.deleteHome("111"));
    }
}
