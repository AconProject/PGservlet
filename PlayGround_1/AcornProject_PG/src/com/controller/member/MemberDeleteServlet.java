package com.controller.member;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;


@WebServlet("/MemberDeleteServlet")
public class MemberDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MemberDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("MemberDeleteServlet까지 넘어옴");
		request.setCharacterEncoding("utf-8");// 한글처리
		response.setContentType("text/html; charset=UTF-8");
		
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String nextPage ="LoginServlet";
		
		if (dto != null) {
			String mbrId = request.getParameter("mbrId");
			String mbrPw = request.getParameter("mbrPw");
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("mbrId",mbrId);
			map.put("mbrPw",mbrPw);
			System.out.println("map: "+map);
			MemberService service = new MemberService();
			int num = service.memberDelete(map);
			System.out.println("회원정보 삭제된 결과: " + num);
			request.setAttribute("mesg", "[회원 탈퇴]하셨습니다.");
		
		} else {
			request.setAttribute("mesg", "로그인이 필요한 작업입니다.");
		}
		RequestDispatcher dis = request.getRequestDispatcher(nextPage);
		dis.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
