<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:set var="board" value="${boardDetail }"/>
	<h3>게시글 조회</h3>
	<table border="1">
		
		<tr>
			<th>번호</th>
			<td>${board.bId}</td>
		</tr>	
		<tr>
			<th>글쓴이</th>
			<td>${board.bName}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${board.bContent}</td>
		</tr>
	</table>
<%-- 	${boardDetail } --%>
</body>
</html>