<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.member{
	padding:5px;
	margin:10px 20px;
	font-size: 17px;
}form{
	padding:5px;
	margin:10px 50px;
	font-size: 17px;
}
button {
	margin: 20px 40px;
	width: 90px;
	height:30px;
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
</head>
<body>
<form action="" method="post">
	<input type="hidden" value="" name="mbrId"><!-- hidden으로 데이터 전달  -->
	<div class="member">아이디  &nbsp;&nbsp;&nbsp; aaa</div><br>
	<div class="member">닉네임  &nbsp;&nbsp;&nbsp; <input type="text" value="bbb" name="mbrName" id="mbrName"></div><br>
	<div class="member">이메일  &nbsp;&nbsp;&nbsp; <input type="email" value="ccc@ccc.com" name="mbrEmail" id="mbrEmail"></div><br>
	<div class="member">선호장르  &nbsp;&nbsp;&nbsp; <input type="text" value="#전쟁" name="mbrGenre" id="mbrGenre"></div><br>
	<button type="submit">수 정</button>
</form>
</body>
</html>