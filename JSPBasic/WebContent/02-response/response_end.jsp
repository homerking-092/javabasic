<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// response.sendRedirect("주소")
		// 는 해당 코드가 실행될 경우 바로
		// 파라미터로 입력된 주소로 보내버립니다
		// 50%확률로 네이버로 내는 코드를 작성 ㄱㄱ
		// 안넘어갈때는 화면에 "<h1>안 넘어갔습니다</h1>"이 출력 되게 ㄱㄱ
		int num = (int)(Math.random() * 1) + 1;
		if(num == 1){
			response.sendRedirect("https://www.naver.com");
		}
//		switch(num){
//		case 1 : response.sendRedirect("https://www.naver.com");  break;
//		case 2 : out.println("<h1>안 넘어갔습니다</h1>"); break;
//		}
		
	%>
	<h1>안 넘어갔습니다</h1>

</body>
</html>