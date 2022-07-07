package com.itjk.service;

import com.itjk.domain.User;
import org.apache.catalina.Server;

import java.util.List;

public interface UserService  {
    public List<User> getAll();
    List<User> selectPage(Integer pageName,Integer pageSize);
}
