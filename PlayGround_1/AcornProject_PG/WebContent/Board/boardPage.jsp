<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../CSS/BoardPage.css" rel="stylesheet">

<script type="text/javascript">
function range() {
	
	var x = document.getElementById("newmeter").value;
	document.getElementById("newmeterval").innerHTML = x;
	
}
</script>

</head>
<body>

	<!-- 페이지 상단 로고 및 배너 -->
	<jsp:include page="../common/header.jsp" flush="true"></jsp:include>

	<!-- 메인화면 컨텐츠-->
	<!-- 안의 내용은 데이터 받아오면 변경 예정 -->
    <div class="wrapper">
    
        <section class="main-contents">
        
        <h3 id="boardCategory">카테고리</h3>
        <h1 id="boardName">리뷰를 잘 쓰고 싶으시다면? (샘플제목)</h1>
        <span id="boardDate">2021.05.10</span>
        <span id="mbrId">나는 작성자</span>
        <hr>
        <span id="boardCount">344</span>
        <img class="img" alt="댓글" src="../Image/arrow.png">
        <span id="boardCount">344</span>
        <img class="img" alt="좋아요" src="../Image/thumb.png">
        <span id="boardCount">344</span>
        <img class="img" alt="조회수" src="../Image/eye.png">
        <br>
        
        <div class="container">
        
			<p id="boardContent">

<strong>(샘플 게시글)</strong><br>
 
 게임을 다른 사람에게 추천하고 싶으시지만 어떻게 해야 할지 모르시는 분들을 위한 리뷰 작성의 가이드 입니다.<br>

 가이드는 대략적인 틀을 잡아 리뷰작성의 경험이 없으신 분들도 어느정도 퀄리티 높은 리뷰를 작성하실 수 있도록 도움을 드리는데에 목적이 있지만 해당 가이드가 정석이나 정답은 아니기 때문에 회원님들께서 취향에 맞게 편집하시어 사용하시길 바랍니다.<br>

 

 아래 가이드를 자유롭게 사용 또는 변경하시어 이용하시길 바랍니다.<br>

 

<strong>* 사용방법</strong><br>

1. 아래 내용 드래그 후 복사하기.<br>
2. 리뷰 작성 페이지에 아래 내용을 붙여넣기.<br>
3. 그대로 사용하시거나 편집(변경)하시어 리뷰 작성하기.<br>

 

<strong>[ 자기소개 또는 게임소개 ]</strong><br>
게임에 대한 첫인상이나 게임을 접하게 된 계기 자기소개나 인사 등에 대한 인사말 또는 시작글 작성<br>
 

<strong>[ 게임 그래픽 ]</strong><br>
캐릭터, 배경, 몬스터 등등 게임 그래픽에 관련한 내용과 본인의 후기<br>
 - 게임 스크린샷을 첨부하시는 것이 읽는 사람이 더욱 쉽게 읽을 수 있습니다.<br>
 

<strong>[ 게임 스토리 ]</strong><br>
메인 스토리, 서브 스토리나 퀘스트등 게임이 어떤 이야기를 주는지에 대한 후기<br>
- 게임 스크린샷을 첨부하시는 것이 읽는 사람이 더욱 쉽게 읽을 수 있습니다<br>
 
<strong>[ 게임 사운드 ]</strong><br>
BGM(배경음) , 효과음(타격음) , 캐릭터 성우 등 게임 사운드에 대한 후기<br>
 

<strong>[ 게임 시스템 ]</strong><br>
해당 게임의 차별화된 시스템이 있거나 기존 게임들보다 비교하여 더 좋거나 나쁜 시스템에 대한 후기<br>
- 게임 스크린샷을 첨부하시는 것이 읽는 사람이 더욱 쉽게 읽을 수 있습니다.<br>

 

<strong>[ 게임 접근성 ]</strong><br>
게임의 연령 제한에 관련한 내용, 폭력성, 사행성이나 게임의 난이도에 대한 후기<br>
(Ex: XX팡은 온 가족이 함께할 수 있어서 좋았어요 !)<br>
(Ex: XX팡은 손가락이 빨라야 해서 젊은사람만 할수 있는 것 같아요 !)<br>

 

