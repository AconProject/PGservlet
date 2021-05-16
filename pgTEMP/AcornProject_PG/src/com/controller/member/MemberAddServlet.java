package com.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;

/*
	회원가입 페이지 
 */
@WebServlet("/MemberAddServlet")
public class MemberAddServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String mbrId = request.getParameter("mbrId");
		String mbrPw = request.getParameter("mbrPw");
		String mbrName= request.getParameter("mbrName");
		String mbrEmail = request.getParameter("mbrEmail");
		String mbrRegdate = request.getParameter("mbrRegdate");
		String mbrGenre = request.getParameter("mbrGenre");
		
		
		
		MemberDTO dto =
				new MemberDTO(mbrId,mbrPw,mbrName,mbrEmail,mbrRegdate,mbrGenre);
		System.out.println(dto.toString());
		
		
		  MemberService service = new MemberService();
		  int n = service.memberAdd(dto);
	
		  System.out.println("회원가입여부: "+n);
		  System.out.println("dto: "+dto.toString());
		  
		  HttpSession session = request.getSession(); 
		  session.setAttribute("memberAdd", "회원가입성공");
		  session.setMaxInactiveInterval(3600);
		  response.sendRedirect("Main.jsp");
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
