<%@page import="com.dto.GameDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../CSS/DetailPage.css" rel="stylesheet">

<script type="text/javascript">
	function range() {

		var x = document.getElementById("newmeter").value;
		document.getElementById("reviewScore").innerHTML = x;

	}
</script>

</head>


<body>
	<!-- 페이지 상단 로고 및 배너 -->
	<jsp:include page="../common/header.jsp" flush="true"></jsp:include>

	<%

	GameDTO dto = (GameDTO) request.getAttribute("detailGame");
	String gameNo = dto.getGameNo();
	String gameName = dto.getGameName();
	String gameIamge = dto.getGameImage();
	int gamePrice = dto.getGamePrice();
	String gameContent = dto.getGameContent();
	String gameCategory = dto.getGameCategory();
	String gameGenre = dto.getGameGenre();

	String[] category = gameGenre.split(",");

	%>

	<!-- 메인화면 컨텐츠-->
	<!-- 안의 내용은 데이터 받아오면 변경 예정 -->
	<div class="wrapper">
		<!-- 상단 -->
		<section class="main-contents">
			<div class="gamename">
				<h1 id="gameName"><%=gameName%><small id="gameReleaseDate"></small>
				</h1>
			</div>
			<div class="container">
				<div>
					<table class="topTable">
						<tr>
							<td rowspan="2" style="width: 250px;"><img class="gameImg" id="gameImage" src="Image/sampleGame.jpg" alt="게임 이미지"></td>
							<td class="tags">
								<table>
									<tr>
										<td><a href="#" class="tag">#<%=category[0]%></a></td>
										<td><a href="#" class="tag">#<%=category[1]%></a></td>
										<td><a href="#" class="tag">#<%=category[2]%></a></td>
									</tr>
									<tr>
										<td><a href="#" class="tag">#<%=category[3]%></a></td>
										<td><a href="#" class="tag">#<%=category[4]%></a></td>
									</tr>
								</table>
							</td>
							<td rowspan="2"><div class="score" id="gameScore">95.5</div></td>
						</tr>
						<tr>
							<td><p class="content" id="gameContent">
									“<%=gameContent%>”
								</p></td>
						</tr>

					</table>
				</div>
			</div>
		</section>

		<!-- 중단 -->
		<section class="main-contents">
			<div class="usereval">
				<h1>유저평가</h1>
			</div>
			<div class="container">
				<div>
					<table class="midTable">
						<tr>
							<td class="mbrName" id="mbrName">닉네임 뭐로하지</td>
							<td class="review"><p id="gameReplyContent">만약 같이 할 사람이 있고 할만한 게임을 찾고 계시다면 꼭 사셔서 해보시길 바랍니다. 시간 가는 줄 모르고 즐겼습니다. 아직 초반이지만 엔딩까지가 너무 기대되고 플레이 하는 내내 웃으면서 즐겼습니다.</p></td>
							<td class="meter"><meter min="0" max="100" value="75.1"></meter><span id="gameScore">75.1</span></td>
							<td class="thumb"><img class="icon" src="Image/thumb.png" alt="추천수"><span id="gameReplyRecommend">12</span></td>
							<td><button type="submit" id="update">수정</button></td>
							<td><button type="submit" id="delete">삭제</button></td>
						</tr>
						<tr>
							<td class="mbrName" id="mbrName">Samlple_user</td>
							<td class="review"><p id="gameReplyContent">겜은 샀고, 친구는 어디서 사면 되나요?</p></td>
							<td class="meter"><meter min="0" max="100" value="98.5"></meter><span id="gameScore">98.5</span></td>
							<td class="thumb"><img class="icon" src="Image/thumb.png" alt="추천수"><span id="gameReplyRecommend">10</span></td>
							<td><button type="submit" id="update">수정</button></td>
							<td><button type="submit" id="delete">삭제</button></td>
						</tr>
					</table>

					<form action="DetailSubmit.jsp">
						<table class="reviewTable">
							<tr>
								<td rowspan="3" class="mbrName" id="mbrName">내 닉네임</td>
								<td rowspan="3" class="review"><textarea name="newreview" id="gameReplyContent" cols="80" rows="5" placeholder=" 내용을 입력해주세요"></textarea></td>
								<td class="newmeter">0 <input type="range" name="newmeter" id="newmeter" min="0" max="100" onclick="range()">100
								</td>
							<tr>
								<td><span id="reviewScore"></span></td>
							</tr>
							<tr>
								<td><button type="submit" id="submit">올리기</button></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</section>

		<!-- 하단 -->
		<section class="main-contents">
			<div class="assogame">
				<h1>연관 게임</h1>
			</div>
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
	<jsp:include page="../common/footer.jsp" flush="false"></jsp:include>

</body>
</html>