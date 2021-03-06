package com.controller.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
@WebServlet("/MemberUpdateServlet")
public class MemberUpdateServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("MemberUpdateServlet까지 왔다!");
		
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String nextPage = null;
		
		if (dto != null) {
			request.setCharacterEncoding("utf-8");// 한글처리
			response.setContentType("text/html; charset=UTF-8");
			
			String mbrId = request.getParameter("mbrId");
			String mbrPw = request.getParameter("mbrPw");
			String mbrName = request.getParameter("mbrName");
			String mbrEmail = request.getParameter("mbrEmail");
			String mbrRegdate = request.getParameter("mbrRegdate");
			String mbrGenre = request.getParameter("mbrGenre");

			MemberDTO dto2 = new MemberDTO(mbrId, mbrPw, mbrName, mbrEmail, mbrRegdate, mbrGenre);
			System.out.println("dto2: " + dto2);
			MemberService service = new MemberService();
			int num = service.memberUpdate(dto2);
			System.out.println("회원정보 수정된 num : " + num);
			nextPage = "MyPageServlet";
		} else {
			nextPage = "LoginUIServlet";
			request.setAttribute("mesg", "로그인이 필요한 작업입니다.");
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
