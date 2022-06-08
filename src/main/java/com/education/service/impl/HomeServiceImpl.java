package com.education.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.education.dao.HomeDao;
import com.education.domain.Home;
import com.education.service.HomeService;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl extends ServiceImpl<HomeDao, Home> implements HomeService {
}
