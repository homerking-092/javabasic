<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String getId = (String) session.getAttribute("i_s");
// 	String getName = (String) session.getAttribute("n_s");
// 	String getEmail = (String) session.getAttribute("e_s");
	
	UsersDAO dao = UsersDAO.getInstance();
	UsersVO user = new UsersVO();
	user.setUid(getId);
	
	UsersVO resultData = dao.getUserInfo(user);
	
	
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= getId %>의 상세정보<br>
	이름: <%= resultData.getUname()%><br>
	이메일: <%= resultData.getEmail()%><br>
	<a href="user_main.jsp">메인으로 가기</a>
	
</body>
</html>