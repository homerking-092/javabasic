<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//post방식 한글 깨짐 방지
	response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");	

	// 입력받은 아이디/비밀번호가 방금 가입시킨 유저의 것과 일치하면
	// id세션 발급을 해 주세연
	// 만약 틀리다면 login_fail.jsp로 리다이렉트 ㄱㄱㄱ
	
	String uid = request.getParameter("uid");
	String upw = request.getParameter("upw");
	
	String getId = (String)session.getAttribute("i_s");
//	String getPw = (String)session.getAttribute("upw");

	//(수정) 유저 패스워드도 세션을 같이 발급히켜서 user_delete_ok에서
	// 비밀번호 대조하는데 활용

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// DB연결로직을 집어넣어주세요
		Connection con = null;
	
		PreparedStatement pstmt = null;
		ResultSet rs = null;		// select로 조회하기 위해
		
		// if ~ else문으로 try ~ catch ~ finally로 감싸서
		// 세션이 존재할 때는 DB에서 데이터를 가져오는 로직을 생략해주세요
		
		if(getId != null){
			uid = getId;
			
		}else{
			
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/ict03";
			con = DriverManager.getConnection(url, "root", "mysql");
			
			// 1. SELECT 쿼리문을 작성합니다
			// 입력받은 id가 실제로 DB에 존재하는지 조회하는 쿼리문 작성
			String sql = "SELECT * FROM users WHERE uid = ?";
			
			// 2. 쿼리문의 ?자리에 적용할 변수를 집어넣습니다
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, uid);
			
			// 3. 쿼리문 실행 및 데이터 받아오기
			rs = pstmt.executeQuery();
			
			// rs.next()를 통해 데이터가 들어왔는지 안 들어왔는지 확인
				
			if(rs.next()){
			
			// 들어왔다면 DB쪽 데이터 받기
			String dbId = rs.getString("uid");
			String dbPw = rs.getString("upw");
			
			// 폼에서 보낸 데이터와 DB쪽 데이터간 아이디 비밀번호 일치여부 비교해서
			// 아이디와 비밀번호 모두 일치시 세션 발급 및 body태그에 id 출력
			// 비밀번호가 틀린 경우 역시 user_login_fail.jsp로 보내줌
			
			if(uid.equals(dbId) && upw.equals(dbPw)){
				
				session.setAttribute("i_s", uid);
				session.setAttribute("p_s", upw);
				
				System.out.println("입력한 아이디: " + uid);
			}else{
				response.sendRedirect("user_login_fail.jsp");
			}
			
			
			// 들어오지 않았다면 user_login_fail.jsp로 리다이렉트
			}else{
				System.out.println("잘못 입력한 아이디: " + uid);
				response.sendRedirect("user_login_fail.jsp");
			}			
			

			
		}catch(ClassNotFoundException e){
			System.out.println("드라이버 로딩 실패");
		}catch(SQLException e){
			System.out.println("에러: " + e);
		} finally{
			// 연결끊기
			try{
				if(con != null && !con.isClosed()){
					con.close();
				}
				if(pstmt != null && !pstmt.isClosed()){
					pstmt.close();
				}
				if(rs != null && !rs.isClosed()){
					rs.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
			
		
		}
		
		
	%>
	
	<h1><%= uid %>님 환영합니다</h1>
	<h1>로그인이 완료되었습니다</h1>
	<a href="user_logout.jsp">로그아웃</a><br>
	<a href="user_delete_form.jsp">회원탈퇴</a>
	
	
</body>
</html>