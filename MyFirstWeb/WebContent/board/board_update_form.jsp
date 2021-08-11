<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 수정폼</title>
</head>
<body>
	<h3>게시물 수정</h3>
	<form action="http://localhost:8181/MyFirstWeb/boardupdateok.do" method="post">
	
	<!-- hidden 태그를 이용해 나머지 요소들도 첨부 -->
	<input type="hidden" name="bId" value="${boardDetail.bId}">
	<input type="hidden" name="bHit" value="${boardDetail.bHit}">
	<input type="hidden" name="bDate" value="${boardDetail.bDate}">
	<input type="hidden" name="bName" value="${boardDetail.bName}">
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
			<td><input type="text" name="title" value="${boardDetail.bTitle}"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea rows="20" cols="40" name="content">${boardDetail.bContent}</textarea></td>
		</tr>
		<tr>
			<td>글쓴이</td>
			<td>${boardDetail.bName}</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="수정하기">
				<input type="reset" value="초기화">
				<a href="/MyFirstWeb/boardselect.do">
				<input type="button" value="게시글 목록"></a>
			</td>
		</tr>
	</table>
	</form>
	
	
</body>
</html>