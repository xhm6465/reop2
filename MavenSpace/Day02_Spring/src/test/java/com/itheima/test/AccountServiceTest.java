package com.itheima.test;

import com.itheima.dao.IUserDao;
import com.itheima.domain.Account;
import com.itheima.Config;
import com.itheima.domain.User;
import com.itheima.service.IAccountService;
import com.itheima.service.IUserService;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Field;
import java.util.List;

/**
 * 使用Junit单元测试：测试我们的配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class AccountServiceTest {
//    @Before
//    public void init(){
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        accountService = (IAccountService)context.getBean("accountService");
//    }
//    @Before
//    public void init() throws IllegalAccessException {
//        //获取该类的字节码对象
//        Class<? extends AccountServiceTest> aClass = this.getClass();
//        Field[] declaredFields = aClass.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            if (declaredField!=null){
//                Autowired autowired = declaredField.getAnnotation(Autowired.class);
//                if (autowired!=null) {
//                    declaredField.setAccessible(true);
//                    Class<?> type = declaredField.getType();
//                    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//                    Object bean = context.getBean(type);
//                    declaredField.set(this, bean);
//                }
//            }
//        }
//    }


    @Autowired
    private IAccountService accountService;
    @Autowired
    private IUserService userService;

    @Test
    public void testUser(){
        List<User> users = userService.saveUser();
        System.out.println("第一次");
        System.out.println(users);
    }
    @Test
    public void testUser1(){
        List<User> users = userService.saveUser();
        System.out.println("第二次");
        System.out.println(users);
    }
    @Test
    public void testFindAll() {
        List<Account> accounts = accountService.findAllAccount();
        for(Account account : accounts){
            System.out.println(account);
        }

        Account account = accountService.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testFindOne() {
        Account account = accountService.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("test");
        account.setMoney(12345f);
        accountService.saveAccount(account);
    }

    @Test
    public void testUpdate() {
        Account account = accountService.findAccountById(3);
        account.setMoney(23456f);
        accountService.updateAccount(account);
    }

    @Test
    public void testDelete() {
        accountService.deleteAccount(4);
    }
}
