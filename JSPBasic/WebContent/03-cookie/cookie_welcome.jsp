<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 서버에서 발급한 전체 쿠키목록을 가져오는 코드를 완성 ㄱㄱ
	Cookie[] cookies = request.getCookies();

	String userId = null;
	
	// 향상된 for문을 이용해서도 처리할 수 있습니다
	for(Cookie c: cookies){
		// 쿠키 이름을 s변수에 저장해주세요
		String s = c.getName();
		
		if(s.equals("user_id")){
			// 쿠키 이름이 user_id인 경우 쿠키의 값을
			// userId 변수에 저장
			userId = c.getValue();
			break;
		}
	}
	
	if(userId != null){
		out.println(userId + "님 환영합니다");
	}else{
		out.println("시간이 지나 자동 로그아웃 되었습니다<br>");
		out.println("<a href = \"cookie_login.jsp\">다시 로그인</a>");		// 쌍따 안 \표시: 여닫는 목적X
	}
%>    
