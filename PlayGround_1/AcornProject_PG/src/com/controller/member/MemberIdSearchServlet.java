package com.controller.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.MemberDTO;
import com.service.MemberService;

@WebServlet("/MemberIdSearchServlet")
public class MemberIdSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberIdSearchServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String mbrName = request.getParameter("mbrName").trim();
		String mbrEmail = request.getParameter("mbrEmail").trim();

		MemberDTO dto = new MemberDTO();
		dto.setMbrName(mbrName);
		dto.setMbrEmail(mbrEmail);

		MemberService service = new MemberService();
		String mbrId = service.idSearch(dto);

		System.out.println("아이디: " + mbrId);
		String nextPage = null;

		if (mbrId == null) { // findId.jsp로 돌아가서 alert 창 띄우기
			nextPage = "MemberIdSearchUIServlet";
			request.setAttribute("mesg", "다시 확인해 주십시오. ");
		} else {
			nextPage = "LoginForm.jsp";
			request.setAttribute("mbrId", "회원님의 아이디는 "+ mbrId +" 입니다. 다시 로그인하세요!");
		}
		RequestDispatcher dis = request.getRequestDispatcher(nextPage);
		dis.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
