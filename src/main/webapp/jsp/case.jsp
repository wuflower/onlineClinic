<%--
  Created by IntelliJ IDEA.
  User: MoCush_Chao
  Date: 2018/9/1
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>
<html>
<head>
    <title>填写病历</title>
    <script type="text/javascript" src="../jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
    <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
</head>
<body>
<br>
<br>
<input type="hidden" name="patientId" value="${patient.id}">
病人：${patient.name} 性别：${patient.sex}<br>
<form name="case" action="/onlineClinic/case/add" method="post">
    诊断类型：<input type="radio" checked="checked" name="type" value="1">西医
             <input type="radio" name="type" value="2">中医
    是否复诊：<input type="radio" checked="checked" name="isSubsequent"  value="0">初诊
             <input type="radio" name="isSubsequent" value="1">复诊
    主诉：<input id="selfReported" name="selfReported">
    体温：<input id="temperature" name="temperature" >
    收缩压：<input id="systolicPress" name="systolicPress" >
    舒张压：<input id="diastolicPress" name="diastolicPress" >
    脉搏：<input id="pulse" name="pulse">
    身高：<input id="weight" name="weight">
    体重：<input id="height" name="height">
    诊断日期：<input type="date" name="diagnosiDate">

    <input type="submit" value="开具处方">
</form>
<br>
<br>

</body>
</html>
