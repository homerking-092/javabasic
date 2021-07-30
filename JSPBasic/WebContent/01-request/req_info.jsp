<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String protocl = request.getProtocol();
	String conPath = request.getContextPath();
	StringBuffer reqUrl = request.getRequestURL();
	String reqUri = request.getRequestURI();
	int serverPort = request.getServerPort();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request 객체 테스트1</title>
</head>
<body>
	요청 프로토콜: <%= protocl %><br>
	요청 컨텍스트 경로: <%= conPath %><br>
	요청 URL: <%= reqUrl %><br>
	요청 URI: <%= reqUri %><br>
	서버 포트: <%= serverPort %>

</body>
</html>