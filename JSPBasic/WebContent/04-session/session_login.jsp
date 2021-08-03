<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 폼태그를 이용해 session_login_ok.jsp로 post방식으로 id, pw, nickname을 전송 -->
	<form action="session_login_ok.jsp" method="post">
			<input type="text" name="id" placeholder="ID"><br>
			<input type="password" name="pw" placeholder="PW"><br>
			<input type="text" name="nick" placeholder="nickName"><br>
			
			<input type="submit" value="로그인"> 
			<input type="reset" value="리셋">
	</form>
</body>
</html>