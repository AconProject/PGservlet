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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String mbrName = request.getParameter("mbrName").trim();
		 String mbrPw = request.getParameter("mbrPw").trim();
		
		 MemberDTO dto = new MemberDTO();
		 dto.setMbrName(mbrName);
		 dto.setMbrPw(mbrPw);
		 
		 MemberService service = new MemberService();
		 String mbrId = service.idSearch(dto);
		 String nextPage = null;
		 
		 if(mbrId==null) { //findId.jsp로 돌아가서 alert 창 띄우기
			 nextPage="findId.jsp";
			 request.setAttribute("mesg", "다시 입력해주십시오. ");
		 }else {
			 nextPage="findId.jsp";
			 request.setAttribute("mbrId", mbrId);
		 }
		 RequestDispatcher dis = request.getRequestDispatcher(nextPage);
		 dis.forward(request, response);
		 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
