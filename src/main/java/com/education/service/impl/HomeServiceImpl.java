package com.education.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.education.dao.HomeDao;
import com.education.domain.Home;
import com.education.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl extends ServiceImpl<HomeDao, Home> implements HomeService {

    @Autowired
    private HomeDao homeDao;

    @Override
    public boolean saveHome(Home home) {
        return homeDao.insert(home) > 0;
    }

    @Override
    public boolean modfiyHome(Home home) {
        return homeDao.updateById(home) > 0;
    }

    @Override
    public boolean deleteHome(String id) {
        return homeDao.deleteById(id) > 0;
    }
}
