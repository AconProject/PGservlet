<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TagPage</title>
<style type="text/css">
input[type="checkbox"] {
		position: absolute;
		left: -3000%;
}

input[type="checkbox"] + label {
	position: relative;
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
<form action="">
<input type="checkbox" name="tag" id="tag1" value="레이싱"><label for="tag1">레이싱</label><br>
<input type="checkbox" name="tag" id="tag2" value="생존"><label for="tag2">생존</label><br>
<input type="checkbox" name="tag" id="tag3" value="슈팅"><label for="tag3">슈팅</label><br>
<input type="checkbox" name="tag" id="tag4" value="스포츠"><label for="tag4">스포츠</label><br>
<input type="checkbox" name="tag" id="tag5" value="시뮬레이션"><label for="tag5">시뮬레이션</label><br>
<input type="checkbox" name="tag" id="tag6" value="액션"><label for="tag6">액션</label><br>
<input type="checkbox" name="tag" id="tag7" value="어드밴처"><label for="tag7">어드밴처</label><br>
<input type="checkbox" name="tag" id="tag8" value="오프월드"><label for="tag8">오프월드</label><br>
<input type="checkbox" name="tag" id="tag9" value="음악"><label for="tag9">음악</label><br>
<input type="checkbox" name="tag" id="tag10" value="전략"><label for="tag10">전략</label><br>
<input type="checkbox" name="tag" id="tag11" value="전쟁"><label for="tag11">전쟁</label><br>
<input type="checkbox" name="tag" id="tag12" value="캐쥬얼"><label for="tag12">캐쥬얼</label><br>
<input type="checkbox" name="tag" id="tag13" value="모험"><label for="tag13">모함</label><br>
<input type="checkbox" name="tag" id="tag14" value="판타지"><label for="tag14">판타지</label><br>
<input type="checkbox" name="tag" id="tag15" value="퍼즐"><label for="tag15">퍼즐</label><br>
<input type="checkbox" name="tag" id="tag16" value="롤플레잉"><label for="tag16">롤플레잉</label><br>
<input type="checkbox" name="tag" id="tag17" value="공상과학"><label for="tag17">공상과학</label><br>
<input type="checkbox" name="tag" id="tag18" value="턴제전략"><label for="tag18">턴제전략</label><br>
<input type="checkbox" name="tag" id="tag19" value="협동"><label for="tag19">협동</label><br>
<input type="checkbox" name="tag" id="tag20" value="애니"><label for="tag20">애니</label><br>
<input type="checkbox" name="tag" id="tag21" value="어려움"><label for="tag21">어려움</label><br>
<input type="checkbox" name="tag" id="tag22" value="카드배틀"><label for="tag22">카드배틀</label><br>
<input type="checkbox" name="tag" id="tag23" value="인디게임"><label for="tag23">인디게임</label><br>
<input type="checkbox" name="tag" id="tag24" value="경영"><label for="tag24">경영</label><br>

<button type="submit">확 인</button>
</form>
</body>
</html>