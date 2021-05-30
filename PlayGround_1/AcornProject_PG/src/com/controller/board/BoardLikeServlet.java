package com.controller.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.LikeDTO;
import com.dto.MemberDTO;
import com.service.BoardService;
import com.service.LikeService;

/**
 * Servlet implementation class BoardServlet
 */
@WebServlet("/BoardLikeServlet")
public class BoardLikeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardLikeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		BoardService bService = new BoardService();
		LikeService lService = new LikeService();
		HttpSession session = request.getSession();
		MemberDTO login = (MemberDTO)session.getAttribute("login");
		int boardId = Integer.parseInt(request.getParameter("boardId"));
		int boardLike = Integer.parseInt(request.getParameter("boardLike"));
		int cnt = 0;
		boolean isComplete = false;
		LikeDTO like = new LikeDTO(0, login.getMbrId(), boardId, 0, 0);
		System.out.println("현재 좋아요 개수 : " + boardLike);
		cnt = lService.likeBoardCount(like);
		if (cnt >= 1) {
			boardLike += bService.boardLikeMinus(boardId) * -1;
			isComplete = lService.likeBoardDelete(like);
		} else {
			boardLike += bService.boardLikePlus(boardId);
			isComplete = lService.likeBoardInsert(like);
		}
		System.out.println("좋아요 : " + boardLike + " , boardLiked 개수 : " + cnt + " , 삭제, 삽입 : " + isComplete);
		
		request.setAttribute("boardLike", boardLike);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
