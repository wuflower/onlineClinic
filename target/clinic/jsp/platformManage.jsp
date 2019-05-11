<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/30 0030
  Time: 下午 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>

<html>
<head>
    <title>平台管理</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <script typet="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>

    <style>
        .firstPro {
            color: white;
            font-weight: bold;
            font-size: 50px;
            font-family: "SimHei";
        }

    </style>


</head>
<body>
<div class="platform-page">
    <div class="head" style="width: 100%;height: 10%; background-color: burlywood">

        <span class="firstPro" id="diaCharge"><a href="/onlineClinic/customer/diaCharge" >诊疗收费</a></span>
        <span class="firstPro" id="drugManage"><a href="/onlineClinic/customer/drugManage" >药品管理</a></span>
        <span class="firstPro" id="innerManage"><a href="/onlineClinic/customer/innerManage" >内部管理</a></span>
        ${sessionScope.login.accountName}

    </div>
    <div class="main" style="background-color: lightgray">
        <img src="img/global_banner_second.jpg">
    </div>

</div>

<script type="text/javascript">
    $().ready(function () {

        var span1 = $("#diaCharge");
        var span2 = $("#spanDrugManage");
        var span3 = $("#innerManage");

        span1.mouseover(function () {
            $("#diaCharge").attr("style", "background-color: cornflowerblue");

        })
        span1.mouseout(function () {
            $("#diaCharge").attr("style", "background-color: darkgray");
        })
        span2.mouseover(function () {
            $("#drugManage").attr("style", "background-color: cornflowerblue");

        })
        span2.mouseout(function () {
            $("#drugManage").attr("style", "background-color: darkgray");
        })
        span3.mouseover(function () {
            $("#innerManage").attr("style", "background-color: cornflowerblue");

        })
        span3.mouseout(function () {
            $("#innerManage").attr("style", "background-color: darkgray");
        })



    })


</script>
</body>
</html>
