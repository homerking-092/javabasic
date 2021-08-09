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
	<%-- jstl_choose_test.jsp를 타겟으로 해서 점수를 입력하는 폼 --%>
	<form action="jstl_choose_test.jsp">
		<input type="text" name="score" size="5"><br>
		
		<input type="submit" value="입력완료">
		<input type="reset" value="초기화">
	</form>
	

</body>
</html>