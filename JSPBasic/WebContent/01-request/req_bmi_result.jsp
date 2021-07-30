<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String height = request.getParameter("height");
	String weight = request.getParameter("weight");
	
	double cm = Double.parseDouble(height);
	double kg = Double.parseDouble(weight);
	
	// bmi 지수 계산공식 체중 / 신장(m) * 신장(m)
	double bmi = kg / (cm / 100 * cm / 100);	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BMI 계산 웹 어플리케이션</title>
</head>
<body>

	<h2>BMI 계산 웹 어플리케이션</h2><hr>
	
	이름 : <%= name %><br>
	키 : <%= cm %>cm<br>
	몸무게 : <%= kg %>kg<br>
	bmi 지수 : <%= bmi %><br><hr>
	
	<%
	if(bmi > 23){
		out.println("당신은 과체중입니다");
	}else if(bmi < 18.5){
		out.println("당신은 저체중입니다");
	}else{
		out.println("당신은 정상체중입니다");
	}
		
	%>
	

</body>
</html>