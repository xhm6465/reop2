package com.itheima.factory;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class FactoryBuilder {
    SqlSessionFactory factory =null;
    public FactoryBuilder() throws IOException {
        //放在构造函数里的原因是
        // 构造函数只有在spring读取配置文件时才会使用一次,写到这里可以避免调用build方法时重复创建factory
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(inputStream);
    }

    public SqlSessionFactory build() {
        return factory;
    }

}
