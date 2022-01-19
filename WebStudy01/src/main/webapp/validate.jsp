<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
if(request.getParameter("userid").equals("xaexal")&&
	request.getParameter("passcode").equals("human123")	){
	//request.setAttribute("userid","xaecal");
	request.setAttribute("usserid",request.getParameter("human123"));
	request.setAttribute("passcode","human123");
	RequestDispatcher rd=request.getRequestDispatcher("Login.jsp"); //no querystring allowed
	 rd.forward(request,response);
}else{
	RequestDispatcher rd=request.getRequestDispatcher("LoginSheet.jsp");
	 rd.forward(request,response);
}
		
%>

<script>
doucment.location=''
</script>