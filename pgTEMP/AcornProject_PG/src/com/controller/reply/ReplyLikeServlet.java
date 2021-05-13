package com.controller.reply;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.LikeService;
import com.service.ReplyService;

/**
 * Servlet implementation class BoardServlet
 */
@WebServlet("/ReplyLikeServlet")
public class ReplyLikeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReplyLikeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReplyService rService = new ReplyService();
		LikeService lService = new LikeService();
		HttpSession session = request.getSession();
		HashMap<String, String> ids = new HashMap<>();
		MemberDTO login = (MemberDTO)session.getAttribute("login");
		String replyId = request.getParameter("replyId");
		int like = Integer.parseInt(request.getParameter("like"));
		int cnt = 0;
		boolean isComplete = false;
		System.out.println("현재 좋아요 개수 : " + like);
		ids.put("replyId", replyId);
		ids.put("mbrId", login.getMbrId());
		cnt = lService.likeBoardCount(ids);
		if (cnt >= 1) {
			like += rService.replyLikeMinus(replyId) * -1;
			isComplete = lService.likeReplyDelete(ids);
		} else {
			like += rService.replyLikePlus(replyId);
			isComplete = lService.likeReplyInsert(ids);
		}
		System.out.println("좋아요 : " + like + " , liked 개수 : " + cnt + " , 삭제, 삽입 : " + isComplete);
		
		request.setAttribute("like", like);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
