<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>operate_bk</title>
</head>
<body>
<%
String val1=request.getParameter("value1");
String val2=request.getParameter("value2");
String op=request.getParameter("operator");
if(val1==null || val2==null|| op==null) return;
int v1=Integer.parseInt(val1);
int v2=Integer.parseInt(val2);

int result=0;
if(op.equals("+")){
	result=v1+v2;
}else if(op.equals("-")){
	result=v1-v2;
}else if(op.equals("*")){
	result=v1*v2;
}else if (op.equals("/")){
	result=v1/v2;
}else return;

out.println("value1:"+v1+"<br>value2"+v2+ "<br>operator:"+op+"<br>Result:"+result);
%>

</body>
</html>