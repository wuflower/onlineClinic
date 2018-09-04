<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script typet="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
</head>
<body>
<%--页面主体--%>
<div class="page">
    <div class="login-warp"></div>

    <div class="login-main">
        <div class="login-content">
            <div class="login-win">
                <form id="loginForm" method="post">
                    用户名：<input type="text" id="userName" name="userName"><span id="remind"></span><br>
                    密码：<input type="password" id="password" name="password"><br>
                        <input id="submit" type="button" value="登录">
                </form>

            </div>

        </div>

    </div>

</div>

<script type="text/javascript">
    $().ready(function(){
        var myBtn = $("#submit");
        /*alert(myBtn.val());*/

        //callback(回调函数)
        myBtn.click(function(){

            $.post("/onlineClinic/admin/login",{"userName":$("#userName").val(),"password":$("#password").val()},function(data){
                //alert(data);
                if(data=="ok"){
                    $("#remind").text("登陆成功");
                    $(function(){
                        window.location.href="platformManage.jsp";
                    })
                }else {
                    $("#remind").html(data);
                    $("#remind").css("color","red");
                }
            });
        });

    });

</script>


</body>
</html>
