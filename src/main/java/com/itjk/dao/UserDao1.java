package com.itjk.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itjk.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao1 extends BaseMapper<User> {
    void page(IPage<User> page, QueryWrapper<User> queryWrapper);
}
