package com.education.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.education.domain.Home;

public interface HomeService extends IService<Home> {
    //插入
    boolean saveHome(Home home);

    //更新
    boolean modfiyHome(Home home);

    //删除
    boolean deleteHome(String id);
}
