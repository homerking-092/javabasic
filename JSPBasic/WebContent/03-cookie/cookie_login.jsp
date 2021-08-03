<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie[] cookies = request.getCookies();
	// 로그인 창 만든 이후에 이미 로그인한 사람이 로그인창으로 오면
	// 바로 로그인 완료창으로 보내주기 위해 작성할 부분입니다
	// "user_id" 쿠키 존재 여부를 따져서 리다이렉트 시킵니다
	// cookie_welcome.jsp로 리다이렉트 시켜주세연
	
	Thread.sleep(200);
	
	for(Cookie c : cookies){
		String str = c.getName();
		
		if(str.equals("user_id")){
			response.sendRedirect("cookie_welcome.jsp");
		}
	}
	// 만약 아이디/비밀번호 기억하기가 체크되어 있는 경우
	// 처리해주기 위해 쿠키에서 아이디/비밀번호 값을 추출하는 로직
	// cookie_welcome.jsp 상단의 처리로직 참고
	// 추출한 아이디, 비밀번호를 콘솔창에 ㄱㄱ
	String userId = "";
	String userPw = "";
	
	
	// cookies 변수에 쿠키가 여러개 들어있음
	// 반복문을 이용해 하나하나 c에 번갈아가면서 한번씩 대입해서 코드 진행
	for(Cookie c : cookies){
		String cookieName = c.getName();
		
		// 저장한 쿠키의 이름이 "remeber_id"인 경우
		if(cookieName.equals("remember_id")){
			// rId 변수에 remember_id 변수에 저장해둔
			// 로그인 아이디를 저장
			userId = c.getValue();
			
		}
	System.out.println("userId: " + userId);
		
		if(cookieName.equals("remember_pw")){
			userPw = c.getValue();
		
//			if(cookieName.equals("user_id")){
//				response.sendRedirect("cookie_welcome.jsp");
//				}	
		
		}
	}
	System.out.println("userPw: " + userPw);
	
	
	
	
	
	
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
	<!-- 로그인 폼에는 checkbox를 이용해 자동그로인 여부까지 체크합니다 -->
	<form action="cookie_login_ok.jsp" method="post">
	 <input type="text" name="id" placeholder="ID" 
	 		value="<%=userId%>">
	 <input type="checkbox" name="id_check" value="yes">아이디 기억하기<br>
	 
	 <input type="password" name="pw" placeholder="PW"
	 		value="<%=userPw%>"><br>
	 <input type="checkbox" name="pw_check" value="yes">비밀번호 저장<br>
	 
	 <input type="submit" value="로그인">
	 <input type="reset" value="초기화">
	 
	</form>
	
</body>
</html>