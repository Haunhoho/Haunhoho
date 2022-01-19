<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
td{boder:1px solid blue}
</style>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<form method=POST  action="register_check.jsp">
<table style='bodrder-collapse:collaps;'>
	<tr>
		<td align=right>실명</td><td><input type=text  name=name id=name></td>	<td align=right>성별</td>
		<td><label><input type=radio name=gender  id=gender value=여성>여성</label>
		<label><input type=radio name=gender  id=gender  value=남성>남성</label></td>
	</tr>
	<tr>
		<td align=right>아이디</td><td><input type=text  name=login_id id=login_id></td>
	</tr>
	<tr>
		<td align=right>비밀번호</td><td><input type=text  name=password  id=password></td>
		<td align=right>비밀번호 확인</td><td><input type=text  name=password_ch id=password_ch></td>
	</tr>		
	<tr>
		<td>모바일 번호</td><td><input type=number  name=mobile  id=mobile></td>
	</tr>		
<tr></tr><tr></tr>
	<tr>
		<td >관심분야</td>
		<td colspan=2 >
		<input type=checkbox  name=interesting  value="정치"  >정치
		<input type=checkbox  name=interesting  value="경제"  >경제
		<input type=checkbox  name=interesting  value="사회"  >사회
		<input type=checkbox  name=interesting  value="문화"  >문화<br>
		<input type=checkbox  name=interesting  value="역사"  >역사
		<input type=checkbox  name=interesting  value="연애"  >연애
		<input type=checkbox  name=interesting  value="스포츠"  >스포츠
		<input type=checkbox  name=interesting  value="예술"  >예술<br>
		</td>
	</tr>
	<tr>
		<td colspan=4 align=center>
			<input type=submit  value="가입 완료">&nbsp;&nbsp;
			<input type=reset  value="reset">
		</td>
	</tr>
</table>
</form>
</body>
<script src='hrrp://code.jquery.com/jquery-3.5.0.js'></script>
<script>
$(document)
.on('submit',function{
	if($('input[password_ch]').val()==''){
		alert('false');
		return false;
	}else{
		alert('true');
		return true;
	}
})
</script>
</html>