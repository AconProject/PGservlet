package com.controller.board;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String boardKind = request.getParameter("boardKind");
		if (boardKind.contains("List")) {
			List<BoardDTO> list = null;
			String nextPage = "";
			if (boardKind.contentEquals("boardList")) {
				list = service.boardSelect();
				nextPage = ""; // 미정
			} else if (boardKind.contentEquals("boardCategoryList")) {
				String boardCategory = request.getParameter("boardCategory");
				list = service.boardCategorySelect(boardCategory);
				nextPage = ""; // 미정
			} else if (boardKind.contentEquals("boardSearchList")) {
				String searchWord = request.getParameter("searchWord");
				list = service.boardSearchSelect(searchWord);
				nextPage = ""; // 미정
			}
			request.setAttribute("list", list);
			RequestDispatcher dis = request.getRequestDispatcher(nextPage);
		} else if (boardKind.contains("recommend")) {
			int n;
			if (boardKind.contentEquals("boardRecommendPlus")) {
				n = service.boardRecommendPlus();
			} else {
				n = service.boardRecommendMinus();
			}
			request.setAttribute("recommend", n);
			RequestDispatcher dis = request.getRequestDispatcher(""); // board 페이지 중 하나
		} else {
			int n;
			int board = Integer.parseInt(request.getParameter("boardId"));
			String mbrId = request.getParameter("mbrId");
			String boardCategory = request.getParameter("boardCategory");
			String boardContent = request.getParameter("boardContent");
			String boardRecommend = request.getParameter("boardRecommend");
			String boardCount = request.getParameter("boardCount");
			long miliSeconds = System.currentTimeMillis();
			Date boardDate = new Date(miliSeconds);
			BoardDTO dto = new BoardDTO(board, mbrId, boardCategory, boardContent, boardRecommend
					, boardCount, boardDate);
			if (boardKind.contentEquals("boardInsert")) {
				n = service.boardInsert(dto);
			} else if (boardKind.contentEquals("boardUpdate")) {
				n = service.boardUpdate(dto);
			} else {
				n = service.boardDelete(dto);
			}
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
