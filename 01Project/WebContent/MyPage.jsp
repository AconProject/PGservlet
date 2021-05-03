<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyPage</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://unpkg.com/ress/dist/ress.min.css">
<link href="CSS/MyPage.css" rel="stylesheet">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		
		$("#profile").on("click", function() {
			var page = $("#page").page
		};
	});
</script>
</head>
<body>
	<header>
		<div class="wrapper">
			<h1>
				<a href="Main.jsp"><img class="logo" src="Image/logo.png" alt="로고 이미지"></a>
			</h1>
			<nav>
				<div class="empty"></div>
				<ul class="nav">
					<li><a href="#">게시판</a></li>
					<li><a href="#">뉴스 및 소식</a></li>
					<li><a href="Login.jsp">로그인</a></li>
					<li><a href="MemberAdd.jsp">회원가입</a></li>
				</ul>
			</nav>
		</div>
	</header>
	<div class="wrapper">
	<h2>마이페이지</h2>
	<aside class="side">
	 	<div id="profile">프로필</div>
	 	<div id="update">정보수정</div>
	</aside>
	<section class="content">
		<jsp:include id="page" page="Profile.jsp" flush="true"></jsp:include>
	</section>
	</div>
</body>
</html>