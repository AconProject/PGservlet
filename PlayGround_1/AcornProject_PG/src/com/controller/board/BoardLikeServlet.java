package com.controller.board;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		BoardService bService = new BoardService();
		LikeService lService = new LikeService();
		HttpSession session = request.getSession();
		HashMap<String, String> ids = new HashMap<>();
		MemberDTO login = (MemberDTO)session.getAttribute("login");
		String boardId = request.getParameter("boardId");
		int boardLike = Integer.parseInt(request.getParameter("boardLike"));
		int cnt = 0;
		boolean isComplete = false;
		System.out.println("현재 좋아요 개수 : " + boardLike);
		ids.put("boardId", boardId);
		ids.put("mbrId", login.getMbrId());
		cnt = lService.likeBoardCount(ids);
		if (cnt >= 1) {
			boardLike += bService.boardLikeMinus(Integer.parseInt(boardId)) * -1;
			isComplete = lService.likeBoardDelete(ids);
		} else {
			boardLike += bService.boardLikePlus(Integer.parseInt(boardId));
			isComplete = lService.likeBoardInsert(ids);
		}
		System.out.println("좋아요 : " + boardLike + " , boardLiked 개수 : " + cnt + " , 삭제, 삽입 : " + isComplete);
		
		request.setAttribute("boardLike", boardLike);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
