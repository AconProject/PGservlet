<%@page import="com.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/Image/gameLogo.png" />
<link href="${pageContext.request.contextPath}/CSS/MemberUpdate.css" rel="stylesheet">

<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">

		
</script>
</head>

<body>

	<!-- 페이지 상단 로고 및 배너 -->
	<jsp:include page="../common/header.jsp" flush="true"></jsp:include>

	<%
	MemberDTO dto = (MemberDTO) session.getAttribute("login");
	String mbrId = dto.getMbrId();
	String mbrPw = dto.getMbrPw();
	%>
	<!-- 메인화면 컨텐츠-->
	<!-- 안의 내용은 데이터 받아오면 변경 예정 -->
	<div class="wrapper">
		<h2>회원 탈퇴</h2>
		<!-- 상단 -->
		<section class="main-contents">

			<form action="../MemberDeleteServlet" name="deleteForm" method="post">

				<div class="row" style="display: inline;">
					<span class="title">아이디 * </span> 
					<input type="text" class="content" name="mbrId" id="mbrId" autofocus>
				</div>

				<div class="row">
					<span class="title">비밀번호 *</span> 
					<input type="text" class="content" name="mbrPw" id="mbrPw" autocomplete="off" placeholder="비밀번호를 입력해주세요">
				</div>


				<input type="checkbox" name="deleteCheck" id="deleteCheck">정말 삭제하시겠습니까?<br> <br> 체크 박스를 눌러야, 확인 버튼이 뜹니다. <br>
				<button type="submit">확인</button>
				<button type="reset">취소</button>

			</form>

		</section>

	</div>

	<!-- 페이지 최하단 배너 -->
	<jsp:include page="../common/footer.jsp" flush="false"></jsp:include>

</body>
</html>