package com.controller.game;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.MemberService;


@WebServlet("/replyRegisterServlet")
public class replyRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public replyRegisterServlet() {
        super();
    }

	//댓글 입력하기
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String mbrName = request.getParameter("mbrName"); //댓글 작성자
		String boardContent = request.getParameter("boardContent"); //댓글 내용
		
	
		///추가하기 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		/*
		 * MemberService service = new MemberService(); //1. service 써야되는지? int count =
		 * service.idCheck(mbrName,boardContent); //insert문 필요 + 막힌 부분
		 */
		
	

	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
