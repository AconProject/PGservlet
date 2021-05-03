<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Play Ground</title>
<!-- <style type="text/css">body{background-image: url("./images/background.png");}</style>-->
<meta name="description" content="PlayGround" />
<meta name="author" content="TeamTwo" />
<link rel="icon" type="image/png" href="Ia/gameLogo.png" />


<%
	String mesg = (String) session.getAttribute("memberAdd");
if (mesg != null) {
%>
<script type="text/javascript">
     alert('<%=mesg%>');
</script>
<%
	}
%>
</head>
<body>
	<h1>Main화면입니다.</h1>
	<jsp:include page="common/top.jsp" flush="true"></jsp:include><br>
	<jsp:include page="common/menu.jsp" flush="true"></jsp:include>
	<hr>
	<jsp:include page="common/main.jsp" flush="true"></jsp:include>


</body>
</html>