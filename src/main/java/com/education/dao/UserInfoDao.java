package com.education.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.education.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

//数据层
@Mapper
public interface UserInfoDao extends BaseMapper<UserInfo> {
}
