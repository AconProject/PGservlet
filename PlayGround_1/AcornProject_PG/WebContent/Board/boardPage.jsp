<%@page import="com.dto.BoardDTO"%>
<%@page import="java.sql.Date"%>
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
        
        <%
        	BoardDTO dto =(BoardDTO)request.getAttribute("board");
       	 	System.out.println("게시판 상세 페이지 jsp:" + dto);
       	 	String mbrName = dto.getMbrName();
       	 	String boardName = dto.getBoardName();
       	 	String boardCategory = dto.getBoardCategory();
       	 	String boardContent = dto.getBoardContent();
       	 	int boardLiked = dto.getBoardLiked();
       	 	int boardCount = dto.getBoardCount();
			Date boardDate = dto.getBoardDate(); 
			
       	 	String date = boardDate.toString();
       	 	String Date = date.substring(0,	10);
       	 	
        %>
        
        <h3 id="boardCategory"><%= boardCategory %></h3>
        <h1 id="boardName"><%= boardName %></h1>
        <span id="boardDate"><%= Date %></span>
        <span id="mbrName"><%= mbrName %></span>
        <hr>
        <span id="replyCount">344</span>
        <img class="img" alt="댓글" src="../Image/arrow.png">
        <span id="boardLiked"><%= boardLiked %></span>
        <img class="img" alt="좋아요" src="../Image/thumb.png">
        <span id="boardCount"><%= boardCount %></span>
        <img class="img" alt="조회수" src="../Image/eye.png">
        <br>
        
        <div class="container">
        
			<p id="boardContent"><%= boardContent %></p>
			<br>
		
			<div class="button_good">
				<button type="button" id="good">좋아요</button>
			</div>
			
			<button type="button" name="boardKind" id="boardupdate" value="boardUpdate" onclick="location.href='${pageContext.request.contextPath}/Board/updateBoard.jsp'">수정</button>
			<button type="button" name="boardKind" id="boarddelete" value="boardDelete">삭제</button>
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