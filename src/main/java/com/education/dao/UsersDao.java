package com.education.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.education.domain.Users;
import org.apache.ibatis.annotations.Mapper;

//数据层开发
@Mapper
public interface UsersDao extends BaseMapper<Users> {
}
