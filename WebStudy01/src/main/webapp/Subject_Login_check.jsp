<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login middle count</title>
</head>
<body>
<form method=post action="Subject_home.jsp">
<%
request.setCharacterEncoding("UTF-8");
response.setContentType("text/html; charset=UTF-8");
%>

<%
	String ID =request.getParameter("userid");
	String PW =request.getParameter("passcode");

%>
<%
if(ID.isEmpty() || PW.isEmpty()){
	RequestDispatcher req = request.getRequestDispatcher("Subject_Login.jsp");
	req.include(request, response);
		}
else{
	RequestDispatcher req = request.getRequestDispatcher("Sbuject_home.jsp");
	req.forward(request, response);	
	
		}
%>	
</form>
</body>
</html>