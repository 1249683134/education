package com.education.service;

import com.education.domain.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
public class UserInfoServiceTest {
    @Autowired
    private UserInfoService userInfoService;

    @Test
    void testGetById(){
        userInfoService.getById(111);
    }

    @Test
    void testGetAll(){
        userInfoService.list();
    }

    @Test
    void testSave(){
        UserInfo userInfo = new UserInfo();
        userInfo.setId("test");
        userInfo.setName("test");
        userInfo.setSex("男");

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");//注意月和小时的格式为两个大写字母
        Date date = new Date();//获得当前时间
        String birthday = df.format(date);//将当前时间转换成特定格式的时间字符串，这样便可以插入到数据库中

        userInfo.setBirthday(birthday);
        userInfo.setState(1);
        System.out.println(userInfoService.saveUserInfo(userInfo));
    }

    @Test
    void testUpdate(){
        UserInfo userInfo = new UserInfo();
        userInfo.setId("test");
        userInfo.setName("test-update");
        userInfo.setSex("女");
        System.out.println(userInfoService.modfiyUserInfo(userInfo));
    }

    @Test
    void testDelete(){
        System.out.println(userInfoService.deleteUserInfo("test"));
    }
}
