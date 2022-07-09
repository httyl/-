package com.itjk.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

import com.itjk.service.IUserService;
import com.itjk.entity.User;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author baomidou
 * @since 2022-07-09
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    //增,改
    @PostMapping
    public boolean UserSave(@RequestBody User user){
    return userService.saveOrUpdate(user);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return userService.removeById(id);
    }

    @GetMapping
    public List<User> findAll() {
        return userService.list();
    }

    @GetMapping("/{id}")
    public User findOne(@PathVariable Integer id) {
        return userService.getById(id);
    }

    @GetMapping("/page")
    public Page<User> findPage(@RequestParam Integer pageNum,
                               @RequestParam Integer pageSize,
                               @RequestParam(defaultValue = "") String username,
                               @RequestParam(defaultValue = "") String address,
                               @RequestParam(defaultValue = "") String email ) {
        IPage<User> page = new Page<>(pageNum,pageSize);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        System.out.println("被执行");
        queryWrapper.like("username",username);//模糊查询
        queryWrapper.like("email",email);
        queryWrapper.like("address",address);
        queryWrapper.orderByDesc("id");
        return userService.page(new Page<>(pageNum, pageSize),queryWrapper);
    }


    @DeleteMapping("/del/batch")
    public boolean deletebatchid(@RequestBody List<Integer> ids) {
        return userService.removeBatchByIds(ids);
    }
}

