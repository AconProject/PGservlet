<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>MainPage</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://unpkg.com/ress/dist/ress.min.css">
    <link href="${pageContext.request.contextPath}/CSS/Main.css?v=<%=System.currentTimeMillis() %>" rel="stylesheet">
    <script type="text/javascript" src="JS/main.js?v=<%=System.currentTimeMillis() %>"></script>
</head>
<body>
	<!-- 페이지 상단 로고 및 배너 -->
    <header>
		<div class="wrapper">
			<h1>
				<a href="Main.jsp"><img class="logo" src="${pageContext.request.contextPath}/Image/logo.png" alt="로고 이미지"></a>
			</h1>
			<nav>
				<div class="empty"></div>
				<ul class="nav">
					<li><a href="#">게시판</a></li>
					<li><a href="#">뉴스 및 소식</a></li>
					<li><a href="LoginForm.jsp">로그인</a></li>
					<li><a href="MemberForm.jsp">회원가입</a></li>
				</ul>
			</nav>
		</div>
    </header>

	<!-- 메인화면 컨텐츠-->
    <div class="wrapper">

		<!-- 메인 상단 -->
        <section class="main-contents">
			<button id="newGame" class="gamesBtn">최신게임</button>
			<button id="recommendedGame" class="gamesBtn">추천게임</button>
			<div class="container">
				<div>
					<table class="topTable">
						<tr id="topTableNum"></tr>
						<tr id="topTableImg"></tr>
						<tr id="topTableName"></tr>
						<tr id="topTableYear"></tr>
						<tr id="topTableCategory"></tr>
					</table>
				</div>
				<div>
					<ol class="topChart" id="topChart" start="4"></ol>
				</div>
			</div>
        </section>

		<!-- 메인 중단 -->
        <section class="main-contents">
			<div class="container">
				<div>
					<table class="midTable" id="midTable"></table>
				</div>
				<div class="tagScroll">
					<input type="checkbox" name="tag" value="협동">협동<br>
					<input type="checkbox" name="tag" value="웅장한 사운드트랙">웅장한 사운드트랙<br>
					<input type="checkbox" name="tag" value="무료">무료<br>
					<input type="checkbox" name="tag" value="생존">생존<br>
				</div>
			</div>
        </section>

		<!-- 메인 하단 -->
		<section class="main-contents">
			<div class="bestBoard">
				<p>게임 베스트</p><p>질문 답변 베스트</p>
			</div>
			<div class="container">
				<div>
					<button class="boardBtn" id="recommendedPost">추천</button>
					<button class="boardBtn" id="mostViewPost">조회</button>
					<ol class="boardChart">
						<li><a href="#">
							title
							<img class="icon" src="Image/eye.png" alt="조회수"> <span>123</span>
							<img class="icon" src="Image/thumb.png" alt="추천수"> <span>123</span>
							</a><hr>
						</li>
						<li><a href="#">
							title
							<img class="icon" src="Image/eye.png" alt="조회수"> <span>123</span>
							<img class="icon" src="Image/thumb.png" alt="추천수"> <span>123</span>
							</a><hr>
						</li>
						<li><a href="#">
							title
							<img class="icon" src="Image/eye.png" alt="조회수"> <span>123</span>
							<img class="icon" src="Image/thumb.png" alt="추천수"> <span>123</span>
							</a><hr>
						</li>
						<li><a href="#">
							title
							<img class="icon" src="Image/eye.png" alt="조회수"> <span>123</span>
							<img class="icon" src="Image/thumb.png" alt="추천수"> <span>123</span>
							</a><hr>
						</li>
					</ol>
				</div>
				<div>
					<button class="boardBtn" id="recommendedQnA">추천</button>
					<button class="boardBtn" id="mostViewQnA">조회</button>
					<ol class="boardChart">
						<li><a href="#">
							title
							<img class="icon" src="Image/eye.png" alt="조회수"> <span>123</span>
							<img class="icon" src="Image/thumb.png" alt="추천수"> <span>123</span>
							</a><hr>
						</li>
						<li><a href="#">
							title
							<img class="icon" src="Image/eye.png" alt="조회수"> <span>123</span>
							<img class="icon" src="Image/thumb.png" alt="추천수"> <span>123</span>
							</a><hr>
						</li>
						<li><a href="#">
							title
							<img class="icon" src="Image/eye.png" alt="조회수"> <span>123</span>
							<img class="icon" src="Image/thumb.png" alt="추천수"> <span>123</span>
							</a><hr>
						</li>
						<li><a href="#">
							title
							<img class="icon" src="Image/eye.png" alt="조회수"> <span>123</span>
							<img class="icon" src="Image/thumb.png" alt="추천수"> <span>123</span>
							</a><hr>
						</li>
					</ol>
				</div>
			</div>
			<div class="news">
				<p>최신 뉴스</p>
			</div>
			<div class="container">
				<div>
					<ol class="boardChart">
						<li><a href="#">
							News Title
							<small>2021.04.21</small>
							</a><hr>
						</li>
						<li><a href="#">
							News Title
							<small>2021.04.21</small>
							</a><hr>
						</li>
						<li><a href="#">
							News Title
							<small>2021.04.21</small>
							</a><hr>
						</li>
						<li><a href="#">
							News Title
							<small>2021.04.21</small>
							</a><hr>
						</li>
					</ol>
				</div>
			</div>
        </section>

    </div>


	<!-- 페이지 맨 밑부분 -->
    <footer>
        <div class="wrapper">
            <p><small>&copy; 2021 PlayGround</small></p>
        </div>
    </footer>
</body>
</html>