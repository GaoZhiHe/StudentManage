<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>显示学生界面</title>
</head>
<body>
<div>
    <table style="width: 400px; cellpadding:20px 10px 20px 20px">
    	<tr style="font-weight:bold; font-size:14px; height:25px; background-color:#0080ff">
	    	<td align="center" width="25%">学生学号</td>
	    	<td align="center" width="45%">学生姓名</td>
	    	<td align="center" width="25%">学生年龄</td>
    	</tr>
    	<tr>
    		<td align="center"> 
    			${stuInfo.sno}
    		</td>
    		<td align="center">
    			${stuInfo.name}
    		</td>
    			<td align="center">
    			${stuInfo.age}
    		</td>
    	</tr>
    </table>
    <a href = "/StudentManage/view/main.jsp">返回主界面</a>
</div>
</body>
</html>