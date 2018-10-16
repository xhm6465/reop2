<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/1
  Time: 1:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>欢迎来到controller 返回值练习</h3>
<br>
<a href="response.jsp">点击开始练习</a>
<form action="uploadFile/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="uploadFile">
    <input type="submit" value="上传文件">
</form>
</body>
</html>
