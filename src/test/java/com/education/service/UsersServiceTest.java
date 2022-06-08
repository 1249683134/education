package com.education.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.education.dao.UsersDao;
import com.education.domain.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UsersServiceTest {

    @Autowired
    private UsersService usersService;

    @Autowired
    private UsersDao usersDao;

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

    @Test
    void checkAccount() {
        String id = "111";
        String psw = "111";
        QueryWrapper<Users> wrapper = new QueryWrapper<>();
        wrapper.eq("id",id).eq("password",psw);
        usersDao.selectList(wrapper).forEach(System.out::println);
        Users users = usersDao.selectOne(wrapper);
        System.out.println(users!=null);
    }
}
