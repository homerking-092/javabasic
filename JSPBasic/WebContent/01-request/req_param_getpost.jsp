<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 한글 데이터가 POST 전송시 깨지지 않도록 처리
	request.setCharacterEncoding("utf-8");
	
	//폼에서 던전 데이터를 받기 위해서는 request.getParameter("name값")을 활용합니다
	//name = "apple" 에서 던져진 데이터를 받기 위해서는
	String id = request.getParameter("id");
	//name = "banana" 에서 던져진 데이터를 받기 위해서는
	String pw = request.getParameter("pw");
	String sq = request.getParameter("nick");
	//String hob = request.getParameter("hobby");
	// 체크박스는 복수의 데이터가 넘어올 수 있기 때문에
	// request.getParameterValues("name명")를 사용합니다
	String[] hobby = request.getParameterValues("hobby");
	String[] well = request.getParameterValues("well");
	String gender = request.getParameter("gender");
	String eat = request.getParameter("eat");
	String region = request.getParameter("region");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	아이디 : <b><%= id %></b><br>
	비밀번호 : <b><%= pw %></b><br>
	닉넴 : <b><%= sq %></b><br>
	취미 : <% for(String name : hobby){ %>
		<b><%= name %></b>&nbsp;
	<%} %><br>
	취미 : <b><%= Arrays.toString(hobby) %></b>	<%-- 데이터 주소가 아니라 데이터 값을 배열로 --%>
	<br>
	
	특기 : <% for(String good : well){ %>
		<b><%= good %></b>&nbsp;
		<%} %><br>
	특기 : <b><%= Arrays.toString(well) %></b><br>

	성별 : <b><%= gender%></b><br>
	식사여부 : <b><%= eat%></b><br>
	지역 : <b><%= region %></b>
	
	
	
</body>
</html>