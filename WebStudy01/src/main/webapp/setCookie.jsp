<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Cookie</title>
</head>
<body>
<%
	Cookie C =new Cookie("id","Laneige"); //쿠키 만듬
	C.setMaxAge(365*24*60*60); //쿠키의 수명 지정
	response.addCookie(C); // 클라이언트 쿠키화일 생성
%>
</body>
</html>