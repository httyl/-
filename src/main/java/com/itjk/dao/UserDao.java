package com.itjk.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itjk.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select * from user")
    public List<User> getAll();

    @Select("select * from user limit #{pageNum},#{pageSize}")
    List<User> selectPage(Integer pageNum,Integer pageSize);

    @Select("select * from user where id = #{id}")
    public User getById(Integer id);

    @Select("select count(*) from user")
    Integer selectPageTotal();
}
