<%@page import="sun.tools.jar.resources.jar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/*
		- 세션에 저장된 데이터는 브라우저 창이 종료될 때가지
		혹은 세션의 유효기간이 만효되기 전까지 웹 어플리케이션
		내부의 모든 JSP파일에서 데이터를 호출해 쓸 수 있습니다
		
		- 세션에 저장된 데이터를 가져오려면 session 객체의
		getAttribute() 메서드를 사용하며, 파라미터로
		가져올 데이터의 세션명을 적어주면 매칭된 세션값이 호출됩니다
	*/
	
	String userId = (String)session.getAttribute("id_session");
	String userName = (String)session.getAttribute("name_session");
	String JSP = (String)session.getAttribute("JSP");
	
	out.println(userId + "<br>");
	out.println(userName + "<br>");
	out.println(JSP + "<br>");
	out.println("------------------------<br>");
	
	
	// 세션의 유효시간은 아래의 메서드를 사용합니다
	// 기본 시간은 30분으로 세팅되어 있고(디폴트 세팅) 바꾸면 초 단위로
	// 입력해 바꿔줄 수 있습니다
	//session.setMaxInactiveInterval(29);		// 유효시간을 29초로 조정
	int sTime = session.getMaxInactiveInterval();
	out.println("세션의 유효시간: " + sTime + "초<br>");
	out.println("-------------------------------------<br>");
	
	// 특정 세션 데이터 삭제하기
	userName  = (String)session.getAttribute("name_session");
	out.println("name_session 삭제 전: " + userName + "<br>");
	
	// 세션 내부의 name_session 삭제
	session.removeAttribute("name_session");
	userName = (String)session.getAttribute("name_session");
	out.println("name_session 삭제 후: " + userName + "<br>");
	
	// 세션 일괄적으로 삭제하기
	userId = (String)session.getAttribute("id_session");
	JSP = (String)session.getAttribute("JSP");
	
	out.println("id_session 삭제 전: " + userId + "<br>");
	out.println("JSP 삭제 전: " + JSP + "<br>");
	
//	session.invalidate();
	
	if(request.isRequestedSessionIdValid()){
		out.println("유효세션이 존재함");
	}else{
		out.println("유효세션이 존재하지 않음");
	}
		out.println("<br>-------------------------<br>");
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>










