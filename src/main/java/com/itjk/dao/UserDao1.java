package com.itjk.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itjk.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao1 extends BaseMapper<User> {
}
