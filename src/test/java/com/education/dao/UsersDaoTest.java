package com.education.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.education.domain.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UsersDaoTest {

    @Autowired
    private UsersDao usersDao;

    //根据ID查询
    @Test
    void testGetById(){
        System.out.println(usersDao.selectById(111));
    }

    //查询全部
    @Test
    void testGetAll(){
       usersDao.selectList(null);
    }

    //插入数据
    @Test
    void testSave(){
        Users users = new Users();
        users.setId("666");
        users.setPassword("666");
        System.out.println(usersDao.insert(users));
    }

    @Test
    void checkAccount() {
        String id = "111";
        String psw = "111";
        QueryWrapper<Users> wrapper = new QueryWrapper<>();
        wrapper.eq("id",id).eq("password",psw);
        usersDao.selectList(wrapper).forEach(System.out::println);

    }
}
