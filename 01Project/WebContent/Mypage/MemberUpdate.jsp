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
	margin:10px 30px;
	font-size: 17px;
	display:block;
}
.content{
	height:20px;
	border:1px;
}
.mbrinfo{
	height:20px;
}
table{
	margin:10px;
	border-collapse: collapse;
	font-size: 16px;
	width: 700px;
}

td{
	padding: 10px 8px;
	text-align: center;
}



button {
	float:right;
	margin: 20px 0px;
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
	<div class="member">닉네임   &nbsp;&nbsp;&nbsp;<input type="text" class="mbrinfo" value="bbb" name="mbrName" id="mbrName"></div><br>
	<div class="member">이메일   &nbsp;&nbsp;&nbsp;<input type="email" class="mbrinfo"value="ccc@ccc.com" name="mbrEmail" id="mbrEmail"></div><br>
	<div class="member">선호장르
	<table border="1">
		<tr>
			<td><input type="checkbox" name="tag" id="tag1" value="레이싱"><label for="tag1">&nbsp;레이싱</label></td>
			<td><input type="checkbox" name="tag" id="tag2" value="생존"><label for="tag2">&nbsp;생존</label></td>
			<td><input type="checkbox" name="tag" id="tag3" value="슈팅"><label for="tag3">&nbsp;슈팅</label></td>
			<td><input type="checkbox" name="tag" id="tag4" value="스포츠"><label for="tag4">&nbsp;스포츠</label></td>
			<td><input type="checkbox" name="tag" id="tag5" value="시뮬레이션"><label for="tag5">&nbsp;시뮬레이션</label></td>
			<td><input type="checkbox" name="tag" id="tag6" value="액션"><label for="tag6">&nbsp;액션</label></td>
		</tr>
		<tr>
			<td><input type="checkbox" name="tag" id="tag7" value="어드밴처"><label for="tag7">&nbsp;어드밴처</label></td>
			<td><input type="checkbox" name="tag" id="tag8" value="오프월드"><label for="tag8">&nbsp;오프월드</label></td>
			<td><input type="checkbox" name="tag" id="tag9" value="음악"><label for="tag9">&nbsp;음악</label></td>
			<td><input type="checkbox" name="tag" id="tag10" value="전략"><label for="tag10">&nbsp;전략</label></td>
			<td><input type="checkbox" name="tag" id="tag11" value="전쟁"><label for="tag11">&nbsp;전쟁</label></td>
			<td><input type="checkbox" name="tag" id="tag12" value="캐쥬얼"><label for="tag12">&nbsp;캐쥬얼</label></td>
		</tr>
		<tr>
			<td><input type="checkbox" name="tag" id="tag13" value="모험"><label for="tag13">&nbsp;모함</label></td>
			<td><input type="checkbox" name="tag" id="tag14" value="판타지"><label for="tag14">&nbsp;판타지</label></td>
			<td><input type="checkbox" name="tag" id="tag15" value="퍼즐"><label for="tag15">&nbsp;퍼즐</label></td>
			<td><input type="checkbox" name="tag" id="tag16" value="롤플레잉"><label for="tag16">&nbsp;롤플레잉</label></td>
			<td><input type="checkbox" name="tag" id="tag17" value="공상과학"><label for="tag17">&nbsp;공상과학</label></td>
			<td><input type="checkbox" name="tag" id="tag18" value="턴제전략"><label for="tag18">&nbsp;턴제전략</label></td>
		</tr>
		<tr>
			<td><input type="checkbox" name="tag" id="tag19" value="협동"><label for="tag19">&nbsp;협동</label></td>
			<td><input type="checkbox" name="tag" id="tag20" value="애니"><label for="tag20">&nbsp;애니</label></td>
			<td><input type="checkbox" name="tag" id="tag21" value="어려움"><label for="tag21">&nbsp;어려움</label></td>
			<td><input type="checkbox" name="tag" id="tag22" value="카드배틀"><label for="tag22">&nbsp;카드배틀</label></td>
			<td><input type="checkbox" name="tag" id="tag23" value="인디게임"><label for="tag23">&nbsp;인디게임</label></td>
			<td><input type="checkbox" name="tag" id="tag24" value="경영"><label for="tag24">&nbsp;경영</label></td>
		</tr>
	</table>
	</div>
	<button type="submit">확인</button>
</form>
</body>
</html>