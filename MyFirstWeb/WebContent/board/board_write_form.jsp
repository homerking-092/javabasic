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
			<h1 class="test-primary">글쓰기</h1>
		</div>
		<%-- 내부에글쓰기 폼 (타겟 주소는 /MyFirstWeb/boardwrite.do) --%>
		<form action="/MyFirstWeb/boardwrite.do" method="post">
			<div class="row">
				<div class="col-md-2">
					<h4 class="text-success">글제목</h4>
				</div>
				<div class="col-md-4">
					<input type="text" name="title" size="10">
				</div>
			</div>
			<div class="row">
				<div class="col-md-2">
					<h4 class="text-success">본문</h4>
				</div>
				<div class="col-md-4">
					<textarea rows="20" cols="20" name="content" class="form-control"></textarea>
				</div>
			</div>

			<div class="row">
				<div class="col-md-2">
					<h4 class="text-success">글쓴이</h4>
				</div>
				<div class="col-md-4">
					<input type="text" name="writer" class="form-control">
				</div>
			</div>
			<div class="row">
				<div class="col-md-2">
					<div class="btn-group">
						<input type="submit" value="글쓰기" class="btn btn-primary">
						<input type="reset" value="초기화" class="btn btn-warning">
					</div>
				</div>
			</div>

		</form>
	</div>
</body>
</html>