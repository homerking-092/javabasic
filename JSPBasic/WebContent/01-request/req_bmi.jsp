<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>req_bmi.jsp</title>
</head>
<body>
	<form action="req_bmi_result.jsp" method="post">
		이름 : <input type="text" name="name" size="10px"><br>
		키 : <input type="text" name="height" size="10px">cm<br>
		체중 : <input type="text" name="weight" size="10px">kg<br>
		
		<input type="submit" value="확인">
		
		
	</form>
</body>
</html>