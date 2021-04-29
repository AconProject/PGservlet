package com.controller.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;

/**
 * Servlet implementation class MemberUIServlet
 */
@WebServlet("/MemberAddServlet")
public class MemberAddServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userid = request.getParameter("mbrId");
		String passwd = request.getParameter("mbrPw");
		String username = request.getParameter("mbrName");
		String email1 = request.getParameter("mbrEmail1");
		
		
		
		MemberDTO dto =
				new MemberDTO(mbrId,mbrPw,mbrName,mbrEmail1);
		
		MemberService service = new MemberService();
		int n = service.memberAdd(dto);
		
		HttpSession session = request.getSession();
		session.setAttribute("memberAdd", "회원가입성공");
		session.setMaxInactiveInterval(3600);
		response.sendRedirect("main");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
