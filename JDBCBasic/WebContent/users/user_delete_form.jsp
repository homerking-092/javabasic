<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 회원 탈퇴를 진행합니다
	// "비밀번호를 한번 더 입력해 주세요" 라는 안내와 함께 비밀번호를 한번 더 입력하는 품을 만들어주세요
	
	/// 세션값 가져오기
	String getId = (String)session.getAttribute("i_s");

	// 로그인 상태에만 페이지 볼수 있도록
	if(getId == null){
		response.sendRedirect("user_login_form.jsp");
	}

	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><%=getId %>님 회원탈퇴를 진행합니다</h3><br>
	<h3>비밀번호를 한번 더 입력해 주세요</h3>
	<form action="user_delete_ok.jsp" method="post">
		<input type="password" placeholder="dpw" name="dpw"><br>
		
		<input type="submit" value="입력완료">
	</form>

</body>
</html>