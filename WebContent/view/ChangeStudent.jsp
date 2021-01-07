<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改学生信息界面</title>
</head>
<body>
	<div align="center">
		<div >修改学生</div>
		<form action="${pageContext.request.contextPath}/ChangeStudentServlet"
			method="post" onsubmit="return check()">
			<table style="width: 300px">
				<tbody>
					<tr>
						<td>姓名：</td>
						<td><input type="text" name="name">
						<input type="hidden" name="sno" value="${param.id }"></td>
					</tr>
					<tr>
						<td>年龄：</td>
						<td><input type="text" name="age"></td>
					</tr>
				</tbody>
				<tbody>
					<tr>
						<td></td>
						<td align="left"><input type="submit" value="修改">
					</tr>
				</tbody>
			</table>
		</form>
	</div>
</body>
</html>