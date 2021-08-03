<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%	
		// 세션 파기
		session.invalidate();
		// login 페이지로 리다이렉트 ㄱㄱ
		response.sendRedirect("session_login.jsp");
	%>
	
</body>
</html>