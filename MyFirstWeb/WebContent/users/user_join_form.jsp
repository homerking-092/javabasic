<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원가입창</h3>
	<form action="/MyFirstWeb/join.do" method="post">
		<input type="text" name="uId" placeholder="id"><br>
		<input type="password" name="uPw" placeholder="pw"><br>
		<input type="text" name="uName" placeholder="name"><br>
		<input type="email" name="email" placeholder="email"><br>
		
		<input type="submit" value="가입">
		<input type="reset" value="초기화"><br>
		<a href="http://localhost:8181/MyFirstWeb/users/user_login_form.jsp">
		<input type="button" value="로그인"></a>
		
	</form>
</body>
</html>