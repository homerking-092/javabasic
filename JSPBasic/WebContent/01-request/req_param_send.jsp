<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>객체에 파라미터 전달 예제</title>
</head>
<body>
	<!-- form 태그의 action은 데이터가 전달될 목직지입니다 
		현재, req_param_getpost로 날릴예정입니다 -->
	<form action="req_param_getpost.jsp" method="post"> <!-- method= 디폴트는 get -->
		<input type="text" name="id">아이디<br>
		<input type="password" name="pw">비밀번호<br>
		<input type="text" name="nick">닉네임<br>
		
		<!-- 체크박스 -->
		취미 :
		<input type="checkbox" name="hobby" value="요리">요리&nbsp;
		<input type="checkbox" name="hobby" value="운동">운동&nbsp;<br>	
		
		<!-- 특기 체크박스 추가, 취소 5개 이상 -->
		특기 : 
		<input type="checkbox" name="well" value="java">자바
		<input type="checkbox" name="well" value="jsp">jsp
		<input type="checkbox" name="well" value="spring">스프링
		<input type="checkbox" name="well" value="oracle">오라클
		<input type="checkbox" name="well" value="mysql">mysql<br>
		
		<!-- 성별은 하나만 골라야 하므로 radio를 사용합니다 -->
		<input type="radio" name="gender" value="male">남자&nbsp;		
		<input type="radio" name="gender" value="female">여자<br>	
		
		<!-- 식사여부 -->
		식사여부<br>
		<input type="radio" name="eat" value ="yes">먹음&nbsp;
		<input type="radio" name="eat" value ="no">안 먹음<br>
		
		<!-- select 태크는 선택지를 드롭박스로 줍니다 -->
		<select name="region">
			<option>서울</option>
			<option>경기</option>
			<option>충청</option>
			<option>전라</option>
			<option>경상</option>
			<option>강원</option>
			<option>제주</option>
		</select>
		<br>
			
        <input type="submit" value="submit">
		<input type="reset" value="reset">
		
	</form>
</body>
</html>