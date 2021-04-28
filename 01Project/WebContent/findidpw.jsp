<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
@import url('https://fonts.googleapis.com/css2?family=Do+Hyeon&family=Gugi&family=Nanum+Gothic+Coding:wght@700&display=swap');

* {
	margin: 0px;
	padding: 0px;
	text-decoration: none;
}
body {
	font-family: Nanum Gothic Coding;
	background-color: #A5D8FA;
	height:1000px;
}
img{
	width:120px;
	height:70px;
	margin: 20px;
	margin-left: 130px;
	margin-bottom: 0px;
}
.menubar h1 {
	text-align: left;
	margin-top: 10px;
	margin-left: 200px;
	margin-bottom: 10px;
	padding:5px;
	line-height: 1;
	font-family: Electrolize;
	font-size: x-large;
	font-weight : bold;
	color: #FF8C0A;
}
.menubar {
	margin-bottm: 15px;
}
.menu {
	padding:10px;
	font-size: 25px;
	color:white;
	font-family: Do Hyeon;
	letter-spacing: 5px;
	text-shadow: -2px 0 #000, 0 2px #000, 2px 0 #000, 0 -2px #000;
}
h2 {
	padding:5px;
	padding-bottom:10px;
}
.findform{
	position: absolute;
	padding: 30px 20px;
	width: 1000px;
	height: 650px;
	background-color: #A5D8FA;
	border-radius: 15px;
	top: 5%;
	left:23%;
}
.findid, .findpw {
	padding: 20px 20px;
	width: 500px;
	height: 250px;
	margin: 45px 250px;
	border-radius: 15px;
	background-color: white;
	
}
.title {
	font-size: 18px;
}
.row .title {
	margin: 10px;
	display: block;
	line-height: 17px;
	margin-left: 50px;
	margin-bottom: 7px;
}
.content {
	height: 30px;
	margin-bottom: 20px;
	width: 80%;
	margin-left: 50px;
	font-size: 15px;
}
div.button {
	margin-left: 35%;
	width: 30%;
	bottom: 20px;
}
div.button input {
	padding: 5px;
	width: 100%;
	font-size: 18px;
	border: none;
	border-radius: 10px;
	background-color: #a3daff;
	color: white;
	text-shadow: -1px 0 #000, 0 1px #000, 1px 0 #000, 0 -1px #000;
}
</style>
</head>

<body>
	
	<div class="findform">
	<div class="menubar">
		<a href=""><img src="image/logo.png"></a>
		<a href="login.jsp" class="menu">로그인</a>
		<a href="memberadd.jsp" class="menu">회원가입</a>
	</div>
	
	<form method="post" class="findid">
		<h2>아이디 찾기</h2>
		<div class="row">
			<span class="title">닉네임</span> 
			<input type="text" class="content" id="membername">
		</div>
		<div class="row">
			<span class="title">이메일</span> 
			<input type="email" class="content" id="memberemail">
		</div>
		<div class="button" onclick="window.open('findid.jsp'); return false;">
			<input type="submit" id="findidsubmit" value="제 출">
		</div>
	</form>
	
	<form method="post" class="findpw">
		<h2>비밀번호 찾기</h2>
		<div class="row">
			<span class="title">아이디</span> 
			<input type="text" class="content" id="membername">
		</div>
		<div class="row">
			<span class="title">이메일</span> 
			<input type="email" class="content" id="memberemail">
		</div>
		<div class="button" onclick="window.open('findpw.jsp'); return false;">
			<input type="submit" id="findpwsubmit"value="제 출">
		</div>
	</form>
	
</div>

</body>
</html>