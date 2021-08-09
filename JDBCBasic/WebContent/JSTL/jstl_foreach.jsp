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

	<h4>1부터 100까지의 합</h4>
	
	<%---- 변수 set ----%>
	<c:set var="sum" value="0"/>	<%-- int sum = 0; --%>
	
	<c:forEach var="n" begin="1" end="100">		<%-- n이라는 변수를 1 ~ 100까지 --%>
			<c:set var="sum" value="${sum + n }"/>
	</c:forEach>
	<%-- for(int i = 1; i <= 100; i++){
		sum = sum + 1;
		}
	 --%>
	 
	 <%-- out.println() --%>
	 ${sum }	<br>
	 <c:out value="${sum }"></c:out>
	 
	 <hr>
	 <h4>1부터 100까지의 홀수의 합</h4>
	
	<%---- 변수 set ----%>
	<c:set var="sum" value="0"/>	<%-- int sum = 0; --%>
	
	<c:forEach var="n" begin="1" end="100" step="2">		<%-- n이라는 변수를 1 ~ 100까지 --%>
															<%-- step 디폴트값: 1 --%>
															<%-- step="2" 2씩증가 --%>
			<c:set var="sum" value="${sum + n }"/>
	</c:forEach>
	<%-- for(int i = 1; i <= 100; i++){
		sum = sum + 1;
		}
	 --%>
	 
	 <%-- out.println() --%>
	 ${sum }	<br>
	 <c:out value="${sum }"></c:out>
	
</body>
</html>