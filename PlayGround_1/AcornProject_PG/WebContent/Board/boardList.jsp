<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>BoardPage</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="${pageContext.request.contextPath}/CSS/BoardList.css?v=<%=System.currentTimeMillis() %>" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath}/JS/boardList.js?v=<%=System.currentTimeMillis() %>"></script>
</head>
<body>
	<!-- 페이지 상단 로고 및 배너 -->
    <jsp:include page="../common/header.jsp" flush="true"></jsp:include>

	<!-- 게시판 컨텐츠-->
    <div class="wrapper contents">

		<h1>게시판</h1>

		<select name="boardCategory">
			<option>일반글</option>
			<option>게임정보</option>
			<option>할인정보</option>
			<option>QnA</option>
		</select>

		<table>
			<tr>
				<td>카테고리</td>
				<td>제목</td>
				<td>작성자</td>
				<td>날짜</td>
				<td>조회수</td>
				<td>추천수</td>
			</tr>
		</table>

		<form action="BoardListServlet">
			<select name="searchCategory">
				<option>제목+작성자</option>
				<option>제목</option>
				<option>작성자</option>
			</select>
			<input type="text">
			<button type="submit"><img src="../Image/search.png" alt="검색"></button>
		</form>

		<button>글 작성</button>

		<div>
			<button>&lt;</button>
			<button>&gt;</button>
		</div>

    </div>


	<!-- 페이지 맨 밑부분 -->
    <jsp:include page="../common/footer.jsp" flush="true"></jsp:include>
</body>
</html>