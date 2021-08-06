<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
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

String getId = (String) session.getAttribute("i_s");
// String getName = (String) session.getAttribute("n_s");
// String getEmail = (String) session.getAttribute("e_s");
	String getPw = (String)session.getAttribute("upw");



//(수정) 유저 패스워드도 세션을 같이 발급히켜서 user_delete_ok에서
// 비밀번호 대조하는데 활용

// System.out.println("id:" + uid);
// System.out.println("pw:" + upw);
// System.out.println("세션 아이디: " + getId);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%	
		// 세션이 존재할 때는 db에서 데이터를 가져오는 로직을 생략해주세연
		if (getId != null) {
		uid = getId;
		} else {
		
		// dao 생성
		UsersDAO dao = UsersDAO.getInstance();

		// dao로 로그인 검사
		UsersVO user = new UsersVO();
		user.setUid(uid);
		user.setUpw(upw);

		int loginResult = dao.userLogin(user);
		System.out.println("결과코드: " + loginResult);
		
		/// 로그인에 성공 한다면 세션 발급
		if (loginResult == 1) {
			session.setAttribute("i_s", uid);
			session.setAttribute("p_s", upw);
			System.out.println("로그인이 완료 되었습니다");
		} else if (loginResult == 0) {
			session.invalidate();
			response.sendRedirect("user_login_fail.jsp");
			System.out.println("비밀번호가 다릅니다");
		} else if(loginResult == -1){
			System.out.println("없는 아이디입니다");
			response.sendRedirect("user_login_fail.jsp");
			
		}
	}
	%>

	<h1><%=uid%>님 환영합니다
	</h1>
	<h1>로그인이 완료되었습니다</h1>
	<a href="user_logout.jsp">로그아웃</a>
	<br>
	<a href="user_delete_form.jsp">회원탈퇴</a><br>
	<a href="user_update_form.jsp">회원정보 수정하기</a><br>
	<a href="user_info.jsp">회원 정보 </a><br>
	
	<!-- 파일에 회원 전체 목록 보기 링크 -->
	<a href="user_get_all.jsp">회원전체 목록</a>


</body>
</html>