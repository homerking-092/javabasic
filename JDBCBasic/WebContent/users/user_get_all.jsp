<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="java.util.*"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%
	// DB에서 전체 회원 데이터를 들고 나옵니다
	// 1. getAllUser() 메서드를 dao를 이용해 호출합니다
	//	호출시 리턴되는 ArrayList를 변수에 담아주세요
	UsersDAO dao = UsersDAO.getInstance();
	
	ArrayList<UsersVO> userResult = dao.getAllUser();
	
	// 디버깅 
// 	System.out.println(userResult);
	
	// 로그인하지 않은 사용자가 목록을 볼 수 없고 다시 로그인창으로 돌아가는 로직
	String getId = (String)session.getAttribute("i_s");
	
	if(getId == null){
		response.sendRedirect("user_login_form.jsp");
	}

	
	
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모든 회원조회</title>
</head>
<body>
	<h1>전체 회원 목록</h1>
	
	<table border="1">
		<thead>
			<tr>
				<th>회원 아이디</th>
				<th>회원 이름</th>
				<th>회원 이메일</th>
			</tr>					
		</thead>
		<tbody>
		
		<%-- userList는 VO의 집합이고, 여기서 UsersVo를 하나하나 순차적으로 뽑아서 출력해야 하므로
			향상된 for문(반목문)을 사용합니다 --%>
<%-- 		<%  for(UsersVO user : userResult){%>  --%>
<!-- 			<tr> -->
<%-- 				<td><%= user.getUid() %></td> --%>
<%-- 				<td><%= user.getUname()%></td> --%>
<%-- 				<td><%= user.getEmail()%> </td> --%>
<!-- 			</tr> -->
<%-- 		<%} %>  --%>
		
		<%--------------------------------------------------------------------- --%>
			<%-- JSTL 적용버전 
				foreach 구문은 반복문이고, Items에 향상된 for문의 우측요소
				그리고 var에 왼쪽 요소를 집어넣어주면 됩니다--%>
			<c:forEach var="user" items="${userList}">
				<tr>
					<td>${user.uid}</td>
					<td>${user.uname}</td>
					<td>${user.email}</td>					
				</tr>	
			</c:forEach>
		
			
		</tbody>
		
	</table>
	<br>
	<input type="button" value="뒤로가기" onclick="history.back();" />
	
	

	
</body>
</html>