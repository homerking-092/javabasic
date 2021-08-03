<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	/*
	 - 세션은 쿠키와 마찬가지로 http통신 데이터를
		유지하기 위한 수단으로 사용합니다
		
	 - 세션에 데이터를 저장할 때는 JSP 내장객체 session이 지원하는
	 	setAttribute("세션명", "세션값"); 을 사용합니다
	 
	 - 해당 메서드의 펏번째 파라미터로 세션명을 정해주고
	 	두번째 파라미터로 세션에 저장할 데이터를 정해줍니다
	*/
	
	session.setAttribute("id_session", "abc1234");
	session.setAttribute("name_session", "돈까스");
	session.setAttribute("JSP", "Spring framework");
//	session.setMaxInactiveInterval(3600);	// 1시간
	
%>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="session_check.jsp">세션 확인하기</a>
</body>
</html>