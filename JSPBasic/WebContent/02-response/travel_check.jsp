<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String travel = request.getParameter("travel");
	

	if(travel.equals("madrid")){
		response.sendRedirect("travel_madrid.jsp");
	}else if(travel.equals("rondon")){
		response.sendRedirect("travel_rondon.jsp");
	}else if(travel.equals("otawa")){
		response.sendRedirect("travel_otawa.jsp");
	}else if(travel.equals("guam")){
		response.sendRedirect("travel_guam.jsp");
	}

	
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>