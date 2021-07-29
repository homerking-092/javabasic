<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언부 예제 코드</title>
</head>
<body>
	<%!
		public int i = 15;
		public String str = "안녕하세요";
		int add(int n1, int n2){
			return n1 + n2;
		}
		int result = 10;
	%>
	<%
		//public int j = 50;		//스크립트릿 내부에서는 접근제한자 변수 선언 불가
		out.println(str + "<br>");
		out.println("10 + 5 = " + i + "<br>");
		out.println("16 + 14 = " + add(16,14) + "<br>");
		out.println(result);
	%>
</body>
</html>