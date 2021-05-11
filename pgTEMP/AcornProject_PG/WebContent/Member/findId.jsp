<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.dto.MemberDTO"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
   String mesg = (String)request.getAttribute("mesg");
  if(mesg!=null){
%>    
   <script>
     alert('<%=mesg %>');
   </script>
<%
  }
%>   
</head>
<body>
	<%
	MemberDTO dto = (MemberDTO) request.getAttribute("mbrId");
	String mbrId = dto.getMbrId();
	%>
	<h1>
		귀하의 ID는<%=mbrId%>
		입니다.
	</h1>
</body>
</html>