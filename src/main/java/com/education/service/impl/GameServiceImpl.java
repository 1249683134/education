package com.education.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.education.dao.GameDao;
import com.education.domain.Game;
import com.education.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl extends ServiceImpl<GameDao, Game> implements GameService {

    @Autowired
    private GameDao gameDao;


    @Override
    public boolean saveGame(Game game) {
        return gameDao.insert(game) > 0;
    }

    @Override
    public boolean modfiyGame(Game game) {
        return gameDao.updateById(game) > 0;
    }

    @Override
    public boolean deleteGame(String id) {
        return gameDao.deleteById(id) > 0;
    }
}
