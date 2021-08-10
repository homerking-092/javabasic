<%@page import="kr.co.ictedu.board.model.BoardVO"%>
<%@page import="kr.co.ictedu.board.model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BoardDAO dao = BoardDAO.getInstance();

	BoardVO boardDetail = dao.getBoardDetail("bId");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	${boardDetail }
	<table>
		
	</table>
</body>
</html>