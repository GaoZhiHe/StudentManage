<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加学生</title>
</head>
<body>
</div>
	<div align="center">
		<div >添加学生</div>
		<form action="${pageContext.request.contextPath }/AddStudent"  method="post" >
			<table style="width: 300px">
				<tbody>
					<tr>
						<td>学号：</td>
						<td><input type="text" name="sno" ></td>
					</tr>
					<tr>
						<td>姓名：</td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<td>年龄：</td>
						<td><input type="text" name="age"></td>
					</tr>
				</tbody>
				<tbody>
					<tr>
						<td></td>
						<td align="left"><input type="submit" value="确定">
					</tr>
				</tbody>
			</table>
		</form>
	</div>
</body>
</html>