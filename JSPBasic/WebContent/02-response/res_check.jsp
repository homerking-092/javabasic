<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String age = request.getParameter("age");
	int agge = Integer.parseInt(age);
	
	
	if(agge <= 19){
		response.sendRedirect("res_no.jsp");
	}else if(agge >= 20){
		response.sendRedirect("res_ok.jsp");
	}
%>

<!-- 밑에 17번부터 26까지는 없어도 갠춘 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>