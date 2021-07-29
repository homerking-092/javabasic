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
	int stack;

	public String prize() {
		if (stack % 10 == 0) {
		}
		return "당첨";
	}
	
	%>

	<%
	int ranNum = (int) (Math.random() * 8) + 2;
	
	stack++;
	
	%>
	
	페이지 누적 요청 수:
	<%= stack %><br> 
	매 10번째 방문자에게는 기프티콘을 드립니다
	<br>
	<%= prize()%>
	
	<h2>
		랜덤 구구단(<%=ranNum%>단)
	</h2>
	이번에 나온 구구단은 <%=ranNum%>단입니다<br><br>
	<%
	for (int i = 1; i <= 9; i++) {
		out.print(ranNum + " x " + i + " = " + ranNum * i);
		out.println("<br>");
	}
	%>
     

</body>
</html>