<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	try{
		int a = 3/0;
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	나눗셈의 결과는 <%= a %>입니다
</body>
</html>
<%}catch(Exception e){
	out.println("로직에 문제가 생겼습니다");
	}
%>