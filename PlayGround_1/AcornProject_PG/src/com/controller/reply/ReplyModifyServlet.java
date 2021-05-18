package com.controller.reply;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.dto.ReplyDTO;
import com.service.ReplyService;

/**
 * Servlet implementation class ReplyInsertServlet
 */
@WebServlet("/ReplyModifyServlet")
public class ReplyModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReplyModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReplyService service = new ReplyService();
		HttpSession session = request.getSession();
		String replyKind = request.getParameter("replyKind");
		boolean isComplete = false;
		String mesg = "";
		MemberDTO login= (MemberDTO) session.getAttribute("login");
		int boardId = Integer.parseInt(request.getParameter("boardId"));
		String rId = request.getParameter("replyId");
		int replyId = 0;
		if (rId != null)
			replyId = Integer.parseInt(rId);
		String mbrName = request.getParameter("mbrName");
		String replyContent = request.getParameter("replyContent");
		int replyLiked = 0;
		long miliSeconds = System.currentTimeMillis();
		Date replyDate = new Date(miliSeconds);
		ReplyDTO dto = new ReplyDTO(replyId, boardId, login.getMbrId(), login.getMbrName(), replyContent, replyLiked, replyDate);
		if (login != null) {
			if (login.getMbrId().contentEquals(login.getMbrId()) && replyKind.contentEquals("boardInsert")) {
				isComplete = service.replyInsert(dto);
			} else if (login.getMbrId().contentEquals(login.getMbrId()) && replyKind.contentEquals("boardUpdate")) {
				isComplete = service.replyUpdate(dto);
			} else if (login.getMbrId().contentEquals(login.getMbrId()) && replyKind.contentEquals("boardDelete")){
				isComplete = service.replyDelete(replyId);
			}
		}
		if (isComplete) {
			if (replyKind.contentEquals("replyInsert"))
				mesg = "해당 게시글을 추가하였습니다.";
			else if (replyKind.contentEquals("replyUpdate"))
				mesg = "해당 게시글을 수정하였습니다.";
			else
				mesg = "해당 게시글을 삭제하였습니다.";
		} 
		if (!isComplete){
			if (login != null) {
				mesg = "로그인 필요합니다.";
			} else {
				mesg = "해당 게시물에 대한 처리를 수행하지 못했습니다.";
			}
		}
		request.setAttribute("mesg", mesg);
		RequestDispatcher dis = request.getRequestDispatcher("boardPage.jsp");
	     dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
