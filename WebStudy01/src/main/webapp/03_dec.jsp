<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%!
int global_cnt=0; //ststic >예전값이 유지되어 게속 실행이됨 <웹페이자 생성될 때, 한번만 실행. 변수값은 계속 유지
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int local_cnt=0;// 예전값이 유지 되지 않으

out.println("<br>local_cnt :");
out.println(++local_cnt);


out.println("<br>global_cnt :");
out.println(++global_cnt);

%>
</body>
</html>