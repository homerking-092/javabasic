<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		
	%>
	<h1>로또번호 생성 결과</h1>
	<%
	List<Integer> list = new ArrayList<Integer>();
		int num = 0;
	while(list.size() < 6){
		num = (int)(Math.random() * 46) + 1;
		if(!list.contains(num)){
			list.add(num);
		}
	}
	Collections.sort(list);
	out.println("이번주 로또 번호<br>");
	out.println(list);
	%>
</body>
</html>