package com.education.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.education.dao.GameDao;
import com.education.domain.Game;
import com.education.service.GameService;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl extends ServiceImpl<GameDao, Game> implements GameService {
}
