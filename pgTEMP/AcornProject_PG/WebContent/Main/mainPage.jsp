<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MainPage</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://unpkg.com/ress/dist/ress.min.css">
    <link href="${pageContext.request.contextPath}/CSS/Style.css" rel="stylesheet">
</head>
<body>
	<!-- 페이지 상단 로고 및 배너 -->
    <header>
		<div class="wrapper">
			<h1>
				<a href="main.jsp"><img class="logo" src="${pageContext.request.contextPath}/Image/logo.png" alt="로고 이미지"></a>
			</h1>
			<nav>
				<div class="empty"></div>
				<ul class="nav">
					<li><a href="#">게시판</a></li>
					<li><a href="#">뉴스 및 소식</a></li>
					<li><a href="../Member/loginForm.jsp">로그인</a></li>
					<li><a href="MemberAdd.jsp">회원가입</a></li>
				</ul>
			</nav>
		</div>
    </header>

	<!-- 메인화면 컨텐츠-->
	<!-- 안의 내용은 데이터 받아오면 변경 예정 -->
    <div class="wrapper">

		<!-- 상단 -->
        <section class="main-contents">
			<button>최신게임</button><button>추천게임</button>
			<div class="container">
				<div>
					<table class="topTable">
						<tr>
							<td>1.</td>
							<td>2.</td>
							<td>3.</td>
						</tr>
						<tr>
							<td><img class="gameImg" src="${pageContext.request.contextPath}/Image/sampleGame.jpg" alt="게임 이미지"></td>
							<td><img class="gameImg" src="${pageContext.request.contextPath}/Image/sampleGame.jpg" alt="게임 이미지"></td>
							<td><img class="gameImg" src="${pageContext.request.contextPath}/Image/sampleGame.jpg" alt="게임 이미지"></td>
						</tr>
						<tr>
							<td class="center">Sample Game</td>
							<td class="center">Sample Game</td>
							<td class="center">Sample Game</td>
						</tr>
						<tr>
							<td class="center">(2019)</td>
							<td class="center">(2019)</td>
							<td class="center">(2019)</td>
						</tr>
						<tr>
							<td class="center"><a href="#" class="tag">#태그</a></td>
							<td class="center"><a href="#" class="tag">#태그</a></td>
							<td class="center"><a href="#" class="tag">#태그</a></td>
						</tr>
					</table>
				</div>
				<div>
					<ol class="topChart" start="4">
						<li>
							Sample Game
							<small>(2019)</small>
						</li>
						<li>
							Sample Game
							<small>(2019)</small>
						</li>
						<li>
							Sample Game
							<small>(2019)</small>
						</li>
						<li>
							Sample Game
							<small>(2019)</small>
						</li>
						<li>
							Sample Game
							<small>(2019)</small>
						</li>
						<li>
							Sample Game
							<small>(2019)</small>
						</li>
						<li>
							Sample Game
							<small>(2019)</small>
						</li>
					</ol>
				</div>
			</div>
        </section>

		<!-- 중단 -->
        <section class="main-contents">
			<div class="container">
				<div>
					<table class="midTable">
						<tr>
							<td>1.</td>
							<td><img class="gameImg" src="${pageContext.request.contextPath}/Image/sampleGame.jpg" alt="게임 이미지"></td>
							<td>Sample Game <small>(2019)</small></td>
							<td><div class="score">95.5</div></td>
						</tr>
						<tr>
							<td>2.</td>
							<td><img class="gameImg" src="${pageContext.request.contextPath}/Image/sampleGame.jpg" alt="게임 이미지"></td>
							<td>Sample Game <small>(2019)</small></td>
							<td><div class="score">95.5</div></td>
						</tr>
						<tr>
							<td>3.</td>
							<td><img class="gameImg" src="${pageContext.request.contextPath}/Image/sampleGame.jpg" alt="게임 이미지"></td>
							<td>Sample Game <small>(2019)</small></td>
							<td><div class="score">95.5</div></td>
						</tr>
					</table>
				</div>
				<div>
					<input type="checkbox" name="tag" value="tag1">tag1<br>
					<input type="checkbox" name="tag" value="tag2">tag2<br>
					<input type="checkbox" name="tag" value="tag3">tag3<br>
					<input type="checkbox" name="tag" value="tag4">tag4<br>
					<input type="checkbox" name="tag" value="tag5">tag5<br>
					<input type="checkbox" name="tag" value="tag6">tag6<br>
					<input type="checkbox" name="tag" value="tag7">tag7
				</div>
			</div>
        </section>

		<!-- 하단 -->
		<section class="main-contents">
			하단
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