<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<h3 class="test-primary">회원가입창</h3>
		</div>
		<form action="/MyFirstWeb/join.do" method="post">
			<div class="row">
				<div class="col-md-5">
					<div class="input-group">
						<div class="input-group-prepend">
							<span class="input-group-text">id</span>
						</div>
						<input type="text" name="uId" placeholder="id">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-5">
					<div class="input-group">
						<div class="input-group-prepend">
							<span class="input-group-text">pw</span>
						</div>
						<input type="password" name="uPw" placeholder="pw">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-5">
					<div class="input-group">
						<div class="input-group-prepend">
							<span class="input-group-text">이름</span>
						</div>
						<input type="text" name="uName" placeholder="name">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-5">
					<div class="input-group">
						<input type="email" name="email" placeholder="email">
						<div class="input-group-append">
							<span class="input-group-text">@goo.com</span>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-2">
					<div class="btn-group">
						<input type="submit" value="가입" class="btn btn-warning"> <a
							href="http://localhost:8181/MyFirstWeb/users/user_login_form.jsp">
							<input type="button" value="로그인" class="btn btn-warning">
						</a>
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
</html>