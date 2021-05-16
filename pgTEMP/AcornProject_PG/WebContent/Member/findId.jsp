<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.dto.MemberDTO"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
   String mesg = (String)request.getAttribute("mbrId");
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

</body>
</html>