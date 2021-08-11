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
		<tr>
			<td>번호</td>
			<td>${boardDetail.bId}</td>
			<td>조회수</td>
			<td>${boardDetail.bHit}</td>
		</tr>
		<tr>
			<td>쓴 날짜</td>
			<td>${boardDetail.bDate}</td>
		</tr>
		<tr>
			<td>글 제목</td>
			<td>${boardDetail.bTitle}</td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea rows="20" cols="40">${boardDetail.bContent}</textarea></td>
		</tr>
		<tr>
			<td>글쓴이</td>
			<td>${boardDetail.bName}</td>
		</tr>
		<tr>
			<td><a href="/MyFirstWeb/boardselect.do">
				<input type="button" value="게시글 목록"> </a>
				<form action="/MyFirstWeb/boarddelete.do" method="post">
					<input type="hidden" value="${boardDetail.bId }" name="bId"/>
					<input type="submit" value="삭제하기"/>
				</form>
				<form action="/MyFirstWeb/boardupdate.do" method="post">
					<input type="hidden" value="${boardDetail.bId }" name="bId">
					<input type="submit" value="수정하기"> 
				</form>
			</td>
		</tr>
	</table>
	

</body>
</html>