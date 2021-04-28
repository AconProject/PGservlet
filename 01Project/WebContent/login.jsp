<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<style type="text/css">
@import url('https://fonts.googleapis.com/css2?family=Orelega+One&family=Work+Sans:ital,wght@0,300;1,300&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Balsamiq+Sans&family=Orelega+One&family=Work+Sans:ital,wght@0,300;1,300&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Balsamiq+Sans&family=Orelega+One&family=Righteous&family=Work+Sans:ital,wght@0,300;1,300&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Balsamiq+Sans&family=Orelega+One&family=Righteous&family=Sunflower:wght@300&family=Work+Sans:ital,wght@0,300;1,300&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Electrolize&display=swap');

* {
	margin: 0px;
	padding: 0px;
	text-decoration: none;
}

body {
	background-color: #A5D8FA;
}

.loginForm {
	position: absolute;
	width: 370px;
	height: 470px;
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
	<form action="LoginSubmit.jsp" method="post" class="loginForm">
		<a href=""><img src="Image/logo.png"></a>
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
			<a href="FindIdPw.jsp" id="find">아이디/비밀번호 찾기</a> 
			<a href="MemberAdd.jsp" id="create">회원가입</a>
		</div>
	</form>
</body>
</html>