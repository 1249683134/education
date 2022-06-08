package com.education.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.education.domain.UserInfo;

public interface UserInfoService extends IService<UserInfo> {
    //插入
    boolean saveUserInfo(UserInfo userInfo);

    //更新
    boolean modfiyUserInfo(UserInfo userInfo);

    //删除
    boolean deleteUserInfo(String id);

}
