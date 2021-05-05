<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PlayGround</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://unpkg.com/ress/dist/ress.min.css">
    <link href="CSS/Style.css" rel="stylesheet">
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
					<li><a href="Login.jsp">로그인</a></li>
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
							<td><a href="DetailPage.jsp"><img class="gameImg" src="Image/sampleGame.jpg" alt="게임 이미지"></a></td>
							<td><a href="DetailPage.jsp"><img class="gameImg" src="Image/sampleGame.jpg" alt="게임 이미지"></a></td>
							<td><a href="DetailPage.jsp"><img class="gameImg" src="Image/sampleGame.jpg" alt="게임 이미지"></a></td>
						</tr>
						<tr>
							<td class="center"><a href="DetailPage.jsp">Sample Game<br><small>(2019)</small></a></td>
							<td class="center"><a href="DetailPage.jsp">Sample Game<br><small>(2019)</small></a></td>
							<td class="center"><a href="DetailPage.jsp">Sample Game<br><small>(2019)</small></a></td>
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
							<a href="#">Sample Game <small>(2019)</small></a>
						</li>
						<li>
							<a href="#">Sample Game <small>(2019)</small></a>
						</li>
						<li>
							<a href="#">Sample Game <small>(2019)</small></a>
						</li>
						<li>
							<a href="#">Sample Game <small>(2019)</small></a>
						</li>
						<li>
							<a href="#">Sample Game <small>(2019)</small></a>
						</li>
						<li>
							<a href="#">Sample Game <small>(2019)</small></a>
						</li>
						<li>
							<a href="#">Sample Game <small>(2019)</small></a>
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
							<td><img class="gameImg" src="Image/sampleGame.jpg" alt="게임 이미지"></td>
							<td>Sample Game <small>(2019)</small></td>
							<td><div class="score">95.5</div></td>
						</tr>
						<tr>
							<td>2.</td>
							<td><img class="gameImg" src="Image/sampleGame.jpg" alt="게임 이미지"></td>
							<td>Sample Game <small>(2019)</small></td>
							<td><div class="score">95.5</div></td>
						</tr>
						<tr>
							<td>3.</td>
							<td><img class="gameImg" src="Image/sampleGame.jpg" alt="게임 이미지"></td>
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

		<!-- 메인 하단 -->
		<section class="main-contents">
			<div class="bestBoard">
				<p>게임 베스트</p><p>질문 답변 베스트</p>
			</div>
			<div class="container">
				<div>
					<button class="btn">추천</button><button class="btn">조회</button>
					<ol class="boardChart">
						<li>
							title
							<img class="icon" src="Image/eye.png" alt="조회수"> 123
							<img class="icon" src="Image/thumb.png" alt="추천수"> 12
							<hr>
						</li>
						<li>
							title
							<img class="icon" src="Image/eye.png" alt="조회수"> 123
							<img class="icon" src="Image/thumb.png" alt="추천수"> 12
							<hr>
						</li>
						<li>
							title
							<img class="icon" src="Image/eye.png" alt="조회수"> 123
							<img class="icon" src="Image/thumb.png" alt="추천수"> 12
							<hr>
						</li>
						<li>
							title
							<img class="icon" src="Image/eye.png" alt="조회수"> 123
							<img class="icon" src="Image/thumb.png" alt="추천수"> 12
							<hr>
						</li>
					</ol>
				</div>
				<div>
					<button class="btn">추천</button><button class="btn">조회</button>
					<ol class="boardChart">
						<li>
							title
							<img class="icon" src="Image/eye.png" alt="조회수"> 123
							<img class="icon" src="Image/thumb.png" alt="추천수"> 12
							<hr>
						</li>
						<li>
							title
							<img class="icon" src="Image/eye.png" alt="조회수"> 123
							<img class="icon" src="Image/thumb.png" alt="추천수"> 12
							<hr>
						</li>
						<li>
							title
							<img class="icon" src="Image/eye.png" alt="조회수"> 123
							<img class="icon" src="Image/thumb.png" alt="추천수"> 12
							<hr>
						</li>
						<li>
							title
							<img class="icon" src="Image/eye.png" alt="조회수"> 123
							<img class="icon" src="Image/thumb.png" alt="추천수"> 12
							<hr>
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
						<li>
							News Title
							<small>2021.04.21</small>
							<hr>
						</li>
						<li>
							News Title
							<small>2021.04.21</small>
							<hr>
						</li>
						<li>
							News Title
							<small>2021.04.21</small>
							<hr>
						</li>
						<li>
							News Title
							<small>2021.04.21</small>
							<hr>
						</li>
					</ol>
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