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
	<h3>게시글 조회</h3>
	<table border="1">
<%-- 		<c:forEach var="board" items="${boardDetail }"> --%>
<!-- 		<tr> -->
<!-- 			<th>내용</th> -->
<%-- 			<td>${board.bContent}</td> --%>
<!-- 		</tr>	 -->
<%-- 		</c:forEach> --%>
	</table>
	${boardDetail }
</body>
</html>