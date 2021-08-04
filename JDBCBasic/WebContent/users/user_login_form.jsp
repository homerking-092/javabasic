<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 세션이 존재하면 바로 user_login_ok.jsp로 보내주는 로직을 작성
	String getId = (String)session.getAttribute("i_s");
	if(getId != null){
		response.sendRedirect("user_login_ok.jsp");
	}
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 회원 로그인 폼을 만들어주세요 
		아이디/비밀번호를 입력받습니다
		회원로그인 폼 아래쪽에는 링크를 회원가입폼으로 넘어가도록 추가해주세연-->
		
	<h1>로그인 창</h1>
	<form action="user_login_ok.jsp" method="post">
		<input type="text" name="uid" placeholder="아이디"><br>
		<input type="password" name="upw" placeholder="비번"><br>
		
		<input type="submit" value="로그인"><br>
		<input type="reset" value="초기화"><br>
	</form>
	
	<a href="users_join_form.jsp">회원가입</a>
	
</body>
</html>