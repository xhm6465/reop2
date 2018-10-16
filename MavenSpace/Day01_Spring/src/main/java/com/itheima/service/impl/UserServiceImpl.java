package com.itheima.service.impl;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import com.itheima.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements IUserService {
    private IUserDao userDao;

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> saveUser() {
    //调用dao中的方法
        List<User> users = userDao.saveUser();
        return users;
    }
}
