<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 쿠키 생성 방법
	// 1. 쿠키 객체를 생성 - 생성자의 파라미터로
	// 쿠키의 이름 및 저장할 데이터를 입력
	Cookie appple = new Cookie("apple_cookie", "사과맛");
	Cookie peanut = new Cookie("peanut_cookie", "땅콩맛");
	
	// 2. 쿠키클래스의 setter 메서드로 쿠키의 속성들 설정하기	//default값 30분
	appple.setMaxAge(60 * 60);						// 쿠키의 유효시간 설정 -> 1시간(60 * 60초)
	peanut.setMaxAge(20);							// 초단위로 설정 -> 20초
	
	// 3. http 응답시 response 객체에 생성된 쿠키를 탑재하여
	// 클라이언트로 전송까지 마쳐줘야 사용자 PC에 해당 정보가 저장됨
	response.addCookie(appple);
	response.addCookie(peanut);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="cookie_check.jsp">쿠키 직접 확인해보기</a>

</body>
</html>