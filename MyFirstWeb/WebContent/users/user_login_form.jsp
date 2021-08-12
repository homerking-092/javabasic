<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 창</h1>
	<form action="/MyFirstWeb/login.do" method="post">
		<input type="text" name="uId" placeholder="아이디"><br>
		<input type="password" name="uPw" placeholder="비번"><br>
		
		<input type="submit" value="로그인">
		<input type="reset" value="초기화"><br>
		<a href="http://localhost:8181/MyFirstWeb/users/user_join_form.jsp">
		<input type="button" value="회원가입"></a>
	</form>
</body>
</html>