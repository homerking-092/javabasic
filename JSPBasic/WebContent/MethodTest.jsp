<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MethodTest</title>
</head>
<body>
	<%!
		public double Celcius = 33.0;
		public double CtoF(double ctof) {
			return (ctof * 1.8) + 32;
			}
	%>

		<h2>오늘의 서울 날씨</h2>
	<%
		out.println("섭씨 온도: <b>" + Celcius + "</b><br>");
		out.println("화씨 온도: <b>" + CtoF(Celcius) + "</b>");
	%>
</body>
</html>