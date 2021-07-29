<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tag_quiz01</title>
</head>

<%-- 프로그램을 선언부, 스크립트릿을 활용
	페이지 누적 요청수는 계속해서 요청이 들어올 떄마다 1씩 증가(전역변수)
	 개별 요청수는 계속 1로 고정(지역변수)
	
	오늘의 행운의 숫자는 정수 1 ~ 10까지의 난수를 발생해 화면에 뿌려주는 메서드를 호출(숫자에 강조표시)
	행운의 색깔은 실수 0.0이상 1.0미만의 난수를 발생시켜서 
	난수값이 0.66 이상이면 "빨강" 
	0.33 이상이면 "노랑"을 
	그 이외는 "파랑"을 리턴하는 메서드를 호출해 표시--%>
<body>
	<%!
	//Declaration
	//jsp 파일에서 사용할 멤버변수, 메서드를 선언할 때
	int a = 0;

	int ranNum() {
		int num = (int) (Math.random() * 9) + 1;
		return num;
	}

	String red = "빨강";
	String yellow = "노랑";
	String bule = "파랑";
	double col = Math.random();
	public String ranCol() {
		if (col >= 0.66 ) {
			return red;
		} else if (col >= 0.33 && col < 0.66) {
			return yellow;
		} else {
			return bule ;
		}
	}%>
	<%
	// Scriptlet
	// 지역변수 및 메서드 내부의 코드를 작성하는 태그
	// 페이지 요청이 발생할 때마다 실행할 로직을 작성
	int b = 0;
	 a++;
	 b++;
	 
	 int num = ranNum();
	 String str = ranCol();
	
	%>
	<h1>Web 프로그래밍</h1>
	<br>
	<hr>
	페이지 누적 요청 수:
	<%= a %><br>
	페이지 개별 요청수:
	<%= b %>
	


	<h2>오늘의 행운의 숫자와 행운의 색깔</h2>
	행운의 숫자 :
	<b><%=num%></b>
	<br> 행운의 색깔 :
	<b><%=str%></b>



</body>
</html>