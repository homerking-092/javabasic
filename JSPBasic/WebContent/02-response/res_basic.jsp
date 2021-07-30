<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>미성년자 체크</title>
</head>
<body>
	<%= "<나이를 입력하세연>" %>
	<form action="res_check.jsp" method="get">
		<input type="text" name="age">	
		<input type="submit" value="확인">	
	</form>
</body>
</html>