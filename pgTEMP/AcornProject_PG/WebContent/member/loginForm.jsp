<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="CSS/Login.css">
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("form").submit(function() {
			// 아이디 & 비밀번호 입력 검사
			var userid = $("#userid");
			var passwd = $("#passwd");
			if (userid.val().length == 0) {
				swal("Oops!!", "ID를 다시 입력해주세요!", "error");
				userid.focus();
				event.preventDefault();
			} else if (passwd.val().length == 0) {
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
			<input type="text" name="userid" id="userid" placeholder="ID">
		</div>
		<div class="pwForm">
			<input type="text" name="passwd" id="passwd" placeholder="PassWord">
		</div>
		<div class="button">
			<button type="submit" name="login" id="login">L O G I N</button>
		</div>
		<div class="check">
			<a href="FindIdPw.jsp" id="find">아이디/비밀번호 찾기</a> 
			<a href="memberForm.jsp" id="create">회원가입</a>
		</div>
	</form>
</body>
</html>