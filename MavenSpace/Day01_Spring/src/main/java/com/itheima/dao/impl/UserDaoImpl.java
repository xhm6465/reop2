package com.itheima.dao.impl;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("userDao")
public class UserDaoImpl {
    private SqlSessionFactory build;
    public void setBuild(SqlSessionFactory factory) {
        this.build = factory;
    }

    public List<User> saveUser() {
        SqlSession sqlSession = build.openSession();
        List<User> users = sqlSession.selectList("com.itheima.dao.IUserDao.saveUser");
//        com.mchange.v2.c3p0.ComboPooledDataSource
//        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        return users;
    }
}
