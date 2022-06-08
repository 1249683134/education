package com.education.controller;


import com.education.service.GameService;
import com.education.service.HomeService;
import com.education.service.UserInfoService;
import com.education.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//表现层
@RestController
@RequestMapping("edu1")
public class EduController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private HomeService homeService;

    @Autowired
    private GameService gameService;

}
