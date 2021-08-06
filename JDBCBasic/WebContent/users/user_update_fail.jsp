<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	
	// 정보수정 실패시 자동 로그아웃
	session.invalidate();
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>수정에 실패했습니다 <br>다시 시도해주세요</h3>
	<a href="user_login_form.jsp">로그인 돌아가기</a>
</body>
</html>