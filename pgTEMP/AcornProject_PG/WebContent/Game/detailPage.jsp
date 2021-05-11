<%@page import="com.dto.GameDTO"%>
<%@page import="com.dto.MemberDTO"%>
<%@page import="com.dto.ReviewDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="${pageContext.request.contextPath}/CSS/DetailPage.css"
	rel="stylesheet">

<!--로그인 정보 받아오기  -->
<%
	MemberDTO mdto = (MemberDTO) request.getAttribute("login");
String mbrId = mdto.getMbrId();
String mbrPw = mdto.getMbrPw();
String mbrName = mdto.getMbrName();
String mbrEmail = mdto.getMbrEmail();
String mbrRegdate = mdto.getMbrRegdate();
String mbrGenre = mdto.getMbrGenre();
%>

<script src="https://code.jquery.com/jquery-latest.min.js">
	/* 확인하기 */
	$(document).ready(function() {

		$("#update").on("click", function() {

		});

		$("#delete").on("click", function() { //내 userid /name인지 확인 하고 지울 것 .. 우선 login 되어있는지 확인, 안되어있으면 alert 창 되어있으면,, 댓글 작성자 id = 내 아이디 동일한지 아니면 
			//못고치고, 맞으면 고치거나 삭제 창 띄우기 

		});

		$("#replySubmit").on("click", function(event) {
<%if (mdto == null) {%>
	alert("로그인이 필요합니다. ");
			location.href = "LoginForm.jsp";
<%} else {%>
	$.ajax({
				type : "GET",
				url : "replyRegisterServlet",
				dataType : "text",
				data : {
					//review 데이터  json 생각해보기
					mbrName : $("#mbrName").val(), //닉네임
					boardContent : $("#newreview").val()
				//댓글 내용 
				},
				success : function() {
					console.log("댓글 보내기 성공");
					location.reload();
				},
				error : function(xhr, status, error) {
					console.log("error");
				}//end error
			})//end ajax
<%}%>
	}) //end function
	}) //end document
</script>




