<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	response.setCharacterEncoding("utf-8");
request.setCharacterEncoding("utf-8");

// 사용자가 폼으로 보낸 비밀번호
String dpw = request.getParameter("dpw");

// 세션쪽 아이디, 비밀번호
String getPw = (String) session.getAttribute("p_s");
String getId = (String) session.getAttribute("i_s");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Connection con = null;
	PreparedStatement pstmt = null;

	// 비밀번호를 DB쪽과 대조해서(세션 활용) 맞는 비밀번호라면
	// DELETE 구문을 실행해 삭제해주고 비밀번호가 틀리다면
	// 바로 로그아웃을 강제로 시킵니다

	if (getPw != null) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/ict03";
			con = DriverManager.getConnection(url, "root", "mysql");

			String sql = "DELETE FROM users WHERE uid = ?";

			// 2. 쿼리문의 ?자리에 적용할 변수를 집어넣습니다

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, getId);
			// 쿼리문 실행
			pstmt.executeUpdate();
			//세션 파기는 두번 실행할 수 없으므로
			// 로직당 한번만 실행되도록 배치
			session.invalidate();
			System.out.println("계정 탈퇴완료");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("에러: " + e);
		} finally {
			// 연결끊기
			try {
		if (con != null && !con.isClosed()) {
			con.close();
		}
		if (pstmt != null && !pstmt.isClosed()) {
			pstmt.close();
		}

			} catch (SQLException e) {
		e.printStackTrace();
			}
		}
	}else{
		
	// session은 따로 말소키셔야 합니다
	session.invalidate();
	System.out.println("계정 비밀번호가 다름");
	response.sendRedirect("user_login_form.jsp");
	}

	%>
	<h1><%=getId%>계정 삭제가 완료되었습니다
	</h1>
	<br>
	<h2>회원 탈퇴가 완료되었습니다</h2>
	<br>
	<a href="user_login_form.jsp">로그인창으로</a>
</body>
</html>