<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
%>    
    
    <!-- 로직을 
    	1. 로그인 성공(아이디 및 비번 모두 다 같을 때
    	2. 로그인 실패(if문의 특성을 활용해서 아이디만 같을도 해도 1.번을 통과했다는 의미는 비번이 틀렸다는 의미이기 때문에
    		아이디만 비교해줘도 된다
    	3. 그 이외 (로그인 실패 : 아이디조차 존재하기 않을 때)
    	이렇게 짜면 존나 완벽해 보임
     -->
<!DOCTYPE html>
<html>

<% if(id.equals("abcd") && !pw.equals("1234")){ %>
<head>
<meta charset="UTF-8">
<title>로그인 실패!</title>
</head>
<body>
	<b>로그인에 실패하셨습니다</b><br>
	<b>비밀번호가 다릅니다</b><br>
	<a href="req_login_form.jsp">로그인창으로 돌아가기</a>

</body>

<%}else if(!id.equals("abcd")) {%>
<head>
<meta charset="UTF-8">
<title>로그인 실패!</title>
</head>
<body>
	<b>로그인에 실패하셨습니다</b><br>
	<b>아이디가 없습니다</b><br>
	<a href="req_login_form.jsp">로그인창으로 돌아가기</a>

</body>

<%}else{ %>
<head>
<meta charset="UTF-8">
<title>로그인 성공!</title>
</head>
<body>
	<b><%=id %></b>님 환영합니다

</body>

<%} %>


</html>