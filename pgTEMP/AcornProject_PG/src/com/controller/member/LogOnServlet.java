package com.controller.member;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.dto.MemberDTO;
import com.service.MemberService;

//로그인해서 들어가면 나오는 화면 
@WebServlet("/LogOnServlet")
public class LogOnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public LogOnServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mbrId = request.getParameter("mbrId");
		String mbrPw = request.getParameter("mbrPw");
		HashMap<String, String> map = new HashMap<>();
		map.put("mbrId", mbrId);
		map.put("mbrPw", mbrPw);
		MemberService service = new MemberService();
		System.out.println("maps: "+map.toString());
		
		MemberDTO dto = service.login(map);
		
		String nextPage=null;
		if(dto!=null) {
			System.out.println(dto.toString());
			nextPage = "main.jsp";
			HttpSession session = request.getSession();
			session.setAttribute("login", dto);
		}else {
			
			HttpSession session = request.getSession();
			session.setAttribute("mesg", "ID/PW 다시 확인해주십시오");		
			nextPage = "LoginServlet"; //-> loginForm.jsp 
			
		}

		response.sendRedirect(nextPage);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
