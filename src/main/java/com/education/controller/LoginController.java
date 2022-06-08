package com.education.controller;

import com.education.controller.utils.R;
import com.education.domain.Users;
import com.education.service.UserInfoService;
import com.education.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//表现层 登录
@RestController
@RequestMapping("edu/login")
public class LoginController {
    @Autowired
    private UsersService usersService;

    @Autowired
    private UserInfoService userInfoService;

    @PostMapping
    public R check(@RequestBody Users user){
        return new R(usersService.checkAccount(user));
    }
}
