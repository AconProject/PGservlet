<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="icon" type="image/png" href="images/gameLogo.png" />

<title>Insert title here</title>
</head>
<body>
	<h1>회원등록화면입니다.</h1>
	<jsp:include page="common/top.jsp"></jsp:include><br>
	<jsp:include page="common/menu.jsp"></jsp:include><br>
	<hr>
	<jsp:include page="/member/memberForm.jsp" flush="false"></jsp:include>
</body>
</html>