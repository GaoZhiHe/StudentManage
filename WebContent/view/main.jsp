<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理员主页面</title>
</head>
<body>
<p  align="center">欢迎来到学生管理系统</p>
<!-- <p>${sessionScope.loginUserInfo.userName} </p> -->
<div align = "center">
	<div align="center">
		<a href = "/StudentManage/view/FindStudent.jsp">查询学生</a>
    	<a href = "/StudentManage/view/AddStudent.jsp">添加学生</a>
	</div>
	<div>
    <table style="width: 400px; cellpadding:20px 10px 20px 20px">
    	<tr style="font-weight:bold; font-size:14px; height:25px; background-color:#0080ff">
    	<td align="center" width="25%">学生学号</td>
    	<td align="center" width="25%">学生姓名</td>
    	<td align="center" width="25%">学生年龄</td>
    	</tr>
    	<c:forEach items="${Students}" var="p">
    	<tr>
    		<td align="center"> 
    			${p.sno }
    		</td>
    		<td align="center">
    			${p.name }
    		</td>
    			<td align="center">
    			${p.age }
    		</td>
    		<td align="center">
    			<a href="/StudentManage/view/ChangeStudent.jsp?id=${ p.sno}" >修改</a>
    		</td>
    		<td align="center">
    			<a href="${pageContext.request.contextPath}/DeleteStudentServlet?id=${ p.sno}" style="color:red">删除</a>
    		</td>
    	</tr>
    
    </c:forEach>
    </table>
</div>
<a href="${pageContext.request.contextPath }/QuitServlet">退出</a>
</div>
</body>
</html>