</head>
<body>
	<!-- 페이지 상단 로고 및 배너 -->
	<header>
		<div class="wrapper">
			<a href="Main.jsp"><img class="logo" src="Image/logo.png"
				alt="로고 이미지"></a>
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

	<!-- 데이터 가져오기_상단 부문-->
	<%
		GameDTO gdto = (GameDTO) request.getAttribute("detailGame");
	String gameNo = gdto.getGameNo();
	String gameName = gdto.getGameName();
	String gameImage = gdto.getGameImage();
	int gamePrice = gdto.getGamePrice();
	String gameContent = gdto.getGameContent();
	String gameCategory = gdto.getGameCategory();
	String gameGenre = gdto.getGameContent();
	String gameReleasedDate = gdto.getGameReleasedDate();

	String[] category = gameGenre.split(",");
	%>

	<div class="wrapper">
		<!-- 상단 -->
		<section class="main-contents">
			<div class="gamename">
				<h1><%=gameName%><small id="<%=gameName%>">(2021)</small>
				</h1>
			</div>
			<div class="container">
				<div>
					<table class="topTable">
						<tr>
							<td rowspan="2" style="width: 250px;"><img class="gameImg"
								src="Image/sampleGame.jpg" alt="게임 이미지"></td>
							<td class="tags">
								<table>
									<tr>
										<td><a href="#" class="tag">#로드라이크</a></td>
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
							<td rowspan="2"><div class="score" id="gameScore"><%=gameContent%></div></td>
						</tr>
						<tr>
							<td><p class="content" id="gameContent">
									<%=gameContent%></p></td>
						</tr>

					</table>
				</div>
			</div>
		</section>

		<!-- 상세 페이지: 중단 -->
		<!-- 데이터 가져오기_중단 부문-->
		<%
			List<ReviewDTO> list = (List<ReviewDTO>) request.getAttribute("reviewList");
			for (int i = 0; i < list.size(); i++) {
				ReviewDTO rdto = list.get(i);
				String rreviewId = rdto.getReviewId();
				String rmbrId = rdto.getMbrId(); //안보이게 해야함. 
				String rmbrName = rdto.getMbrName();
				String rgameNo = rdto.getGameNo();
				String rreviewContent = rdto.getReviewContent();
				int rreviewLiked = rdto.getReviewLiked();
				double rreviewScore = rdto.getReviewScore();
				String rreviewDate = rdto.getReviewDate();

			//이후 데이터 삽입
		%>
		<section class="main-contents">
			<div class="usereval">
				<h1>유저평가</h1>
			</div>
			<div class="container">
				<div>
					<table class="midTable">
						<tr>
							<td class="mbrName" id="mbrName1">닉네임 뭐로하지</td>
							<td class="review" id="review1"><p>만약 같이 할 사람이 있고 할만한
									게임을 찾고 계시다면 꼭 사셔서 해보시길 바랍니다. 시간 가는 줄 모르고 즐겼습니다. 아직 초반이지만 엔딩까지가
									너무 기대되고 플레이 하는 내내 웃으면서 즐겼습니다.</p></td>
							<td class="meter" id="meter1"><meter min="0" max="100"
									value="75.1"></meter><span id="meterval">75.1</span></td>
							<td class="thumb" id="thumb1"><img class="icon"
								src="Image/thumb.png" alt="추천수"><span id="thumbval">12</span></td>
						</tr>
						<tr>
							<td class="mbrName" id="mbrName2">Samlple_user</td>
							<td class="review" id="review2"><p>겜은 샀고, 친구는 어디서 사면
									되나요?</p></td>
							<td class="meter" id="meter2"><meter min="0" max="100"
									value="98.5"></meter><span id="meterval">98.5</span></td>
							<td class="thumb" id="thumb2"><img class="icon"
								src="Image/thumb.png" alt="추천수"><span id="thumbval">10</span></td>

							<%
								}
							%>
							<!--/////////////////////////////////////  -->

							<td><button type="submit" id="update">수정</button></td>
							<td><button type="submit" id="delete">삭제</button></td>
						</tr>
					</table>

					<!--/////////////////////////////////댓글 입력  칸//////////////////////  -->

					<!-- 					<form action="DetailSubmit.jsp"> -->
					<table class="reviewTable">
						<tr>
							<td rowspan="3" class="mbrName" id="mbrName" value="<%=mbrName%>">
							</td>
							<td rowspan="3" class="review"><textarea id="newreview"
									name="newreview" cols="80" rows="5" placeholder=" 내용을 입력해주세요"></textarea></td>
							<td class="newmeter">0 <input type="range" name="newmeter"
								id="newmeter" min="0" max="100" onclick="range()">100
							</td>
						<tr>
							<td><span id="newmeterval"></span></td>
						</tr>

						<!--  댓글 작성  -->
						<tr>
							<td><button id="replySubmit">댓글 달기</button></td>
						</tr>
					</table>
					<!-- </form> -->
				</div>
			</div>
		</section>


		<!-- //////////////////////////하단 ///////////////////////////-->
		<!-- 데이터 가져오기_하단 부문-->
		<%
		List<GameDTO> gdto2 =(List<GameDTO>) request.getAttribute("reviewList");
		for (int i = 0; i < list.size(); i++) {
		%>
		<section class="main-contents">
			<div class="assogame">
				<h1>연관 게임</h1>
			</div>
			<div class="container">
				<div>
					<table class="bottomTable">
						<tr>
							<td><img class="game" id="game1" src="Image/sampleGame.jpg"
								alt="게임 이미지"></td>
							<td><img class="game" id="game2" src="Image/sampleGame.jpg"
								alt="게임 이미지"></td>
							<td><img class="game" id="game3" src="Image/sampleGame.jpg"
								alt="게임 이미지"></td>
							<td><img class="game" id="game4" src="Image/sampleGame.jpg"
								alt="게임 이미지"></td>
							<td><img class="game" id="game5" src="Image/sampleGame.jpg"
								alt="게임 이미지"></td>
						</tr>
						<tr>
							<td class="title"><a href="#" class="gametitle" id="title1">Destinia</a></td>
							<td class="title"><a href="#" class="gametitle" id="title2">HeroSquare</a></td>
							<td class="title"><a href="#" class="gametitle" id="title3">PUBG</a></td>
							<td class="title"><a href="#" class="gametitle" id="title4">Fortnite</a></td>
							<td class="title"><a href="#" class="gametitle" id="title5">After
									Alpha</a></td>
						</tr>
					</table>
				</div>
			</div>
		</section>

	</div>





	<!-- 페이지 최하단 배너 -->
	<footer>
		<div class="wrapper">
			<p>
				<small>&copy; 2021 PlayGround</small>
			</p>
		</div>
	</footer>
</body>
</html>