<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>operate</title>
</head>
<body>
<form method="POST" action="operate_bk.jsp">
<table>
	<tr>
		<td>value1 :</td><td><input type=text name=value1 id=value1></td>
	</tr>
	<tr>
		<td>value2 :</td><td><input type=text name=value2 id=value2></td>
	</tr>
	<tr>
		<td>operator :</td>
			<td colspan=2><select name=operator>
			<option value="+">+</option>
			<option value="-">-</option>
			<option value="*">X</option>
			<option value="/">/</option>
			</select>
		</td>
	</tr>
	<tr>
		<td colspan=2 align=center>
		<input type=submit value="전송"></td>
	</tr>
	</table>
</form>
</body>
</html>