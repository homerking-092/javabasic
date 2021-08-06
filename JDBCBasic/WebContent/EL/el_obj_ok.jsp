<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 한글깨짐 방지
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");

	// 폼에서 던져준 데이터를 받아주고
// 	String getName = request.getParameter("name");
// 	String getNick = request.getParameter("nick");
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- 표현식으로 출력 -->
<%-- 	<%=getName %><br> --%>
<%-- 	<%=getNick %> --%>
	이름: ${param.name }<br>
	별명: ${param.nick }<br>
</body>
</html>