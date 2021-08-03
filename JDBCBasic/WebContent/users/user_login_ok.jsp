<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 입력받은 아이디/비밀번호가 방금 가입시킨 유저의 것과 일치하면
	// id세션 발급을 해 주세연
	// 만약 틀리다면 login_fail.jsp로 리다이렉트 ㄱㄱㄱ
	
	String id = request.getParameter("uid");
	String pw = request.getParameter("upw");
	
	String getId = (String)session.getAttribute("uid");
	String getPw = (String)session.getAttribute("upw");
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
		if(id.equals("aaa") && pw.equals("aaa")){
			session.setAttribute("uid", id);
			session.setAttribute("upw", pw);
			
			out.println("아이디: " + id + "<br>");
			out.println("비번: " + pw);
						
			
			System.out.println("uid: " + id);
			System.out.println("upw: " + pw);
			System.out.println("getid: " + getId);
			System.out.println("getpw: " + getId);
			System.out.println("------------------");
			
		}else{
			response.sendRedirect("user_login_fail.jsp");
		}
	%>
	<h3><%= getId %>님 환영합니다</h3>
	
	
</body>
</html>