<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//DB연동을 위한 Connector 설정
	
	// Connection 객체 설정
	Connection con = null;

	try{
		//MySQL과 연동할 것임을 나타냄
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 접속 URL은 jdbc:mysql://localhost/db명
		String url = "jdbc:mysql://localhost/employees";
		
		// 접속 주소, 계정, 비밀번호를 이용해 접속요청을 넣습니다
		con = DriverManager.getConnection(url, "root", "mysql");
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
<title>Insert title here</title>
</head>
<body>
	db 연결 테스트
</body>
</html>