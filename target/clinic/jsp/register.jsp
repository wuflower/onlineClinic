<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/30 0030
  Time: 下午 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <base href="<%=basePath%>"/>
</head>
<body>
<form action="<%=basePath%>admin/register">
    用户名：<input id="accountName" name="accountName">
    密码：<input id="password" name="password">
    <input type="submit" value="注册">
</form>
</body>
</html>
