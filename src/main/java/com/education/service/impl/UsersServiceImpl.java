package com.education.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.education.dao.UsersDao;
import com.education.domain.Users;
import com.education.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl extends ServiceImpl<UsersDao, Users> implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Override
    public boolean saveUsers(Users users) {
        return usersDao.insert(users) > 0;
    }

    @Override
    public boolean modfiyUsers(Users users) {
        return usersDao.updateById(users) > 0;
    }

    @Override
    public boolean deleteUsers(String id) {
        return usersDao.deleteById(id) > 0;
    }
}
