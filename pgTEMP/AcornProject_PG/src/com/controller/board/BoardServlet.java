package com.controller.board;

import java.io.IOException;
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
			if (boardKind.contentEquals("boardRecommendPlus")) {
				int n = service.boardRecommendPlus();
			} else {
				int n = service.boardRecommendMinus();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
