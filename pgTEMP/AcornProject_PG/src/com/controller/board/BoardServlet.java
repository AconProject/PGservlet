package com.controller.board;

import java.io.IOException;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.BoardDTO;
import com.service.BoardService;

/**
 * Servlet implementation class BoardServlet
 */
@WebServlet("/BoardServlet")
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardService service = new BoardService();
		HttpSession session = request.getSession();
		String boardKind = request.getParameter("boardKind");
		if (boardKind.contains("List")) {
			List<BoardDTO> list = null;
			String nextPage = "";
			if (boardKind.contentEquals("boardList")) {
				String boardCategory = request.getParameter("boardCategory");
				list = service.boardSelect(boardCategory);
				nextPage = ""; // 미정
			} else if (boardKind.contentEquals("boardSearchList")) {
				String boardCategory = request.getParameter("boardCategory");
				String searchWord = request.getParameter("searchWord");
				String searchCategory = request.getParameter("searchCategory");
				HashMap <String, String> searchMap = new HashMap<String, String>();
				if (searchWord == null)
					searchWord = "%";
				searchMap.put("searchWord", searchWord);
				searchMap.put("searchCategory", searchCategory);
				searchMap.put("boardCategory", boardCategory);
				list = service.boardSearchSelect(searchMap);
				nextPage = ""; // 미정
			}
			request.setAttribute("list", list);
			RequestDispatcher dis = request.getRequestDispatcher(nextPage);
		} else if (boardKind.contains("recommend")) {
			int n;
			if (boardKind.contentEquals("boardRecommendPlus")) {
				n = service.boardLikePlus();
			} else {
				n = service.boardLikeMinus();
			}
			request.setAttribute("recommend", n);
			RequestDispatcher dis = request.getRequestDispatcher(""); // board 페이지 중 하나
		} else {
			int n;
			String sess_mbrId = (String) session.getAttribute("sess_mbrId");
			int boardId = Integer.parseInt(request.getParameter("boardId"));
			String mbrId = request.getParameter("mbrId");
			String boardCategory = request.getParameter("boardCategory");
			String boardContent = request.getParameter("boardContent");
			String boardLiked = request.getParameter("boardLiked");
			String boardCount = request.getParameter("boardCount");
			long miliSeconds = System.currentTimeMillis();
			Date boardDate = new Date(miliSeconds);
			BoardDTO dto = new BoardDTO(boardId, mbrId, boardCategory, boardContent, boardLiked
					, boardCount, boardDate);
			if (sess_mbrId.contentEquals(mbrId) && boardKind.contentEquals("boardInsert")) {
				n = service.boardInsert(dto);
			} else if (sess_mbrId.contentEquals(mbrId) && boardKind.contentEquals("boardUpdate")) {
				n = service.boardUpdate(dto);
			} else if (sess_mbrId.contentEquals(mbrId) && boardKind.contentEquals("boardDelete")){
				n = service.boardDelete(boardId);
			}
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
