<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보확인</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
response.setContentType("text/html; charset=UTF-8");
%>

실명: <%=request.getParameter("name") %><br>
아이디: <%=request.getParameter("login_id")%><br>
성별 :<%=request.getParameter("gender")%><br>
비밀번호 :<%=request.getParameter("password")%><br>
비밀번호 확인 :<%=request.getParameter("password_ch")%><br>
관심분야
<%
String[] interest=request.getParameterValues("interesting");
for(int i=0;i<interest.length;i++){
	if(i!=0) out.println(",");
		out.println(interest[i]);
}
%>
</body>
<script src='http://code.jquery.com/jquery-3.5.0.js'></script>
<script>
$(document)
.ready(function(){
	setTimeout(function(){
		document.location='Subject_Login.jsp';
	},3000)
});
</script>
</html>