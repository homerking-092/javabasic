<%@page import="java.util.*"%>
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
	// 선언부에 작성한 변수들은 단 한 번만 선언됩니다
	// 선언부에 작성한 변수들은 전역변수로 취급되어 외부 어디서건 호출이 가능합니다
	
	/// 힙 영역에 올라가고 변수는 자동으로 초기화 
	///cf> stack영역에 있는 변수는 자동으로 초기화 x(전역변수)
	
	List<String> list = new ArrayList<String>();
	String job;

	int jobNum;
	public String jobber() {
		jobNum = (int) (Math.random() * 4) + 1;
		if (jobNum == 1) {
			return "전사";
		} else if (jobNum == 2) {
			return "도적";
		} else if (jobNum == 3) {
			return "사냥꾼";
		} else if (jobNum == 4) {
			return "마법사";
		} else  {
			return "사제";
		}

	}
	%>
	
	<%
	
	// String job = " ";	
		int j = (int) (Math.random() * 4) + 1;
	switch (j) {
	case 1: job = "전사"; break;
	case 2: job = "도적"; break;
	case 3: job = "사냥꾼"; break;
	case 4: job = "마법사"; break;
	case 5:	job = "사제"; break;
	}

	list.add(job);

	// job에 같은 직업이 몇명 있는지 확인
	int cnt = 0;
	for (String saram : list) {
		if (job.equals(saram)) {
			cnt += 1;
		}
	}
	%>


	<h1>당신의 역할</h1>
	<p>
		당신에게 부여된 역할은 <b><%=job%></b> 입니다<br> 
		현재 파티에 당신과 같은 역할을 가진 플레이어는<%=cnt%>명입니다<br><br> 
		현재 파티 구성<br>
		<%=list.toString()%> (<%=list.size()%>명 참가중)
	</p>
	<%
		
		if (list.size() == 10) {
		list.clear();
		
		// !!향상된 for문 && ArrayList!!!!!!!!!!!
	}
	%>


</body>
</html>