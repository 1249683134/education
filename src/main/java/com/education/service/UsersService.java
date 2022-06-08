package com.education.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.education.domain.Users;

public interface UsersService extends IService<Users> {

    //插入
    boolean saveUsers(Users users);

    //更新
    boolean modfiyUsers(Users users);

    //删除
    boolean deleteUsers(String id);

}
