<%@page import="com.dto.GameDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail Page</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="CSS/DetailPage.css" rel="stylesheet">
</head>
<body>
	<!-- 페이지 상단 로고 및 배너 -->
    <header>
		<div class="wrapper">
				<a href="Main.jsp"><img class="logo" src="Image/logo.png" alt="로고 이미지"></a>
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
	<%
  		GameDTO dto = (GameDTO)request.getAttribute("detailGame");
		String gameNo = dto.getGameNo();
		String gameName = dto.getGameName();
		String gameImage = dto.getGameImage();
		int gamePrice = dto.getGamePrice();
		String gameContent = dto.getGameContent();
		String gameCategory = dto.getGameCategory();
	  
	%> 
    <div class="wrapper">
		<!-- 상단 -->
        <section class="main-contents">
			<div class="gamename"><h1>After Alpha<small id="">(2021)</small></h1></div>
			<div class="container">
				<div>
					<table class="topTable">
						<tr>
							<td rowspan="2" style="width:250px;"><img class="gameImg" src="Image/sampleGame.jpg" alt="게임 이미지"></td>
							<td class="tags">
								<table>
									<tr>
										<td><a href="tagServlet?tag=#{tag.value() }" class="tag">#로드라이크</a></td>
										<td><a href="#" class="tag">#플랫포머</a></td>
										<td><a href="#" class="tag">#싱글플레이어</a></td>
									</tr>
									<tr>
										<td><a href="#" class="tag">#탐험</a></td>
										<td><a href="#" class="tag">#인디</a></td>
										<td><a href="#" class="tag">#아케이드</a></td>	
									</tr>
								</table>
							</td>
							<td rowspan="2"><div class="score" id="gameScore">95.5</div></td>
						</tr>
						<tr>
							<td><p class="content" id="gameContent">“SCUM is a next generation, story driven survival game featuring extremely complex game mechanics and unrevealed survival features. 
								Gamepires is an experienced team oriented towards innovation and perfection in game production and have decided to develop SCUM 
								side by side in collaboration with its community with the goal of making the best possible survival game yet.
								SCUM is a next generation, story driven survival game featuring extremely complex game mechanics and unrevealed survival features.”</p></td>
						</tr>
			
					</table>
				</div>
			</div>
        </section>

		<!-- 중단 -->
        <section class="main-contents">
			<div class="usereval"><h1>유저평가</h1></div>
			<div class="container">
				<div>
					<table class="midTable">
						<tr>
							<td class="mbrName" id="mbrName1">닉네임 뭐로하지</td>
							<td class="review" id="review1"><p>만약 같이 할 사람이 있고 할만한 게임을 찾고 계시다면 꼭 사셔서 해보시길 바랍니다. 시간 가는 줄 모르고 즐겼습니다. 아직 초반이지만 엔딩까지가 너무 기대되고 플레이 하는 내내 웃으면서 즐겼습니다.</p></td>
							<td class="meter" id="meter1"><meter min="0" max="100" value="75.1"></meter><span id="meterval">75.1</span></td>
							<td class="thumb" id="thumb1"><img class="icon" src="Image/thumb.png" alt="추천수"><span id="thumbval">12</span></td>
						</tr>
						<tr>
							<td class="mbrName" id="mbrName2">Samlple_user</td>
							<td class="review" id="review2"><p>겜은 샀고, 친구는 어디서 사면 되나요?</p></td>
							<td class="meter" id="meter2"><meter min="0" max="100" value="98.5"></meter><span id="meterval">98.5</span></td>
							<td class="thumb" id="thumb2"><img class="icon" src="Image/thumb.png" alt="추천수"><span id="thumbval">10</span></td>
						</tr>
					</table>
					<form action="DetailSubmit.jsp">
					<table class="reviewTable">
						<tr>
							<td rowspan="2" class="mbrName" id="mbrName">내 닉네임</td>
							<td rowspan="2" class="review"><textarea id="newreview" cols="80" rows="5" placeholder=" 내용을 입력해주세요"></textarea></td>
							<td class="newmeter">0 <input type="range" name="newmeter" id="newmeter"min="0" max="100">100<span id="meterval"></span></td>
						</tr>
							<td><button type="submit">올리기</button></td>
						<tr>
						</tr>			
					</table>
					</form>
				</div>
			</div>
        </section>
        
        <!-- 하단 -->
        <section class="main-contents">
			<div class="assogame"><h1>연관 게임</h1></div>
			<div class="container">
				<div>
					<table class="bottomTable">
						<tr>
							<td><img class="game" id="game1" src="Image/sampleGame.jpg" alt="게임 이미지"></td>
							<td><img class="game" id="game2" src="Image/sampleGame.jpg" alt="게임 이미지"></td>
							<td><img class="game" id="game3" src="Image/sampleGame.jpg" alt="게임 이미지"></td>
							<td><img class="game" id="game4" src="Image/sampleGame.jpg" alt="게임 이미지"></td>
							<td><img class="game" id="game5" src="Image/sampleGame.jpg" alt="게임 이미지"></td>
						</tr>
						<tr>
							<td class="title"><a href="#" class="gametitle" id="title1">Destinia</a></td>
							<td class="title"><a href="#" class="gametitle" id="title2">HeroSquare</a></td>
							<td class="title"><a href="#" class="gametitle" id="title3">PUBG</a></td>
							<td class="title"><a href="#" class="gametitle" id="title4">Fortnite</a></td>
							<td class="title"><a href="#" class="gametitle" id="title5">After Alpha</a></td>
						</tr>
					</table>
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