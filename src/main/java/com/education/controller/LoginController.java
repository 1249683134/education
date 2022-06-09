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

    //验证登录
    @GetMapping
    public R enter(@RequestBody Users user){
        if (usersService.checkAccount(user)){
            int state = userInfoService.stateUserInfo(user.getId());
            if (state==1){
                return new R(true,"家长",null);
            }else{
                return new R(true,"孩子",null);
            }
        }else{
            return new R(false,"请检查账号和密码",null);
        }
    }
}
