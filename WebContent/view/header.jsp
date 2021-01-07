<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>学生信息管理系统</title>
    <!--链接外部样式-->
    <link rel="stylesheet" href="style/headerStyle.css">
    <!--设置标签图标-->
    <link href="favicon.ico" rel="shortcut icon">
    <link rel="stylesheet" href="style/footerStyle.css">

</head>
<body>
<!--头部-->
<div id="header">
<!--头部登录-->
<div class="header_top">
        <!--中部-->
        <div class="header_top_center">
            <!--中部左侧-->
            <div class="h_top_left">
                欢迎来到学生管理系统
            </div>
            <!--中部右侧-->
            <div class="h_top_right">
            <!-- 做一个判断  判断是否有用户 -->
            <c:if test="${empty user}">
            	<a href="login.jsp">登录</a>
            </c:if>
            <c:if test="${!empty user}">
            <!-- 判断用户是否为空 然后取反 -->
            	欢迎：${user.userName}
                <a href="${pageContext.request.contextPath }/SignOutServlet">退出</a>
            </c:if>
            </div>
        </div>
</div>
</div>
    