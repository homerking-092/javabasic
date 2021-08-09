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
	
	<c:choose>
		<c:when test="${param.name == '김철수' }">
			<p>당신의 이름은 김철수 입니다</p>
		</c:when>
		<c:when test="${param.age > 19 }">
			<p>당신은 성인입니다</p>
		</c:when>
		<c:otherwise>
			<p>당신의 이름은 김철수도 아니고 미성년자입니다</p>
		</c:otherwise>
	</c:choose>
		
</body>
</html>