package com.education.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.education.domain.Home;
import org.apache.ibatis.annotations.Mapper;

//数据层
@Mapper
public interface HomeDao extends BaseMapper<Home> {
}
