<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查找学生界面</title>
</head>
<body>
</div>
	<div align="center">
		<div >查找学生</div>
		<form action="${pageContext.request.contextPath }/FindStudentServlet"
			method="post" onsubmit="return check()">
			<table style="width: 300px">
				<tbody>
					<tr>
						<td>学号：</td>
						<td><input type="text" name="sno" ></td>
					</tr>
				</tbody>
				<tbody>
					<tr>
						<td></td>
						<td align="left"><input type="submit" value="查找">
					</tr>
				</tbody>
			</table>
		</form>
	</div>
</body>
</html>