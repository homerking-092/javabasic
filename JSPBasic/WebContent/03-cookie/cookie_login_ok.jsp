<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	
	// 0. post 방식 받아오기 처리
	response.setCharacterEncoding("utf-8");
	
	// 1. 아이디 비밀번호 받아오기
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	// 2. checkbox가 체크되었는지 여부도 받아옵니다
	String checkId = request.getParameter("id_check");
	String checkPw = request.getParameter("pw_check");
	
%>    
<!DOCTYPE html>
<html>


<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<body>
	<%
		// 아이디는 abc1234, 비밀번호는 aaa1111로 처리
		if(id.equals("abc1234") && pw.equals("aaa1111")){
			
			// 로그인 처리를 위한 쿠키 발급
			// 쿠키이름 "user_id", 쿠키값은 로그인할때 사용한 id
			Cookie idCookie= new Cookie("user_id", id);
			// 지속시간은 20초
			idCookie.setMaxAge(20);
			// 완성 후 쿠키 발송까지 작성
			response.addCookie(idCookie);
			
			// 체크박스가 체크되어 있을 경우, 아이디 비밀번호 자동입력을 위한
			// 쿠키를 발급하기(20초)
			// "rememeber_id", "remember_pw"를 쿠키 이름으로
			// id, pw를 쿠키값으로 가지는 쿠키 2개를 생성해 발송까지 ㄱㄱ
			// 단, 쿠키 발급은 checkId, checkPw값이 yes인 경우에만 발급
			if(checkId != null && checkId.equals("yes")){	/// null 체크부터 하지 않으면 &&연산?은 앞이 거짓이면 전부 거짓처리
						
			Cookie rId = new Cookie("remember_id", id);
			rId.setMaxAge(20);
			response.addCookie(rId);
			
			}
			if(checkPw != null && checkPw.equals("yes")){
			Cookie rPw = new Cookie("remember_pw", pw);
			rPw.setMaxAge(20);
			response.addCookie(rPw);
				
			}
			// 로그인 성공시 cookie_welcom.jsp로 보내주고
			response.sendRedirect("cookie_welcome.jsp");
		}else{
			// 로그인 실패시 "로그인에 실패했습니다" 라고 브라우저에 띄워주세요
			out.println("로그인에 실패했습니다");
		}
		
		
	%>
</body>

</html>