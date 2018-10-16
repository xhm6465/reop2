import com.itheima.domain.User;
import com.itheima.service.impl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.util.List;

public class test {
    public static void main(String[] args) {
    //使用创建容器加载beans.xml 加载同时xml中的对象也都被创建了 bean标签中的scope未设置成prototype
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl userService=null;
        //从容器中获取userservice键名指向的对象
//        UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        //调用方法


        List<User> users = userService.saveUser();
        System.out.println(users);
    }
}
