package com.itheima.factory;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class ProxyFactory <T>{
    //代理对象时如何创建的
    private SqlSessionFactory factory;
    private Class<T> type;

    public ProxyFactory(SqlSessionFactory factory, Class<T> type) {
        this.factory = factory;
        this.type = type;
    }

    public T getMapper(){
        SqlSession sqlSession = factory.openSession();
        T mapper = sqlSession.getMapper(type);
        return mapper;
    }
}
