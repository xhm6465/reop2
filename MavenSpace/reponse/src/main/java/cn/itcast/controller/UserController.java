package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLDecoder;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 返回String
     * @param model
     * @return
     */
    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString方法执行了...");
        User user = new User();
        user.setAge(19);
        user.setUsername("lisi");
        user.setPassword("123");
        model.addAttribute(user);
        return "success";
    }

    /**
     * 是void
     *
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //默认到testvoid这个页面
        //使用request转发
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //使用response重定向
        response.sendRedirect(request.getContextPath()+"/index.jsp");
//        System.out.println("testVoid方法执行了...");
//        response.setCharacterEncoding("utf-8");
//        response.setContentType("text/html");
//        response.getWriter().write("你好");
        return;
    }

    /**
     * 返回ModelAndView
     * @return
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setAge(19);
        user.setUsername("lisi");
        user.setPassword("123");
        modelAndView.addObject("user",user);
        modelAndView.setViewName("success");
        System.out.println("testModelAndView方法执行了...");
        return modelAndView;
    }

    /**
     * 使用关键字的方式进行转发或者重定向
     * @return
     */
    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect(HttpServletRequest request){
        System.out.println("testForwardOrRedirect方法执行了...");
//        return "forward:/WEB-INF/pages/success.jsp";
        return "redirect:/index.jsp";
    }


//    /**
//     * 模拟异步请求响应
//     */
//    @RequestMapping("/testAjax")
//    public @ResponseBody User testAjax(@RequestBody User user){
//        user.setUsername("lisi");
//
//       return user;
//    }
    /**
     * 模拟异步请求响应
     */
//    @RequestMapping("/testAjax")
//    public @ResponseBody User testAjax(@RequestBody User user){
////      user.setUsername("lisi");
//        System.out.println(user);
//        return user;
//    }

    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(User user){
//      user.setUsername("lisi");
//        System.out.println(str+"----");
//        String decode = URLDecoder.decode(str);
//        User user = new User();
//        user.setUsername(decode);
//        System.out.println(decode);
        return user;
    }
}














