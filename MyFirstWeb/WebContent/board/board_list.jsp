<%@page import="kr.co.ictedu.board.model.BoardVO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="kr.co.ictedu.board.model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- jstl 추가하기 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   

<%
	BoardDAO dao = BoardDAO.getInstance();

	List<BoardVO> boardList = dao.getBoardList();
	
// 	String getId = (String)session.getAttribute("i_s");
	
	
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시물 목록</h1>
	
	<%-- 테이블 형태로 작성 --%>
	<table border="1">
		<thead>
		<tr>
			<th>글번호</th>
			<th>글제목</th>
			<th>글쓴이</th>
			<th>쓴날짜</th>
			<th>조회수</th>
		</tr>
		</thead>
		<tbody>
			<c:forEach var="board" items="<%= boardList %>">
				<tr>
					<td>${board.bId}</td>
					<td><a href="board_detail.jsp">${board.bTitle}</a></td>
					<td>${board.bName}</td>
					<td>${board.bDate}</td>
					<td>${board.bHit}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>