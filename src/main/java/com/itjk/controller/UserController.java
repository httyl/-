package com.itjk.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itjk.dao.UserDao;
import com.itjk.dao.UserDao1;
import com.itjk.domain.User;
import com.itjk.service.UserService;
import com.itjk.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserServiceImpl userServiceimpl;

    @Autowired
    private UserDao1 userDao1;
    //增
    @PostMapping
    public void UserSave(@RequestBody User user){
        int insert = userDao1.insert(user);
        System.out.println("chengg");
    }
    //删除
    @DeleteMapping("/{id}")
    public boolean UserDele(@PathVariable Integer id){
        int i = userDao1.deleteById(id);
        return true;
    }
    //增加数据
    @PutMapping
    public void update(@RequestBody User user) {
        int i = userDao1.updateById(user);
    }

    //h根据id查询
   @GetMapping("/{id}")
    public User SelectById(@PathVariable Integer id){
        User user =  userDao1.selectById(id);
      return user;
    }

    //查询全部
    @GetMapping("/all1")
    public Result getAll1() {
        List<User> UserList = userDao1.selectList(null);
        Integer code = UserList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = UserList != null ? "数据传入成功" : "数据查询失败，请重试！";
        System.out.println(UserList);
        return new Result(null,UserList,null);
    }

    //分页查询 mybatis-
    @CrossOrigin
    @GetMapping("/page")
    public IPage<User> GetByPage(@RequestParam Integer pageNum,
                                 @RequestParam Integer pageSize,
                                 @RequestParam(defaultValue = "") String username,
                                 @RequestParam(defaultValue = "") String nickname,
                                 @RequestParam(defaultValue = "") String email
                                 ){
        IPage<User> page = new Page<>(pageNum,pageSize);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        System.out.println("被执行");
        queryWrapper.like("username",username);//模糊查询
        queryWrapper.like("username",nickname);
        queryWrapper.like("username",email);

        //queryWrapper.like(Strings.isNotEmpty(username),"username",username);
        return userServiceimpl.page(page,queryWrapper);

    }

    /*@GetMapping
    public List<User> ceshi() {
        List<User> UserList = userDao1.selectList(null);
        System.out.println(UserList);
        return UserList;
    }*/
    //[User(id=1, username=lisi, password=123456, nickname=三铁, email=123@qq.com, phone=1234567890, address=翻斗花园),
    // User(id=2, username=wangwu, password=123456, nickname=饲养, email=dda@qq.com, phone=123948290, address=你擦尽快)]
}
