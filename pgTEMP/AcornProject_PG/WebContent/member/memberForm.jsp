<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<link rel="stylesheet" type="text/css" href="CSS/Background.css">
<link rel="stylesheet" type="text/css" href="CSS/MemberAdd.css">

<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("form").on("submit", function() {

			var userid = $("#userid");
			var passwd1 = $("#passwd1");

			if (userid.val().length == 0) {
				swal("Oops!!", "ID를 다시 입력해주세요!", "error");
				userid.focus();
				event.preventDefault();
			} else if (passwd1.val().length == 0) {
				swal("Oops!!", "PASSWORD를 다시 입력해주세요!", "error");
				passwd1.focus();
				event.preventDefault();
			}
		});

		// 비밀번호 숫자 제한(6자리)
		$("#passwd1").focusout(function() {
			var passwd1 = $("#passwd1").val();
			if (passwd1.length < 6) {
				swal("Oops!!", "비밀번호는 6글자 이상만 이용 가능합니다!", "error");
				$("#passwd1").value = null;
				event.preventDefault();
			}
		});

		// 비밀번호 확인
		$("#passwd2").on("keyup", function() {
			var passwd1 = $("#passwd1").val();
			var passwd2 = $("#passwd2").val();

			if (passwd1 == passwd2) {
				$("#pwcheck").text("비밀번호 일치");
			} else {
				$("#pwcheck").text("비밀번호 불일치");
			}
		});

		//이메일 선택
		$("#emailSelect").on("change", function() {
			var email = $(this).val();
			$("#email2").val(email);
		});

		$("#userid").on("keyup", function(event) {
			$.ajax({
				type : "GET",
				url : "MemberIdCheckServlet",
				dataType : "text",
				data : {
					userid : $("#userid").val()
				},
				success : function(responseData, status, xhr) {
					$("#result").text(responseData);
				},
				error : function(xhr, status, error) {
					console.log("error");
				}
			});
		});

	});
</script>

<!--나오는 값: 아이디,비빌번호, 비밀번호 확인, 닉네임, 이메일 , 가입일자 (안보이는 값으로)   -->


<form action="MemberAddServlet" method="post" class="addForm">
	<a href=""><img src="./images/logo.png"></a>
	<h2>회원가입</h2>
	<div class="contentform">
		<div class="row" style="display: inline;">
			<span class="title">아이디  <span id="idcheck"
				style="margin-left: 10px; font-size: 13px;"></span>
			</span> <input type="text" class="content" name="userid" id="userid"
				autofocus>
		</div>

		<div class="row">
			<span class="title">비밀번호 </span> <input type="text" class="content"
				name="passwd1" id="passwd1" autocomplete="off"
				placeholder="비밀번호는 6자리 이상이어야 합니다.">
		</div>

		<div class="row" style="display: inline;">
			<span class="title">비밀번호 확인 * <span id="pwcheck"
				style="margin-left: 10px; font-size: 13px;"></span>
			</span> <input type="text" class="content" name="passwd2" id="passwd2">
		</div>

		<div class="row">
			<span class="title">닉네임 *</span> <input type="text" class="content"
				name="nickname" id="nickname">
		</div>

		<div class="row">
			<span class="title">이메일 *</span> <input type="email" class="content"
				name="email" id="email">
		</div>
		<!-- 가입일: -->
		<input type="hidden" id="regDate" name="date" value=SYSDATE>

		<div class="row">
			<span class="title" id="tagname">태그</span>
			<button id="tag" onclick="window.open('TagPage.jsp'); return false;">Tag</button>
		</div>

		<div class="button">
			<input type="submit" value="제 출"
				onclick="javascript: form.action='AddSubmit.jsp';">
		</div>

	</div>

</form>



