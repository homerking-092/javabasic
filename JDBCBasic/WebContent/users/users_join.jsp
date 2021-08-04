<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// post방식 한글 깨짐 방지
	response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");

	// DB연동 이전에 먼저 join_form에서 날려주는 데이터를 받아서 저장
	String uid = request.getParameter("uid");
	String upw = request.getParameter("upw");
	String uname = request.getParameter("uname");
	String email = request.getParameter("email");
	
	// 기존에 있던 회원 가입 로직은 DAO클래스로 이관합니다
	
	// DAO 클래스 받아오기
	UsersDAO dao = UsersDAO.getInstance();
	
	// VO객체 생성 및 uid, upw, uname, email setter로 입력해주기
	UsersVO user = new UsersVO(uid, upw, uname, email);
	
	dao.joinUsers(user);

	%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 페이지</title>
</head>
<body>
	회원가입에 성공했습니다<br>
	<a href="user_login_form.jsp">로그인하러 가기</a>
</body>
</html>