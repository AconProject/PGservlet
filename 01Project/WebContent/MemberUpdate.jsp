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
}
form{
	padding:5px;
	margin:10px 50px;
	font-size: 17px;
}
.content{
	height:20px;
}
table{
	margin:10px;
	border-collapse: collapse;
}
td{
	padding: 15px;
	text-align: center;
}

input[type="checkbox"] {
		position: absolute;
		left: -3000%;
}

input[type="checkbox"] + label {
	position: relative;
	padding: 5px;
}

input[type="checkbox"] + label:before {
	content: "";
	display: inline-block;
	margin: 5px 10px 0 0;
	width: 20px;
	height: 20px;
	border: 1px solid #A6A6A6;
	position: relative;
	top: 4px;
	border-radius: 3px;
	transition: all 0.5s;
}
input[type="checkbox"]:checked + label:before {
	background: #FFA500;
	border-color: #FFA500;
}
input[type="checkbox"] + label:after {
	content:"";
	position: absolute;
	left: 0;
	top:0;
	background: url(Image/checkicon.png) no-repeat center;
	width: 22px;
	height: 22px;
	background-size: 0 auto;
	transition: all 0.5s 0.3s;
}
input[type="checkbox"]:checked + label:after {
	background-size:30px auto;
}

button {
	margin: 20px 53px;
	width: 60px;
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
	<div class="member">닉네임  &nbsp;&nbsp;&nbsp; <input type="text" class="content" value="bbb" name="mbrName" id="mbrName"></div><br>
	<div class="member">이메일  &nbsp;&nbsp;&nbsp; <input type="email" class="content" value="ccc@ccc.com" name="mbrEmail" id="mbrEmail"></div><br>
	<div class="member">선호장르
	<table border="1">
		<tr>
			<td><input type="checkbox" name="tag" id="tag1" value="레이싱"><label for="tag1">레이싱</label></td>
			<td><input type="checkbox" name="tag" id="tag2" value="생존"><label for="tag2">생존</label></td>
			<td><input type="checkbox" name="tag" id="tag3" value="슈팅"><label for="tag3">슈팅</label></td>
			<td><input type="checkbox" name="tag" id="tag4" value="스포츠"><label for="tag4">스포츠</label></td>
			<td><input type="checkbox" name="tag" id="tag5" value="시뮬레이션"><label for="tag5">시뮬레이션</label></td>
			<td><input type="checkbox" name="tag" id="tag6" value="액션"><label for="tag6">액션</label></td>
		</tr>
		<tr>
			<td><input type="checkbox" name="tag" id="tag7" value="어드밴처"><label for="tag7">어드밴처</label></td>
			<td><input type="checkbox" name="tag" id="tag8" value="오프월드"><label for="tag8">오프월드</label></td>
			<td><input type="checkbox" name="tag" id="tag9" value="음악"><label for="tag9">음악</label></td>
			<td><input type="checkbox" name="tag" id="tag10" value="전략"><label for="tag10">전략</label></td>
			<td><input type="checkbox" name="tag" id="tag11" value="전쟁"><label for="tag11">전쟁</label></td>
			<td><input type="checkbox" name="tag" id="tag12" value="캐쥬얼"><label for="tag12">캐쥬얼</label></td>
		</tr>
		<tr>
			<td><input type="checkbox" name="tag" id="tag13" value="모험"><label for="tag13">모함</label></td>
			<td><input type="checkbox" name="tag" id="tag14" value="판타지"><label for="tag14">판타지</label></td>
			<td><input type="checkbox" name="tag" id="tag15" value="퍼즐"><label for="tag15">퍼즐</label></td>
			<td><input type="checkbox" name="tag" id="tag16" value="롤플레잉"><label for="tag16">롤플레잉</label></td>
			<td><input type="checkbox" name="tag" id="tag17" value="공상과학"><label for="tag17">공상과학</label></td>
			<td><input type="checkbox" name="tag" id="tag18" value="턴제전략"><label for="tag18">턴제전략</label></td>
		</tr>
		<tr>
			<td><input type="checkbox" name="tag" id="tag19" value="협동"><label for="tag19">협동</label></td>
			<td><input type="checkbox" name="tag" id="tag20" value="애니"><label for="tag20">애니</label></td>
			<td><input type="checkbox" name="tag" id="tag21" value="어려움"><label for="tag21">어려움</label></td>
			<td><input type="checkbox" name="tag" id="tag22" value="카드배틀"><label for="tag22">카드배틀</label></td>
			<td><input type="checkbox" name="tag" id="tag23" value="인디게임"><label for="tag23">인디게임</label></td>
			<td><input type="checkbox" name="tag" id="tag24" value="경영"><label for="tag24">경영</label></td>
		</tr>
	</table>
	
	</div>
</form>
</body>
</html>