<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 1. 폼에서 던져준 데이터를 받습니다
	String uid = request.getParameter("uid");
	String uname = request.getParameter("uname");
	String email = request.getParameter("email");
	
	// 2. 던져준 데이터를 VO를 생성해 담습니다
	UsersVO user = new UsersVO();
	user.setUid(uid);
	user.setUname(uname);
	user.setEmail(email);
	
	// 3. dao를 생성해 userUpdate; 메서드를 호출합니다
	UsersDAO dao = UsersDAO.getInstance();
	int updateResult = dao.userUpdate(user);
	
	// 4. 업데이트 성공시 1, 실패시 0을 리턴받고
	//	0을 리턴받았을때는 user_update_fail.jsp로 리다이렉트
	//	1을 리턴받았을때는 하단 body태그 내에 "<계정명> 수정이 완료되었습니다"
	//	라는 메세지와 다시 로그인폼으로 돌아가는 링크를 띄워줍니다
	if(updateResult == 1){
		out.println("수정성공");
	}else if(updateResult == 0){
		response.sendRedirect("user_ipdate_fail.jsp");
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원정보 수정창</h3><br>
	<input type="button" value="뒤로가기" onclick="history.back(-1);">
</body>
</html>