<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 1. 세션을 통해 아이디를 가져옵니다
	// 	만약 로그인 상태가 아니면 로그인창으로 리다이렉트합니다
	String getId = (String) session.getAttribute("i_s");
	

	if(getId == null){
		response.sendRedirect("user_login_form.jsp");
	}
		
	// 2. dao를 통해 UsersVO를 가지고 와야 합니다
	UsersDAO dao = UsersDAO.getInstance();
	UsersVO user = new UsersVO();
	user.setUid(getId);
	
	// 3. 들고온 UsersVO를 이용해 아래 html태그의 value속성에
	// 	USersVO의 아이디, 이름, 이메일을 기입하게 만들어줍니다
	UsersVO resultData = dao.getUserInfo(user);	
	System.out.println("디비에서 가져온 데이터: " + resultData);
	
// 	System.out.println("id: " + resultData.getUid());
// 	System.out.println("name: " + resultData.getUname());
// 	System.out.println("email: " + resultData.getEmail());
	
	if(resultData.getUid() == null){
		session.invalidate();
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
	<h3><%= resultData.getUid() %>의 계정정보 수정창 </h3>
	<!-- 폼은 내부에 아아디(단, disable="true"도 입력해주세연
		비밀번호, 이름, 이메일 -->
		<form action="user_update_ok.jsp" method="post">
			<input type="text" name="uid" required value="<%= resultData.getUid() %>" placeholder="아이디" readonly><br>			
			<input type="password" name="upw" placeholder="비밀번호"><br>			
			<input type="text" name="upname" required value="<%= resultData.getUname() %>" placeholder="이름"><br>			
			<input type="text" name="upemail" value="<%= resultData.getEmail() %>" placeholder="이메일"><br>
			
			<input type="submit" value="계정정보 &nbsp수정하기">
		</form>
</body>
</html>