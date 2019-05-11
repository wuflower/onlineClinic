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
<%--
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
--%>

<html>
<head>
    <%--<base href="<%=basePath%>">--%>
    <title>Title</title>
    <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
    <style type="text/css">
        .side {
            width: 100px;
            float: left;
            display: inline;
            background-color: darkgray;
        }

        .main {
            width: 100px;
            float: left;
            display: inline;
            background-color: whitesmoke;
        }
    </style>
    <style>
        a#trans {
            background: #fff;
            color: #aa0000;
            padding: 3px;
            -webkit-transition: all 1s linear;
        }

        a#trans:hover {
            background: #220077;
            color: #fff;
        }

        #trans-nav {
            list-style-type: none;
            height: 50px;
            padding: 0;
            margin: 0;
            float: right;
        }

        #trans-nav li {
            float: right;
            position: relative;
            padding: 0;
            line-height: 35px;
            margin-left: 10px;
            background: #ffffff url(#) repeat-x 0 0;
        }

        #trans-nav li:hover {
            background-position: 0 -40px;
            background: #680000;
        }

        #trans-nav li:hover > a {
            color: #ffffff;
        }

        #trans-nav li a {
            display: block;
            padding: 10px 32px;
            text-decoration: none;
            line-height: 24px;
            margin-left: 2.5px;
            font-size: 18px;
        }

        #trans-nav li:hover > ul {
            visibility: visible;
        }

        #trans-nav li ul {
            opacity: 0;
            position: absolute;
            left: 0;
            background: #63867f;
            list-style-type: none;
            padding: 0;
            margin: 0;
            visibility: hidden;
            width: 100%;
            overflow: hidden;
            margin-top: 1px;
            z-index: 999;
        }

        #trans-nav li:hover ul {
            opacity: 1;
        }

        #trans-nav li ul:hover ul {
            opacity: 1;
        }

        #trans-nav li ul li {
            float: none;
            position: static;
            background: #853232;
            text-align: center;
        }

        #trans-nav li:hover ul li {
            height: 31px;
        }

        #trans-nav li ul li a {
            background: #853232;
            line-height: 11px;
            padding-left: 0px;
            margin-left: -10px;
            text-align: center;
            width: 100%;
            color: #d3ad78;
            font-size: 12px;
        }

        #trans-nav li ul li a:hover {
            background: #5a8078;
        }

        #trans-nav li {
            -webkit-transition: all 0.2s;
        }

        #trans-nav li a {
            -webkit-transition: all 0.5s;
        }

        #trans-nav li ul {
            -webkit-transition: all 1s;
        }

        #trans-nav li ul li {
            -webkit-transition: height 0.5s;
        }

        .menu_c {

        }

        .web_menu_css {
            text-align: left;
            width: 100%;
            padding-top: 45px;
        }
    </style>
    <style>
        .side {
            font-weight: bold;
            font-size: 30px;
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
<div class="head" style="width: 100%;height: 10%;background-color: burlywood">

    <span class="firstPro" id="diaCharge"><a href="/onlineClinic/customer/diaCharge" >诊疗收费</a></span>
    <span class="firstPro" id="drugManage"><a href="/onlineClinic/customer/drugManage" >药品管理</a></span>
    <span class="firstPro" id="innerManage"><a href="/onlineClinic/customer/innerManage" >内部管理</a></span>
    用户名显示

</div>
<div class="diagnose-page" style="width: 100%;height: 100%;">
    <div class="side" style="width:20%;height:100%;">
        <ul>

            <li class="side-first"><a id="diagnose" href="#">诊疗</a>
                <ul class="side-sec" id="diasublevel" style="display: none">
                    <li id="patientInsAndDia"><a href="/onlineClinic/customer/query">病人录入与诊断</a></li>
                    <li><a href="#">药品推荐与展示</a></li>
                </ul>
            </li>
            <li class="side-first"><a id="charge" href="#">收费</a>
                <ul class="side-sec" id="chargesublevel" style="display: none">
                    <li><a href="#">收费管理</a></li>
                    <li><a href="#">零售药品</a></li>
                </ul>
            </li>
            <li class="side-first"><a id="returnvisit" href="#">回访</a>
                <ul class="side-sec" id="revisitsublevel" style="display: none">
                    <li><a href="#">病人回访</a></li>

                </ul>
            </li>
            <li class="side-first"><a href="/onlineClinic/customer/platformManage">首页</a></li>

        </ul>
    </div>


    <div class="main" style="width:80%;height:100%;">

        <div id="patientDiagnose" style="display: block">
            <form action="/onlineClinic/customer/query" method="post">
                <input type="hidden" id="currentPage" name="currentPage" value="">
                <input type="text" placeholder="输入病人关键信息" name="queryCon" value="${paQC.queryCon}">
                <input type="submit" onclick="goPage(1)" value="查询全部病人信息">
            </form>
            <a href='/onlineClinic/jsp/addPatient.jsp'>新增病人信息</a>

            <table style="width: 100%;height: 100%;margin: auto" border="2px" cellpadding="5px" cellspacing="5px">
                <tr>
                    <td>姓名</td>
                    <td>年龄</td>
                    <td>性别</td>
                    <td>地址</td>
                    <td>身份证号</td>
                    <td>联系电话</td>
                    <td>操作</td>
                </tr>
                <c:forEach items="${pageInfo.list}" var="patient">
                    <tr>
                        <td style="display: none">${patient.id}</td>
                        <td>${patient.name}</td>
                        <td>${patient.age}</td>
                        <td>${patient.sex}</td>
                        <td>${patient.address}</td>
                        <td>${patient.idCardNo}</td>
                        <td>${patient.phone}</td>
                        <td>
                            <a href="/onlineClinic/customer/delete?id=${patient.id}">删除</a>
                            <a href="/onlineClinic/customer/queryById?id=${patient.id}&jumpTo=update">修改</a>
                            <a href="/onlineClinic/customer/queryById?id=${patient.id}&jumpTo=diagnose">诊断</a>
                        </td>
                    </tr>
                </c:forEach>
                <tr>
                    <td colspan="7">
                        <button onclick="goPage(${pageInfo.firstPage})">首页</button>
                        <button onclick="goPage(${pageInfo.prePage})">上页</button>
                        <button onclick="goPage(${pageInfo.nextPage})">下页</button>
                        <button onclick="goPage(${pageInfo.lastPage})">末页</button>
                        每页${pageInfo.pageSize}条数据，当前${pageInfo.pageNum}/${pageInfo.pages}页，共${pageInfo.total}条数据
                    </td>
                </tr>
            </table>
        </div>
    </div>

</div>
<script type="text/javascript">
    function goPage(currentPage) {

        if (currentPage < 1) {
            alert("这已经是第一页！！")
            currentPage = 1
        }
        if (currentPage >${pageInfo.pages}) {
            alert("这已经是最后一页！！")
            currentPage =
            ${pageInfo.lastPage}
        }

        document.getElementById("currentPage").value = currentPage;
        document.forms[0].submit();
    }

</script>
<script type="text/javascript">

    $().ready(function () {
        $("#diagnose").click(function () {
            $("#diasublevel").toggle()
        })
        $("#charge").click(function () {
            $("#chargesublevel").toggle()
        })
        $("#returnvisit").click(function () {
            $("#revisitsublevel").toggle()
        })
        var span1 = $("#diaCharge");
        var span2 = $("#drugManage");
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
