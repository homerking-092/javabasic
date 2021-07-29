<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!	// 선언부
		public boolean TrueOrFalse(int a, int b){
			if(a >= b){
				return true;
			}else if(a < b){
				
			}
			return false;	
			
	}
	%>
	<%	// 스크립틀렛
		out.println("스크립트릿으로 출력된 값: <b>" + TrueOrFalse(1, 2) + "</b><br>");
	%>
	
	표현식으로 출력된 값 : <b><%= TrueOrFalse(1, 2) %></b>	
	
	
	
	
</body>
</html>