package com.itheima.service;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserService {

    List<User> saveUser();
}
