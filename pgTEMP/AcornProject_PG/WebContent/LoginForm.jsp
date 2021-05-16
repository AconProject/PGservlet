<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style> body{} </style>
<meta charset="UTF-8">
<link rel="icon" type="image/png" href="images/gameLogo.png" />
<%
   String mesg = (String)request.getAttribute("mbrId");
  if(mesg!=null){
%>    
   <script>
     alert('<%=mesg %>');
   </script>
<%
	session.removeAttribute("mbrId");
  }
%> 
<title>Login</title>
</head>
<body>
	<h1>로그인 화면입니다.</h1>
	<jsp:include page="common/top.jsp" flush="true"></jsp:include><br>
	<jsp:include page="common/menu.jsp" flush="true"></jsp:include>
	<hr>
	<jsp:include page="Member/loginForm.jsp" flush="false" />
</body>
</html>