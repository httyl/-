package com.itjk;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/*import com.itjk.dao.UserDao;
import com.itjk.dao.UserDao1;
import com.itjk.domain.User;
import com.itjk.service.UserService;*/
import com.itjk.entity.User;
import com.itjk.mapper.UserMapper;
import com.itjk.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@SpringBootTest
class SpringBootProjectApplicationTests {
   /* @Autowired
    private UserService userService;
    @Autowired
    private UserDao1 userDao1;

    @Autowired
    private UserDao userDao;

    @Test
    void selectAll() {
        List<User> userList = userDao.getAll();
        System.out.println(userList);
    }

    @Test
    void selectAll1() {
        List<User> userList = userDao1.selectList(null);
        System.out.println(userList);
    }

    //分页查询
    @Test
    public void testGetByPage(){
        //配置mybatis拦截器
        Page<User> page = new Page(1,2);
        userDao1.selectPage(page,null);
        System.out.println("当前页码值: "+page.getCurrent());
        System.out.println("一共多少页: "+page.getPages());
        System.out.println("每页显示多少条: "+page.getSize());
        System.out.println("一共多少条数据: "+page.getTotal());
        System.out.println("数据: "+page.getRecords());
        System.out.println("--------------------");
        //System.out.println(page.);
    }

    @Test
    public void FindById(){
        User user = userDao.getById(2);
        System.out.println(user);
    }

    @Test
    public void da(){
        List<User> userList = userDao.selectPage(1, 2);
        System.out.println(userList);
    }

    @Test
    public void dada(){
        Integer integer = userDao.selectPageTotal();
        System.out.println(integer);
    }*/
    @Autowired
   private UserServiceImpl userService;
    @Autowired
    private UserMapper userMapper;
    @Test
    public void dad(){
        User user = new User();
        user.setUsername("黑吗");
        user.setPassword("itjk");
        user.setPhone("12");
        userMapper.insert(user);
    }
}
