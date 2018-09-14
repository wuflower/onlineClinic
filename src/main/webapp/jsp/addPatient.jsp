<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/31 0031
  Time: 上午 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>新增病人</title>
    <script typet="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>

</head>
<body>
<br>
<br>
<br>

<div>
    <form action="/onlineClinic/customer/add" method="post">
        病人姓名：<input id="name" name="name"><br>
        身份证：<input id="idCardNo" name="idCardNo"><br>
        性别：<input type="radio" name="sex" value="1">男
        <input type="radio" name="sex" value="2">女
        <input type="radio" checked="checked" name="sex" value="3">未知<br>
        出生日期：<input type="date" id="birth" name="birth"><br>
        年龄：<input id="age" name="age"><br>
        是否结婚：<input type="radio" checked="checked" name="isMaried" value="0">未婚
        <input type="radio" name="isMaried" value="1">已婚<br>
        职业：<input type="radio" name="profession" value="1">农牧渔民
        <input type="radio" name="profession" value="2">工人
        <input type="radio" name="profession" value="3">职员
        <input type="radio" checked="checked" name="profession" value="4">其他<br>
        病人电话：<input id="phone" name="phone"><br>

        <%--<legend>方法一：下拉选择框实现省市区（县）三级联动</legend>--%>
        <label for="addr-show">病人地址：
            <input type="text" name="address" value="" id="addr-show">
        </label>


        <!--省份选择-->
        <select id="prov" name="province" onchange="showCity(this)">
            <option>=请选择省份=</option>
        </select>


        <!--城市选择-->
        <select id="city" name="city" onchange="showCountry(this)">
            <option>=请选择城市=</option>
        </select>

        <!--县区选择-->
        <select id="country" name="district" onchange="selecCountry(this)">
            <option>=请选择县区=</option>
        </select>
        <button type="button" class="btn met1" onClick="showAddr()">确定</button>

        <input id="street" placeholder="街道信息" name="street"><br>
        <input type="submit" value="提交">
        <input type="button" value="<a href='customer/queryCustomer'>返回</a>">
    </form>

    <script src="../city.js"></script>
    <script src="../method01.js"></script>


</div>
</body>
</html>
