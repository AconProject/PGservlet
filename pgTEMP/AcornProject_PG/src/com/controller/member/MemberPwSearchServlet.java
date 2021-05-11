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

/**
 * Servlet implementation class MemberPwSearchServlet
 */
@WebServlet("/MemberPwSearchServlet")
public class MemberPwSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public MemberPwSearchServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String mbrId = request.getParameter("mbrId").trim();
		 String mbrEmail = request.getParameter("mbrEmail").trim();
		
		 MemberDTO dto = new MemberDTO();
		 dto.setMbrId(mbrId);
		 dto.setMbrEmail(mbrEmail);
		 
		 
		 MemberService service = new MemberService();
		 String mbrPw = service.pwSearch(dto);
		 
		 String nextPage = null;
		 
		 if(mbrPw==null) {
			 nextPage="findPw.jsp";
			 request.setAttribute("mesg", "다시 확인해 주십시오");
		 }else {
			 nextPage="findPw.jsp";
			 request.setAttribute("mbrPw", mbrPw);
		 }
		 
		 RequestDispatcher dis = request.getRequestDispatcher(nextPage);
		 dis.forward(request, response);
		 
	}	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
