package com.education.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.education.domain.Game;
import org.apache.ibatis.annotations.Mapper;

//数据层
@Mapper
public interface GameDao extends BaseMapper<Game> {
}
