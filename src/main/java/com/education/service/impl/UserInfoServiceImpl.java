package com.education.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.education.dao.UserInfoDao;
import com.education.domain.UserInfo;
import com.education.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoDao, UserInfo> implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public boolean saveUserInfo(UserInfo userInfo) {
        return userInfoDao.insert(userInfo) > 0;
    }

    @Override
    public boolean modfiyUserInfo(UserInfo userInfo) {
        return userInfoDao.updateById(userInfo) > 0;
    }

    @Override
    public boolean deleteUserInfo(String id) {
        return userInfoDao.deleteById(id) > 0;
    }

    //查询身份
    @Override
    public int stateUserInfo(String id) {
        QueryWrapper<UserInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("id",id);
        UserInfo userInfo = userInfoDao.selectOne(wrapper);
        return userInfo.getState();
    }


}
