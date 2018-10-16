package com.itheima;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.print.attribute.standard.MediaSize;
import java.io.IOException;
import java.io.InputStream;
@Component
public class FactoryBuilder {

//    SqlSessionFactory factory =null;

//    public FactoryBuilder() throws IOException {
//        //放在构造函数里的原因是
//        // 构造函数只有在spring读取配置文件时才会使用一次,写到这里可以避免调用build方法时重复创建factory
//    }
//    @Bean(name = "build")
//    public SqlSessionFactory build() throws IOException {
//        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory factory = builder.build(inputStream);
//        return factory;
//    }

}
