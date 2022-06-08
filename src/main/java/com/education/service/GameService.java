package com.education.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.education.domain.Game;
import com.education.domain.Home;

public interface GameService extends IService<Game> {
    //插入
    boolean saveGame(Game game);

    //更新
    boolean modfiyGame(Game game);

    //删除
    boolean deleteGame(String id);
}
