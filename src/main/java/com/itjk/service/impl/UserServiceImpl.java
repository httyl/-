package com.itjk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itjk.dao.UserDao;
import com.itjk.dao.UserDao1;
import com.itjk.domain.User;
import com.itjk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl extends ServiceImpl<UserDao1,User> {

    public boolean saveUser(User user){
        /*if (user.getId()==null){
            return save(user);
        }else {
            return updateById(user);
        }*/
        return  saveOrUpdate(user);
    }
/*    @Autowired
    private UserDao userDao;
    public List<User> getAll() {
        return userDao.getAll();
    }
    public List<User> selectPage(Integer pageName, Integer pageSize) {
        return userDao.selectPage(pageName,pageSize);
    }*/
}