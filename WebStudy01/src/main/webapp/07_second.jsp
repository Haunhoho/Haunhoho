<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>second page</title>
</head>
<body>
<%
	out.println("secondpage.jsp<br>");
	out.println("하나의 페이지 속성:"+pageContext.getAttribute("name")+"<br>");
	out.println("하나의 리퀘스트 속성:"+request.getAttribute("name")+"<br>");
	out.println("하나의 세션 속성:"+session.getAttribute("name")+"<br>");
	out.println("하나의 어플리케이션 속성:"+application.getAttribute("name")+"<br>");
	String hyper="07_third.jsp?name="+request.getAttribute("name");
	%>
	
	<a href="<%=hyper %>">또다른 페이지</a>

</body>
</html>