<strong>[ 과금/무과금 ]</strong><br>
게임을 진행하시면서 과금 유도 컨텐츠가, 과금을 너무 유도한 내용이나 혹은 과금이 필요없이 게임을 할 수 있다는 과금/무과금에 관련한 후기<br>
 - 게임 스크린샷을 첨부하시는 것이 읽는 사람이 더욱 쉽게 읽을 수 있습니다<br>

 

<strong>[ 게임 운영 ]</strong><br>
게임을 진행하시면서 해당 게임의 이벤트나 문의사항에 대한 답변, 커뮤니티   운영, 유저들과의 소통의지 등등 게임 운영에 대한 후기 또는 느낀점<br>
- 게임 스크린샷을 첨부하시는 것이 읽는 사람이 더욱 쉽게 읽을 수 있습니다<br>

 

<strong>[ 전반적인 평가 ]</strong><br>
게임을 플레이 하면서 전체적으로 게임에서 느꼈던 생각이나, 앞으로의 전망 또는 게임이 어떻게 변했으면 좋을 것 같다 라는등의 게임의 전반적인 후기<br>

 

<strong>[ 마침말 ]</strong><br>
리뷰 작성을 하며 마지막으로 하고 싶은 말이나 끝맺음말, 인사말 등을 기입<br>
		</p><br>
		
		<div class="button_good"><button type="button" id="good">좋아요</button></div>
		</div>
	
       
	
		<div>
		<h1 id="boardReview">댓글</h1>
		<hr>
	    	<table class="midTable">
						<tr>
							<td class="mbrName" id="mbrName">닉네임 뭐로하지</td>
							<td class="review"><p id="gameReplyContent">만약 같이 할 사람이 있고 할만한 게임을 찾고 계시다면 꼭 사셔서 해보시길 바랍니다. 시간 가는 줄 모르고 즐겼습니다. 아직 초반이지만 엔딩까지가 너무 기대되고 플레이 하는 내내 웃으면서 즐겼습니다.</p></td>
							<td class="meter"><meter min="0" max="100" value="75.1"></meter><span id="gameScore">75.1</span></td>
							<td class="thumb"><img class="icon" src="../Image/thumb.png" alt="추천수"><span id="gameReplyRecommend">12</span></td>
							<td><button type="submit" id="update">수정</button></td>
							<td><button type="submit" id="delete">삭제</button></td>
						</tr>
						<tr>
							<td class="mbrName" id="mbrName">Samlple_user</td>
							<td class="review"><p id="gameReplyContent">겜은 샀고, 친구는 어디서 사면 되나요?</p></td>
							<td class="meter"><meter min="0" max="100" value="98.5"></meter><span id="gameScore">98.5</span></td>
							<td class="thumb"><img class="icon" src="../Image/thumb.png" alt="추천수"><span id="gameReplyRecommend">10</span></td>
							<td><button type="submit" id="update">수정</button></td>
							<td><button type="submit" id="delete">삭제</button></td>
						</tr>
					</table>
					
					<form action="">
					<table class="reviewTable">
						<tr>
							<td rowspan="3" class="mbrName" id="mbrName">내 닉네임</td>
							<td rowspan="3" class="review"><textarea name="newreview" id="gameReplyContent" cols="80" rows="5" placeholder=" 내용을 입력해주세요"></textarea></td>
							<td class="newmeter">0 <input type="range" name="newmeter" id="newmeter"min="0" max="100" onclick="range()">100</td>
						<tr>
							<td><span id="gameScore"></span></td>
						</tr>
						<tr>
							<td><button type="submit" id="submit">올리기</button></td>
						</tr>			
					</table>
					</form>
		</div>
		</section>
	</div>
	
	<!-- 페이지 최하단 배너 -->
	<jsp:include page="../common/footer.jsp" flush="false"></jsp:include>

    
</body>
</html>