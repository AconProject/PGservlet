<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Board</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="../CSS/UpdateBoard.css" rel="stylesheet">
</head>
<body>
	<!-- 페이지 상단 로고 및 배너 -->
    <header>
		<div class="wrapper">
				<a href="../Main.jsp"><img class="logo" src="../Image/logo.png" alt="로고 이미지"></a>
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
	<!-- 안의 내용은 데이터 받아오면 변경 예정 -->
    <div class="wrapper">
		<!-- 상단 -->
        <section class="main-contents">
        <h1>게시글 수정</h1>
        <hr>
        <div class="container">
		<form class="boardupdate" action="" method="post">
		
			<select class="select_category" name="boardCategory" id="boardCategory" >
				<option selected>Category</option>
				<option value="게임정보">게임정보</option>
				<option value="질문&답변">질문&답변</option>
				<option value="할인정보">할인정보</option>
				<option value="자유게시판">자유게시판</option>
				<option value="기타">기타</option>
			</select>

			<input type="text" name="boardName" id="boardName" placeholder="제목" ><br>
			
			<textarea name="boardContent" id="boardContent" maxlength="2048"></textarea><br>
			
			<button type="button" name="boardupdate" id="boardupdate">수정</button>
			<button type="button" name="boarddelete" id="boarddelete">삭제</button>
				
		</form>
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