<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PlayGround</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="CSS/MyPage.css" rel="stylesheet">
</head>
<body>
	<!-- 페이지 상단 로고 및 배너 -->
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
					<li><a href="MyPage.jsp">마이페이지</a></li>
					<li><a href="#">로그아웃</a></li>
				</ul>
			</nav>
		</div>
    </header>

	<!-- 메인화면 컨텐츠-->
	<!-- 안의 내용은 데이터 받아오면 변경 예정 -->
    <div class="wrapper">
		<h2>마이페이지</h2>
		<!-- 상단 -->
        <section class="main-contents">
        
			<div class="container">
				<div class="side">
	 				<div class="menu" id="profile" onclick="location.href='MyPage.jsp'">프로필</div>
	 				<div class="menu" id="update" onclick="location.href='MemberUpdate.jsp'">정보수정</div>
				</div>
				<div class="content">
					<form action="MemberUpdate.jsp" method="post">
						<input type="hidden" value="" name="mbrId">
						<!-- hidden으로 데이터 전달  -->
						<div class="member">아이디 &nbsp;&nbsp;&nbsp; <span>aaa</span>
						</div><br>
						
						<div class="member">닉네임 &nbsp;&nbsp;&nbsp; <span>bbb</span>
						</div><br>
						
						<div class="member">이메일 &nbsp;&nbsp;&nbsp; <span>ccc@ccc.com</span>	
						</div><br>
						
						<div class="member">선호장르 &nbsp;&nbsp;&nbsp; 
						<a href="#" class="tag">#로드라이크</a>
						<a href="#" class="tag">#로드라이크</a>
						<a href="#" class="tag">#로드라이크</a>
						<a href="#" class="tag">#로드라이크</a>
						<a href="#" class="tag">#로드라이크</a>
						</div><br>
						
						<button type="submit">수 정</button>
					</form>
				</div>
			</div>
        </section>

	</div>	
	<!-- 페이지 최하단 배너 -->
    <footer>
        <div class="wrapper">
            <p><small>&copy; 2021 PlayGround</small></p>
        </div>
    </footer>
</body>
</html>