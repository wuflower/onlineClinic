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
    <script type="text/javascript" src="jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
    <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

</head>
<body>
<br>
<br>
<input type="hidden" name="patientId" value="${patient.id}">
病人：${patient.name} 性别：${patient.sex}<br>
<form name="case" action="add.case">
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
</form>
<br>
<br>

<button  class="button"  onclick="addrow();">添加一行</button><br>
<form action="#">
    <table class="table" border="1px">
        <tr>
            <td>药品名</td>
            <td>用法</td>
            <td>剂量</td>
            <td>频率</td>
            <td>天数</td>
            <td>总量</td>
            <td>单价</td>
            <td>操作</td>
        </tr>
    </table>
</form>

<input id="testKeyPress" oninput="">

<input type="button" value="提交" onclick="submit()">

<script type="text/javascript">
    function submit(){
        document.forms(0).submit();
        document.forms(1).submit();
    }

</script>

<script type="text/javascript">

    function addrow(){

        var tables = $('.table');

        var addtr = $("<tr>"+
                "<td><input type='text' id='drugName' name='drugName' oninput='test()' /></td>"+
                "<td><input type='text' id='usage' name='usage' /></td>"+
                "<td><input type='text' id='amount' name='amount' /></td>"+
                "<td><input type='text' id='frequency' name='frequency' /></td>"+
                "<td><input type='text' id='days' name='days' /></td>"+
                "<td><input type='text' id='totalAmount' name='totalAmount' /></td>"+
                "<td><input type='text' id='unit' name='unit' /></td>"+
                "<td><span  onclick='deleteTrRow(this);'>&nbsp;<a href='#'>删除</a></span></td>"+
                "</tr>");

        addtr.appendTo(tables);

    }

    function deleteTrRow(tr){
        //多一个parent就代表向前一个标签,
        //本删除范围为<td><tr>两个标签,即向前两个parent
        //如果多一个parent就会删除整个table
        $(tr).parent().parent().remove();
    }

    function test(){

    }

</script>




</body>
</html>
