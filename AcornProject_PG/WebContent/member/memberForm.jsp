<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript">

	$(document).ready(function() {
		//form 서브밋
		$("form").on("submit", function(event) {
			var userid = $("#userid").val();
			var passwd = $("#passwd").val();
			if (userid.length == 0) {
				alert("userid 필수")
				$("#userid").focus();
				event.preventDefault();
			} else if (passwd.length == 0) {
				alert("passwd 필수")
				$("#passwd").focus();
				event.preventDefault();
			}
		});
		//비번확인
		$("#passwd2").on("keyup", function() {
			var passwd = $("#passwd").val();
			var mesg = "비번 불일치";
			if (passwd == $(this).val()) {
				mesg = "비번 일치";
			}
			$("#result2").text(mesg);
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


<form action="MemberAddServlet" method="post">
	<!--아이디  -->
	아이디:<input type="text" name="userid" id="userid"> 
	<span id="result"></span>
	 <input type="button" value="중복확인" > <br>
	<!--비밀번호 -->
	비밀번호:<input type="text" name="passwd" id="passwd"><br>
	비밀번호확인:<input type="text" name="passwd2" id="passwd2"> <span
		id="result2"></span> <br>
	<!--닉네임 -->
	사용하실 닉네임:<input type="text" name="username"><br> 
	<input type="button" value="중복확인"><br>

	
	 이메일 ID:<input type="text" name="email1" id="email1">@ 
	 <input type="text" name="email2" id="email2" placeholder="직접입력"> 
		<select id="emailSelect">
	
	
	
		<option value="daum.net">daum.net</option>
		<option value="naver.com">naver.com</option>
	</select> 
	<br>

	  
	  
	<input type="button" value="중복확인"><br>
		<!-- 가입일: -->
	 <input type="hidden" id="regDate" name="date" value=SYSDATE>

<input type="submit" value="회원가입"> <input type="reset" value="취소">
		
		
</form>
