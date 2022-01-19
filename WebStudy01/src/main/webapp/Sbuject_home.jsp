<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
<a href="Subject_Login.jsp">로그인</a>
<a href="Subject_signon.jsp">회원가입</a>

<%
if(request.getAttribute("useerid")==null){
	out.print("<a href='Subject_Login.jsp'>로그인</a><br> 회원가입");
}else{
	out.print(request.getAttribute("useerid")+"<a href='Subject_home'>로그아웃</a>");
}
%>


</body>
</html>