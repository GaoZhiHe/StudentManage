<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录页面</title>
</head>
<body>
<div align ="center">
    <div >
        <p>欢迎您使用学生管理系统</p>
    </div>
</div>
        <div align="center">
            <form action="${pageContext.request.contextPath }/LoginServlet"  id="login" method="post">
                <!--用户名-->
               <div class="username">
                   <span></span>
                   <td align="right">用户名：</td>
                   <input type="text" placeholder="请输入用户名..." name="userName">
                </div>
                <!--密码-->
                <div class="password">
                    <span></span>
                    <td align="right">密&nbsp&nbsp&nbsp&nbsp码：</td>
                    <input type="password" name="password" placeholder="请输入密码...">
                </div>
                <div class="login_btn">
                    <input type="submit" class="login_btn" value="登录">
                </div>
            </form>
        </div>
</body>
</html>