<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/1
  Time: 1:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="js/jquery.min.js"></script>

    <script>
        // 页面加载，绑定单击事件
        $(function(){
            $("#btn").click(function(){
                // alert("hello btn");
                // 发送ajax请求
                $.ajax({
                    // 编写json格式，设置属性和值
                    url:"user/testAjax",
                    // contentType:"application/json;charset=UTF-8",
                    contentType:"application/x-www-form-urlencoded",
                    // data:'{"username":"hehe","password":"123","age":30}',
                    data:"username=hehe&&password=123&&age=30",
                    dataType:"json",
                    type:"post",
                    success:function(data){
                        // data服务器端响应的json的数据，进行解析
                        alert(data);
                        alert(data.username);
                        alert(data.password);
                        alert(data.age);
                        alert(JSON.stringify(data));
                    }
                });

            });
        });

    </script>

</head>
<body>

    <h3>练习一</h3>

    <a href="user/testString" >点击这个，通过返回字符串跳到success, 并携带用户名和密码到页面显示</a>

    <br/>

    <a href="user/testVoid" >点击这个，通过返回void, 直接在面面显示 你好！ </a>

    <br/>

    <a href="user/testModelAndView" >点击这个，通过返回ModelAndView跳到success, 并携带用户名和密码到页面显示</a>

    <br/>

    <a href="user/testForwardOrRedirect" >点击这个，通过返回字符串，重定向到index.jsp</a>

    <br/>



    <h3>练习二</h3>


    <button id="btn">发送ajax的请求</button>

</body>
</html>
