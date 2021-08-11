<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글쓰기</h1>
	<%-- 내부에글쓰기 폼 (타겟 주소는 /MyFirstWeb/boardwrite.do) --%>
	<form action="/MyFirstWeb/boardwrite.do" method="post">
		<table border="1">
			<tr>
				<td>글제목</td>
				<td><input type="text" name="title" size="10"></td>
			</tr>
			<tr>
				<td>본문</td>
				<td><textarea rows="20" cols="20" name="content"></textarea></td>
			</tr>
			<tr>
				<td>글쓴이</td>
				<td><input type="text" name="writer" size="10"></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="등록"> 
					<input type="reset"	value="초기화">
				</td>	
			</tr>
		</table>
	</form>

</body>
</html>