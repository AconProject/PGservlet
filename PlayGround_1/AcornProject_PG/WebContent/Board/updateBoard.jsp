<%@page import="com.dto.BoardDTO"%>
<%@page import="com.dto.MemberDTO"%>
<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Board</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="${pageContext.request.contextPath}/CSS/UpdateBoard.css" rel="stylesheet">
</head>
<body>
	
	<!-- 페이지 상단 로고 및 배너 -->
	<jsp:include page="../common/header.jsp" flush="true"></jsp:include>

	<!-- 메인화면 컨텐츠-->
	<!-- 안의 내용은 데이터 받아오면 변경 예정 -->
    <div class="wrapper">
		<!-- 상단 -->
        <section class="main-contents">
        <h1>게시글 수정</h1>
        <hr>
        <div class="container">
        
        <%
        	MemberDTO mdto =(MemberDTO)session.getAttribute("login");
        
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
        
		<form class="boardupdate" action="../BoardModifyServlet" method="post">
		
			<select class="select_category" name="boardCategory" id="boardCategory" >
				<option selected value="<%= boardCategory %>"><%= boardCategory %></option>
				<option value="게임정보">게임정보</option>
				<option value="질문&답변">질문&답변</option>
				<option value="할인정보">할인정보</option>
				<option value="자유게시판">자유게시판</option>
				<option value="기타">기타</option>
			</select>

			<input type="text" name="boardName" id="boardName" value="<%= boardName %>" placeholder="제목" ><br>
			
			<textarea name="boardContent" id="boardContent" maxlength="2048"><%= boardContent %></textarea><br>
			
			<button type="submit" name="boardKind" id="boardupdate" value="boardUpdate">수정</button>
			<button type="button" name="boardKind" id="boardupdate" value="boardUpdate">수정</button>
			<button type="reset" name="boarddelete" id="boarddelete">다시작성</button>
				
		</form>
		</div>
        </section>
        
	</div>
		
	<!-- 페이지 최하단 배너 -->
	<jsp:include page="../common/footer.jsp" flush="false"></jsp:include>
    
</body>
</html>