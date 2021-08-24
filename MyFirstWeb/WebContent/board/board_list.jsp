<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- jstl 추가하기 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
	<h1>게시물 목록</h1>

	<a href="/MyFirstWeb/board/board_write_form.jsp"><input
		type="button" class="btn btn-danger" value="글쓰기"></a>
	<a href="/MyFirstWeb/userlogout.do"><input type="button"
		class="btn btn-link" value="로그아웃"> </a>

	<%-- 테이블 형태로 작성 --%>
	<table class="table table-striped table-hover">
		<thead>
			<tr>
				<th>글번호</th>
				<th>글제목</th>
				<th>글쓴이</th>
				<th>쓴날짜</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="board" items="${boardList}">
				<tr>
					<td>${board.bId}</td>
					<td><a href="/MyFirstWeb/boarddetail.do?bId=${board.bId}">${board.bTitle}</a></td>
					<td>${board.bName}</td>
					<td>${board.bDate}</td>
					<td>${board.bHit}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<%-- 페이징 버튼 만들기 
	표현할 글이 있는 경우에만 버튼을 표시함--%>
	<c:if test="${pageDTO.hasBoard() }">
		<%-- 표현할 글이 있다면 부트스트랩 페이징처리 적용 --%>
		<ul class="pagination justify-content-center pagination-sm">
			<%-- 뒤로가기 버튼을 표시할지 말지 결정하는 부분 --%>
			<c:if test="${pageDTO.startPage > 10}">
				<li class="page-item"><a class="page-link"
					href="/MyFirstWeb/boardselect.do?page=${pageDTO.startPage - 10}">
						« </a></li>
			</c:if>

			<%-- 페이지 번호 10개 묶음을 깔아주는 부분 --%>
			<c:forEach var="pNo" begin="${pageDTO.startPage}"
				end="${pageDTO.endPage}">
				<li class="page-item"><a class="page-link"
					href="/MyFirstWeb/boardselect.do?page=${pNo }">${pNo}</a></li>
			</c:forEach>

			<%-- 다음으로 가기 버튼을 표시할지 말지 결정하는 부분 --%>
			<c:if test="${pageDTO.endPage < pageDTO.totalPages }">
				<li class="page-item"><a class="page-link"
					href="/MyFirstWeb/boardselect.do?page=${pageDTO.startPage + 10}">
						» </a></li>
			</c:if>
		</ul>
		<%-- 페이지네이션 종료 --%>
	</c:if>
	<%-- 페이징 부분 끝 --%>


</body>
</html>