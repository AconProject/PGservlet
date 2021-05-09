<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write Board</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="CSS/WriteBoard.css" rel="stylesheet">
</head>
<body>
	<!-- 페이지 상단 로고 및 배너 -->
    <header>
		<div class="wrapper">
				<a href="main.jsp"><img class="logo" src="Image/logo.png" alt="로고 이미지"></a>
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
        <h1>게시글 작성</h1>
        <hr>
        <div class="container">
		<form class="boardpost" action="" method="post">
		
			<select class="select_change" name="category" id="category" >
				<option selected>Category</option>
				<option value="게임정보">게임정보</option>
				<option value="게임정보">질문&답변</option>
				<option value="게임정보">할인정보</option>
				<option value="게임정보">자유게시판</option>
				<option value="게임정보">기타</option>
			</select>

			<input type="text" name="boardtitle" id="title" placeholder="제목" ><br>
			
			<textarea name="Content" id="content" maxlength="2048" placeholder="(샘플 텍스트)
 
 게임을 다른 사람에게 추천하고 싶으시지만 어떻게 해야 할지 모르시는 분들을 위한 리뷰 작성의 가이드 입니다.

 가이드는 대략적인 틀을 잡아 리뷰작성의 경험이 없으신 분들도 어느정도 퀄리티 높은 리뷰를 작성하실 수 있도록 도움을 드리는데에 목적이 있지만 해당 가이드가 정석이나 정답은 아니기 때문에 회원님들께서 취향에 맞게 편집하시어 사용하시길 바랍니다.

 

 아래 가이드를 자유롭게 사용 또는 변경하시어 이용하시길 바랍니다. 

 

* 사용방법

1. 아래 내용 드래그 후 복사하기
2. 리뷰 작성 페이지에 아래 내용을 붙여넣기.
3. 그대로 사용하시거나 편집(변경)하시어 리뷰 작성하기. "></textarea><br>
			
			<button type="submit" name="boardsubmit" id="boardsubmit">제출</button>
			<button type="reset" name="reset" id="reset">다시쓰기</button>
				
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