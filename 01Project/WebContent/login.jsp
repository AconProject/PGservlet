<%@ page language="java" contentType="text/html; charset=UTF-8"
<<<<<<< HEAD
	pageEncoding="UTF-8"%>
=======
    pageEncoding="UTF-8"%>
>>>>>>> 690736889abf78172d2b707924da8b774b5172fa
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<<<<<<< HEAD
<title>Login</title>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

=======
<title>Insert title here</title>
>>>>>>> 690736889abf78172d2b707924da8b774b5172fa
<style type="text/css">
@import url('https://fonts.googleapis.com/css2?family=Orelega+One&family=Work+Sans:ital,wght@0,300;1,300&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Balsamiq+Sans&family=Orelega+One&family=Work+Sans:ital,wght@0,300;1,300&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Balsamiq+Sans&family=Orelega+One&family=Righteous&family=Work+Sans:ital,wght@0,300;1,300&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Balsamiq+Sans&family=Orelega+One&family=Righteous&family=Sunflower:wght@300&family=Work+Sans:ital,wght@0,300;1,300&display=swap');
<<<<<<< HEAD
@import url('https://fonts.googleapis.com/css2?family=Electrolize&display=swap');
=======
>>>>>>> 690736889abf78172d2b707924da8b774b5172fa

* {
	margin: 0px;
	padding: 0px;
	text-decoration: none;
}

body {
	background-color: #A5D8FA;
}

.loginForm {
<<<<<<< HEAD
	position: absolute;
	width: 370px;
	height: 470px;
=======
	position:absolute;
	width:370px;
	height:470px;
>>>>>>> 690736889abf78172d2b707924da8b774b5172fa
	padding: 30px, 20px;
	background-color: white;
	text-align: center;
	top: 20%;
	left: 37%;
	border-radius: 15px;
}
<<<<<<< HEAD

img{
	width:100px;
	height:60px;
	margin: 20px;
	display: block;
}
.loginForm p {
	text-align: center;
	padding: 20px;
	font-family: Sunflower;
	font-size: medium;
	font-weight: bold;
}

.idForm, .pwForm {
	border-none;
	border-bottom: 2px solid #adadad;
	margin: 20px;
	padding: 10px;
}

#userid, #passwd {
	width: 100%;
	border: none;
	outline: none;
	color: #636e72;
	font-size: 20px;
	height: 25px;
	background: none;
	font-family: Electrolize;
}

#login {
	display: inline;
	width: 40%;
	height: 40px;
	margin: 10px;
	border: none;
	border-radius: 10px;
	background-color: #a3daff;
	color: white;
	font-size: medium;
	font-weight: bold;
	font-family: Electrolize;
}

.check {
	margin-top: 20px;
	font-size: 15px;
}

#find {
	margin-right: 10px;
	color: black;
}

#create {
	margin-right: 10px;
	color: black;
}

#mypage {
	margin-left: 10px;
	color: black;
}
</style>

<script type="text/javascript">
	$(function() {
		
		$("form").submit(function() {
			// 아이디 & 비밀번호 입력 검사
			var userid = $("#userid");
			var passwd = $("#passwd");
			
			if(userid.val().length==0){
				swal("Oops!!", "ID를 다시 입력해주세요!", "error");
				userid.focus();
				event.preventDefault();
			} else if(passwd.val().length==0){
				swal("Oops!!", "PASSWORD를 다시 입력해주세요!", "error");
				passwd.focus();
				event.preventDefault();
			}
		})
	});
</script>

</head>
<body>
	<form action="loginsubmit.jsp" method="post" class="loginForm">
		<a href=""><img src="image/logo.png"></a>
		<p>" 자신을 알아야 평화를 찾을 수 있는 법 "</p>
		<div class="idForm">
			<input type="text" id="userid" placeholder="ID">
		</div>
		<div class="pwForm">
			<input type="text" id="passwd" placeholder="PassWord">
		</div>
		<div class="button">
			<button type="submit" id="login">L O G I N</button>
		</div>
		<div class="check">
			<a href="findidpw.jsp" id="find">아이디/비밀번호 찾기</a> 
			<a href="memberadd.jsp" id="create">회원가입</a>
		</div>
	</form>
=======
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
>>>>>>> 690736889abf78172d2b707924da8b774b5172fa
</body>
</html>