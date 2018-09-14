<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/5 0005
  Time: 下午 5:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="../jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
    <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
</head>
<body>


<button  class="button"  onclick="addrow();">添加一行</button><br>
<form action="/onlineClinic/recipe">
    <table class="table">
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




<script type="text/javascript">

    function addrow(){

        var tables = $(".table");

        var addtr = $("<tr>"+
                "<td><input type='text' class='inputbox-text inputbox-text-border' id='drugName' name='drugName' />" +
                "<div id='brxmDiv' class='d-search-autodiv' style='display:none;'>"+
                "<select id='brxmSelect' size='3' style='margin-top:0px;' class='d-search-autoselect'></select>"+
                "</div></td>"+
                "<td><input type='text' id='usage' name='usage' /></td>"+
                "<td><input type='text' id='amount' name='amount' /></td>"+
                "<td><input type='text' id='frequency' name='frequency' /></td>"+
                "<td><input type='text' id='days' name='days' /></td>"+
                "<td><input type='text' id='totalAmount' name='totalAmount' /></td>"+
                "<td><input type='text' id='unit' name='unit' /></td>"+
                "<td><span  onclick='deleteTrRow(this);'>&nbsp;<a href='#'>删除</a></span></td>"+
                "</tr>");

        addtr.appendTo(tables);


        $().ready(function(){
            $("#drugName").keyup(function(){
                var content="";

                $("#brxmSelect option").length=0;

                $("#brxmDiv").css("display","block");
                var drugNameWidth = $('#drugName').width();
                $("#brxmSelect").css("width",drugNameWidth);

                $.post("queryByName.drug",{"drugName":$("#drugName").val()},function(data){
                    for(var i in data){
                        var drug=data[i];
                        content += "<option>"+drug.commidityName+"</option>"
                    }
                    $("#brxmSelect").html(content);



                    $("#brxmSelect").change(function () {
                        $("#drugName").val($("#brxmSelect option:selected").text());
                        $("#brxmSelect").attr("style","display:none");
                        $.post("queryByName.drug",{"drugName":$("#brxmSelect option:selected").text()},function(data){
                            for (var i in data){
                                $("#unit").val(data[i].unitPrice)
                            }
                        },"json")
                    })

                },"json")



            })


        })

    }

    function deleteTrRow(tr){
        //多一个parent就代表向前一个标签,
        //本删除范围为<td><tr>两个标签,即向前两个parent
        //如果多一个parent就会删除整个table
        $(tr).parent().parent().remove();
    }

    function test(){
        alert("1111111")
    }

</script>
</body>
</html>
