<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<link rel="stylesheet" type="text/css" href="CSS/MemberAdd.css">

<script type="text/javascript" src="js/jquery-3.3.1.js">
	$(document).ready(function() {

		$("form").on("submit", function() {

			var mbrId = $("#mbrId");
			var mbrPw = $("#mbrPw");

			if (mbrId.val().length == 0) {
				swal("Oops!!", "ID를 다시 입력해주세요!", "error");
				mbrId.focus();
				event.preventDefault();
			} else if (mbrPw.val().length == 0) {
				swal("Oops!!", "PASSWORD를 다시 입력해주세요!", "error");
				mbrPw.focus();
				event.preventDefault();
			}
		});

		// 비밀번호 숫자 제한(6자리)
		$("#mbrPw").focusout(function() {
			var passwd1 = $("#mbrPw").val();
			if (passwd1.length < 6) {
				swal("Oops!!", "비밀번호는 6글자 이상만 이용 가능합니다!", "error");
				$("#mbrPw").value = null;
				event.preventDefault();
			}
		});

		// 비밀번호 확인
		$("#mbrPw2").on("keyup", function() {
			var mbrPw = $("#mbrPw").val();
			var mbrPw2 = $("#mbrPw2").val();

			if (mbrPw == mbrPw2) {
				$("#pwcheck").text("비밀번호 일치");
			} else {
				$("#pwcheck").text("비밀번호 불일치");
			}
		});
	});
</script>

<!--나오는 값: 아이디,비빌번호, 비밀번호 확인, 닉네임, 이메일 , 가입일자 (안보이는 값으로)   -->

<form action="MemberAddServlet" method="post" class="addForm">
	<a href="Main.jsp"><img src="Image/logo.png"></a>
	<h2>회원가입</h2>
	<div class="contentform">
		<div class="row" style="display: inline;">
			<span class="title">아이디 * <span id="idcheck"
				style="margin-left: 10px; font-size: 13px;"></span>
			</span> <input type="text" class="content" name="mbrId" id="mbrId" autofocus>
		</div>

		<div class="row">
			<span class="title">비밀번호 *</span> <input type="text" class="content"
				name="mbrPw" id="mbrPw" autocomplete="off"
				placeholder="   비밀번호는 6자리 이상이어야 합니다.">
		</div>

		<div class="row" style="display: inline;">
			<span class="title">비밀번호 확인 * <span id="pwcheck"
				style="margin-left: 10px; font-size: 13px;"></span>
			</span> <input type="text" class="content" name="mbrPw2" id="mbrPw2">
		</div>

		<div class="row">
			<span class="title">닉네임 *</span> <input type="text" class="content"
				name="mbrName" id="mbrName">
		</div>

		<div class="row">
			<span class="title">이메일 *</span> <input type="email" class="content"
				name="mbrEmail" id="mbrEmail">
		</div>

		<div class="row">
			<span class="title" id="tagname">태그 <button 
				onclick="window.open('GameFolder/TagPage.jsp','','width=200,height=300,left=670,top=500,scrollbars=1,location=no,resizable=no'); return false;">Tag</button></span>
			<input type="text" name="mbrGenre" id="mbrGenre"  class="content">
			<br>
			
		</div>
		


		<div class="button">
			<input type="submit" value="제 출">
		</div>

	</div>

</form>





