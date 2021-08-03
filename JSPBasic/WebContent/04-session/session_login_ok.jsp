<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// session_login.jsp 에서 보내온 데이터를 획득한 다음
	
	// 한글깨짐 방지
	response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");	

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String nick = request.getParameter("nick");
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
		
		// id가 "kkk1234", pw가 "1111"인지 비교해서 둘 다 통과하는 경우
		if(id.equals("kkk1234") && pw.equals("1111")){
		// "session_id" 에 id를, "session_pw"에 pw를 "session_nick" 에 nickname을 저정하고
			session.setAttribute("session_id", id);
			session.setAttribute("session_pw", pw);
			session.setAttribute("session_nick", nick);
			
		// session_welcome.jsp 로 보내줍니다
			response.sendRedirect("session_welcome.jsp");
		}else{
			out.println("없는 아이디입니다<br>");
			
		// 만약 둘 다 통과하지 못했다면 다시 session_login.jsp로 리다이렉트합니다
			//response.sendRedirect("session_login.jsp");
		}	
	%>
	
	<a href="session_login.jsp">로그인창 돌아가기</a>
</body>
</html>