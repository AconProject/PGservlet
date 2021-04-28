<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<style type="text/css">
@import url('https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Concert+One&family=Do+Hyeon&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Electrolize&display=swap');

* {
	margin: 0px;
	padding: 0px;
	text-decoration: none;
}

body {
	background-color: #A5D8FA;
	height: 1000px;
}

.addForm {
	position: absolute;
	padding: 30px, 20px;
	width: 530px;
	height: 780px;
	background-color: white;
	border-radius: 15px;
	top: 10%;
	left: 35%;
}

img{
	width:100px;
	height:60px;
	margin: 20px;
	margin-bottom:0px;
}
.addForm h1 {
	text-align: left;
	margin-top: 20px;
	margin-left: 30px;
	margin-bottom: 10px;
	line-height: 1;
	font-family: Electrolize;
	font-size: x-large;
	font-weight : bold;
	color: #FF8C0A;
}

.addForm h2 {
	text-align: center;
	margin: 20px;
}

.header {
	margin: 10px;
}

.header #sign {
	left: 45%;
	font-size: large;
	font-weight: bold;
	text-align: center;
	margin-bottom: 10px;
}

.row .title {
	margin: 10px;
	display: block;
	line-height: 17px;
	margin-left: 50px;
	margin-bottom: 12px;
}


.title {
	font-size: 18px;
}

.content {
	height: 30px;
	margin-bottom: 20px;
	width: 80%;
	margin-left: 50px;
	font-size: 15px;
}

.tag {
	display: inline-block;
	text-align: center;
	margin: 10px;
	padding: 5px;
	width: 50px;
	height: 30px;
	border: 1px solid black;
}

.tags {
	margin-left:43px;
	margin-right:30px;
}

div.button {
	margin-top: 20px;
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
}
#tagname {
	margin-bottom: 0px;
}
#tag {
	width:80px;
	height:30px;
	margin:10px 55px;
	background:#FFA500	;
	color:#fff;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	cursor:pointer;
	border:none;
	border-radius: 5px;
	font-family: Electrolize;
	font-weight: 800;
}
</style>

<script type="text/javascript">
	
	$(function() {
		
		$("form").on("submit", function() {
			
			var userid = $("#userid");
			var passwd1 = $("#passwd1");
			
			if(userid.val().length == 0){
				swal("Oops!!", "ID를 다시 입력해주세요!", "error");
				userid.focus();
				event.preventDefault();
			} 
			else if(passwd1.val().length == 0){
				swal("Oops!!", "PASSWORD를 다시 입력해주세요!", "error");
				passwd1.focus();
				event.preventDefault();
			}
		});
		
		// 비밀번호 숫자 제한(6자리)
		$("#passwd1").focusout(function() {
			var passwd1 = $("#passwd1").val();
			if(passwd1.length<6){
				swal("Oops!!", "비밀번호는 6글자 이상만 이용 가능합니다!", "error");
				$("#passwd1").value = null;
				event.preventDefault();
			}
		});
		
		// 비밀번호 확인
		$("#passwd2").on("keyup", function() {
			var passwd1 = $("#passwd1").val();
			var passwd2 = $("#passwd2").val();
		
			if(passwd1 == passwd2){
				$("#pwcheck").text("비밀번호 일치");
			}else{
				$("#pwcheck").text("비밀번호 불일치");
			}
		});
	})
</script>
</head>
<body>

	<form method="get" class="addForm">
		<a href=""><img src="Image/logo.png"></a>
		<h2>회원가입</h2>
		<div class="contentform">
			<div class="row" style="display: inline; ">
				<span class="title">아이디 *
					<span id="idcheck" style="margin-left: 10px; font-size: 13px;"></span>
				</span> 
				<input type="text" class="content" id="userid" autofocus>
			</div>
			<div class="row">
				<span class="title">비밀번호 *</span> 
				<input type="text" class="content" id="passwd1" autocomplete="off" placeholder="   비밀번호는 6자리 이상이어야 합니다.">
			</div>
			<div class="row" style="display: inline; ">
				<span class="title">비밀번호 확인 *
					<span id="pwcheck" style="margin-left: 10px; font-size: 13px;"></span>
				</span> 
				<input type="text" class="content" id="passwd2">
			</div>
			<div class="row">
				<span class="title">닉네임 *</span> 
				<input type="text" class="content" id="nickname" autofocus>
			</div>
			<div class="row">
				<span class="title">이메일 *</span> 
				<input type="email" class="content" id="email">
			</div>
			<div class="row">
				<span class="title" id="tagname">태그</span> 
				<button id="tag"  onclick="window.open('TagPage.jsp'); return false;">Tag</button>
			</div>
			<div class="button">
				<input type="submit" value="제 출" onclick="javascript: form.action='AddSubmit.jsp';">
			</div>
		</div>

	</form>
</body>
</html>