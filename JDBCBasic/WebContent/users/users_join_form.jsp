<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 아이디, 비밀번호, 이름, 이메일 4개 요소를 users_join.jsp로 보내주는
		form을 post방식으로 작성 
		보내는 input태그의 name 속성은 컬럼명과 일치-->
		
	<h1>회원가입 창입니다</h1>
	
	<form action="users_join.jsp" method="post">
		<input type="text" name="uid" placeholder="ID"><br>
		<input type="password" name="upw" placeholder="PW"><br>
		<input type="text" name="uname" placeholder="이름"><br>
		<input type="email" name="email" placeholder="이메일"><br>
		
		<input type="submit" value="가입">
		<input type="reset" value="초기화"><br>
		<a href="user_login_form.jsp">로그인하러 ㄱㄱ</a>
		
	</form>
</body>
</html>