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


	// 연결로직을 만들어주세요
	Connection con = null;

	// 쿼리문 실행을 위한 PreparedStatement 객체 생성
	PreparedStatement pstmt = null;

	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		String url = "jdbc:mysql://localhost/ict03";

		con = DriverManager.getConnection(url, "root", "mysql");
		
		// 1. 쿼리문을 작성합니다
		String sql = "INSERT INTO users VALUES(?, ?, ?, ?)";
		
		// 2. 만들 쿼리문의 ? 자리에 적용할 자바 변수를 접어넣습니다
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, uid);
		pstmt.setString(2, upw);
		pstmt.setString(3, uname);
		pstmt.setString(4, email);
		System.out.println("회원가입정보");
		System.out.println("id: " + uid + ", pw: " + upw + ", 이름: " + uname + ", 이메일: " + email);
		
		// 3. 만든 쿼리문 실행하기
		pstmt.executeUpdate();
		
		
		
		
		
	}catch(ClassNotFoundException e){
		System.out.println("드라이버 로딩 실패");
	}catch(SQLException e){
		System.out.println("에러: " + e);
	}finally{
		try{
			if(con != null && !con.isClosed()){
				con.close();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
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