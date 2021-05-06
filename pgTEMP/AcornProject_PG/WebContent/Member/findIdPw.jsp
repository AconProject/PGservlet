<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디/비밀번호 찾기</title>
<link rel="stylesheet" type="text/css" href="CSS/FindIdPw.css">

</head>

<body>
	
	<div class="findform">
	
	<div class="menubar">
		<a href="Main.jsp"><img src="Image/logo.png"></a>
		<a href="Login.jsp" class="menu">로그인</a>
		<a href="MemberAdd.jsp" class="menu">회원가입</a>
	</div>
	
	<form method="post" class="findid">
		<h2>아이디 찾기</h2>
		<div class="row">
			<span class="title">닉네임</span> 
			<input type="text" class="content" name="mbrName" id="mbrName">
		</div>
		<div class="row">
			<span class="title">이메일</span> 
			<input type="email" class="content" name="mbrEmail" id="mbrEmail">
		</div>
		<div class="button" onclick="window.open('FindId.jsp'); return false;">
			<input type="submit" id="findidsubmit" value="제 출">
		</div>
	</form>
	
	<form method="post" class="findpw">
		<h2>비밀번호 찾기</h2>
		<div class="row">
			<span class="title">아이디</span> 
			<input type="text" class="content" name="mbrId" id="mbrId">
		</div>
		<div class="row">
			<span class="title">이메일</span> 
			<input type="email" class="content" name="mbrEmail" id="mbrEmail">
		</div>
		<div class="button" onclick="window.open('FindPw.jsp'); return false;">
			<input type="submit" id="findpwsubmit"value="제 출">
		</div>
	</form>
	
</div>

</body>
</html>