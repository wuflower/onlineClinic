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
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <base href="<%=basePath%>"/>
</head>
<body>


<button  class="button"  onclick="addrow();">添加一行</button><br>
<form action="/onlineClinic/recipe">
    <input type="hidden" name="customerId" value="sessionScope.patient.id">
    处方类型：<input type="radio" name="recipeType" value="1">西医处方
    <input type="radio" name="recipeType" value="2">中医处方
    <input type="radio" checked="checked" name="recipeType" value="3">未知<br>
    <table class="table">
        <tr>
            <td>编号</td>
            <td>药品名</td>
            <td>服用次数</td>
            <td>剂量</td>
            <td>频率</td>
            <td>天数</td>
            <td>总量</td>
            <td>单价</td>
            <td>总价</td>
            <td>操作</td>
        </tr>
    </table>
    总计价：<input name="totalPrice">
    <input type="submit" value="处方提交">
</form>




<script type="text/javascript">
    var k=0;

    function addrow(){

        k++;

        var tables = $(".table");

        var addtr = $("<tr>"+
                "<td><input type='text' class='number"+k+"' name='number' value='"+k+"'/>"+
                "<td><input type='text' class='drugName"+k+"' name='drugName' />" +
                "<div class='brxmDiv'  style='display:none;'>"+
                "<select class='brxmSelect' size='5' style='margin-top:0px;'></select>"+
                "</div></td>"+
                "<input type='hidden' class='drugId' name='drugId' />"+
                "<td><input type='text' class='times' name='times' /></td>"+
                "<td><input type='text' class='amount' name='amount' /></td>"+
                "<td><input type='text' class='frequency' name='frequency' /></td>"+
                "<td><input type='text' class='days' name='days' /></td>"+
                "<td><input type='text' class='totalAmount"+k+"' name='totalAmount' /></td>"+
                "<td><input type='text' class='drugUnitFee"+k+"' name='drugUnitFee' /></td>"+
                "<td><input type='text' class='recipeDrugFee"+k+"' name='recipeDrugFee' /></td>"+
                "<td><span  onclick='deleteTrRow(this);'>&nbsp;<button>删除</button></span></td>"+
                "</tr>");

        addtr.appendTo(tables);


        $().ready(function(){
            $(".drugName"+k).keyup(function(){
                var content="";

                $(".brxmSelect option").length=0;

                $(".brxmDiv").css("display","block");
                var drugNameWidth = $('.drugName'+k).width();
                $(".brxmSelect").css("width",drugNameWidth);

                $.post("<%=basePath%>drug/queryByName",{"drugName":$(".drugName"+k+"").val()},function(data){
                    for(var i in data){
                        var drug=data[i];
                        content += "<option>"+drug.commidityName+"</option>"
                    }
                    $(".brxmSelect").html(content);



                    $(".brxmSelect").change(function () {
                        $(".drugName"+k).val($(".brxmSelect option:selected").text());
                        $(".brxmSelect").attr("style","display:none");
                        $.post("<%=basePath%>drug/queryByName",{"drugName":$(".brxmSelect option:selected").text()},function(data){
                            for (var i in data){
                                alert(data[i].unitPrice)
                                $(".drugUnitFee"+k).val(data[i].unitPrice)
                                $(".drugId").val(data[i].id)
                            }
                            $(".totalAmount"+k).keydown(function(){
                                var totalAmount=$(".totalAmount"+k).val()
                                console.log(totalAmount)
                                var drugUnitFee=$(".drugUnitFee"+k).val()
                                console.log(drugUnitFee)
                                $(".recipeDrugFee"+k).val(totalAmount*drugUnitFee)
                            })
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
        i--;
        $(tr).parent().parent().remove();
    }

    function test(){
        alert("1111111")
    }

</script>
</body>
</html>
