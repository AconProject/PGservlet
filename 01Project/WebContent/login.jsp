<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
@import url('https://fonts.googleapis.com/css2?family=Orelega+One&family=Work+Sans:ital,wght@0,300;1,300&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Balsamiq+Sans&family=Orelega+One&family=Work+Sans:ital,wght@0,300;1,300&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Balsamiq+Sans&family=Orelega+One&family=Righteous&family=Work+Sans:ital,wght@0,300;1,300&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Balsamiq+Sans&family=Orelega+One&family=Righteous&family=Sunflower:wght@300&family=Work+Sans:ital,wght@0,300;1,300&display=swap');

* {
	margin: 0px;
	padding: 0px;
	text-decoration: none;
}

body {
	background-color: #A5D8FA;
}

.loginForm {
	position:absolute;
	width:370px;
	height:470px;
	padding: 30px, 20px;
	background-color: white;
	text-align: center;
	top: 20%;
	left: 37%;
	border-radius: 15px;
}
.loginForm h1 {
	text-align: left;
	margin:20px;
	line-height:1;
	font-family: RocknRoll One;
	font-size:x-large;
	color: #FF8C0A;
}

.loginForm p {
	text-align: center;
	padding: 20px;
	font-family:Sunflower;
	font-size: medium;
	font-weight: bold;
}
.idForm , .pwForm{
	border-bottom: 2px solid #adadad;
	margin: 20px;
	padding:10px;
}
#id, #pw {
	width:100%;
	border:none;
	outline:none;
	color: #636e72;
  	font-size:16px;
  	height:25px;
  	background: none;
}
#login{
	display:inline;
	width:40%;
	height:40px;
	margin:10px;
	border: none;
	border-radius: 10px;
	background-color: #a3daff;
	color:white;
	font-size: medium;
	font-weight: bold;
	font-family: Balsamiq Sans;
}
.check{
	margin-top:20px;
	font-size: 15px;
}
#find{
	margin-right: 10px;
	color:black;
}
#create{
	margin-right: 10px;
	color:black;
}
#mypage{
	margin-left: 10px;
	color:black;
}

#logo:hover {
	transform:rotatae(-30deg);
}
</style>


</head>
<body>
<form action="" method="post" class="loginForm">
	<a href=""><h1>Play<span id="logo">🎮</span><br>Ground</h1></a>
	<p> " 자신을 알아야 평화를 찾을 수 있는 법 "</p>
	<div class="idForm">
		<input type="text" id="id" placeholder="ID">
	</div>
	<div class="pwForm">
		<input type="text" id="pw" placeholder="PassWord">
	</div>
	<div class="button">
	<button type="submit" id="login">L O G I N</button>
	</div>
	<div class="check">
	<a href="" id="find">아이디/비밀번호 찾기</a>
	<a href="memberAdd.html" id="create">회원가입</a>
	</div>
</form>
</body>
</html>