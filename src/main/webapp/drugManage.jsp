<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/30 0030
  Time: 下午 3:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>

<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
    <style type="text/css">
        .side{width:100px; float:left; display:inline;}
        .main{width:100px; float:left; display:inline;background-color: darkgray}
    </style>
    <style>
        a#trans { background: #fff; color: #aa0000; padding: 3px; -webkit-transition: all 1s linear; }
        a#trans:hover { background: #220077; color: #fff; }
        #trans-nav { list-style-type: none; height: 50px; padding: 0; margin: 0;float: right;}
        #trans-nav li { float: right; position: relative; padding: 0; line-height: 35px;margin-left:10px; background: #ffffff url(nav-bg.png) repeat-x 0 0; }
        #trans-nav li:hover { background-position: 0 -40px; background:#680000;}
        #trans-nav li:hover > a{color: #ffffff;}
        #trans-nav li a { display: block; padding: 10px 32px;  text-decoration: none;   line-height: 24px; margin-left: 2.5px;font-size: 18px;}
        #trans-nav li:hover > ul{ visibility: visible; }
        #trans-nav li ul { opacity: 0; position: absolute; left: 0; background: #63867f; list-style-type: none; padding: 0; margin: 0; visibility: hidden;width: 100%;overflow: hidden;margin-top: 1px;z-index: 999;}
        #trans-nav li:hover ul { opacity: 1; }
        #trans-nav li ul:hover ul { opacity: 1; }
        #trans-nav li ul li { float: none; position: static;background: #853232;text-align: center; }
        #trans-nav li:hover ul li { height: 31px; }
        #trans-nav li ul li a { background: #853232; line-height: 11px;padding-left: 0px;margin-left: -10px;text-align: center;width: 100%;color: #d3ad78;font-size: 12px;}
        #trans-nav li ul li a:hover { background: #5a8078; }
        #trans-nav li { -webkit-transition: all 0.2s; }
        #trans-nav li a { -webkit-transition: all 0.5s; }
        #trans-nav li ul { -webkit-transition: all 1s; }
        #trans-nav li ul li { -webkit-transition: height 0.5s; }

        .menu_c{

        }
        .web_menu_css{
            text-align: left;
            width: 100%;
            padding-top: 45px;
        }
    </style>
    <style>
        .side{
            font-weight: bold;
            font-size:30px;
            font-family: "SimHei";

        }

    </style>
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
<div class="head" style="width: 100%;height: 10%;background-image: url('img/head.jpg')">

    <span class="firstPro" id="diaCharge"><a href="diaCharge.jsp">诊疗收费</a></span>
    <span class="firstPro" id="spanDrugManage"><a href="drugManage.jsp">药品管理</a></span>
    <span class="firstPro" id="innerManage"><a href="innerManage.jsp">内部管理</a></span>
    用户名显示

</div>
<div class="diagnose-page">
    <div class="side" style="width:12%;height:100%;background-image: url('img/side.jpg')" >
        <ul>

            <li ><a id="drugManage" href="#">药品管理</a>
                <ul id="drugSublevel" style="display: none">
                    <li><a href="#">药品管理</a></li>
                    <li><a href="#">药品盘点管理</a></li>
                </ul>
            </li>
            <li><a href="platformManage.jsp">首页</a></li>

        </ul>
    </div>
    <div class="main" style="width:88%;height:100%">

    </div>

</div>
<script type="text/javascript">
    $().ready(function(){
        $("#drugManage").click(function(){
            $("#drugSublevel").toggle()
        })
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
            $("#spanDrugManage").attr("style", "background-color: cornflowerblue");

        })
        span2.mouseout(function () {
            $("#spanDrugManage").attr("style", "background-color: darkgray");
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
