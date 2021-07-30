<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>객체에 파라미터 전달 예제</title>
</head>
<body>
	<!-- form 태그의 action은 데이터가 전달될 목직지입니다 
		현재, req_param_getpost로 날릴예정입니다 -->
	<form action="req_param_getpost.jsp">
		아이디: <input type="text" name="apple"><br>
		비번: <input type="password" name="banana"><br>
		
		깍두기: <input type="text" name="square"><br>
		
                제출: <input type="submit" value="submit"><br>
		리셋: <input type="reset" value="reset">
		
	</form>
</body>
</html>