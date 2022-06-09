package com.education.controller;

import com.education.controller.utils.R;
import com.education.domain.UserInfo;
import com.education.domain.UserTotal;
import com.education.domain.Users;
import com.education.service.UserInfoService;
import com.education.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//表现层 登录
@RestController
@RequestMapping("edu/register")
public class RegisterController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private UserInfoService userInfoService;

    //注册
    @PostMapping
    public R register(@RequestBody UserTotal userTotal) {
        return new R(userInfoService.saveUserInfo(userTotal.getUserInfo()) && usersService.saveUsers(userTotal.getUsers()));
    }


}
