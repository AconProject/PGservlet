<%@page import="com.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
    	//form 서브밋
 $("form").on("submit",function(event){		
	 var userid = $("#userid").val();
	 var passwd = $("#passwd").val();
    		if(userid.length==0){
    			alert("userid 필수")
    			$("#userid").focus();
    			event.preventDefault();
    		}else if(passwd.length==0){
    			alert("passwd 필수")
    			$("#passwd").focus();
    			event.preventDefault();
    		}
    	});
//비번확인
 $("#passwd2").on("keyup",function(){
		var passwd = $("#passwd").val();
		var mesg = "비번 불일치";
		if(passwd == $(this).val()){
			mesg = "비번 일치";
		}
		$("#result2").text(mesg);
	});
	
//이메일 선택
 $("#emailSelect").on("change",function(){
		var email = $(this).val();
		  $("#email2").val(email);
	});
	
 $("#userid").on("keyup",function(event){	
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
<%
   MemberDTO dto =(MemberDTO)session.getAttribute("login");
   String mbrId = dto.getMbrId();
   String mbrName = dto.getMbrName();
   String mbrPw = dto.getMbrPw();
   String mbrEmail = dto.getMbrEmail();
   String mbrGenre = dto.getMbrGenre();
   String mbrRegdate = dto.getMbrRegdate();
   
%>
<form action="MemberUpdateServlet" method="post">
Hello :) 
</form>
