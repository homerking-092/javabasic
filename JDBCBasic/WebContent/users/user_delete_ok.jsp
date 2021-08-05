<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
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

// System.out.println("세션 아이디 : " + getId);
// System.out.println("세션 비번 : " + getPw);
// System.out.println("폼 비번 : " + dpw);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 1. DAO를 생성하고
		UsersDAO dao = UsersDAO.getInstance();
		
		// 2. UsersVO를 생성하되, getPw(세션 pw), getId(세션 id)만 setter로 넣어주세요
		UsersVO user = new UsersVO();
		user.setUid(getId);
		user.setUpw(getPw);
		
		// 3. DAO의 deleteUsers 기능을 호출하면서 파라미터로 적절한 자료를 넘겨주세요
		int deleteResultNum = dao.usersDelete(user, dpw);
		// 삭제로직이 잘 들어가는지 디버깅
		System.out.println(deleteResultNum);
		
		// 4. 결과에 따라 세션만 파기할지 redirect까지 해줄지 결정
		if(deleteResultNum == 1){
			session.invalidate();
		} else if(deleteResultNum == 0){
			session.invalidate();
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