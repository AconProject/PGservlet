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
import com.dto.NewsDTO;
import com.service.BoardService;

/**
 * Servlet implementation class BoardListMainServlet
 */
@WebServlet("/BoardListMainServlet")
public class BoardListMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BoardListMainServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gameInfoCategory = request.getParameter("gameInfoCategory");
		String qnaCategory = request.getParameter("qnaCategory");
		BoardService boardService = new BoardService();
		
		List<NewsDTO> newsList = null;
		List<BoardDTO> gameInfoList = null;
		List<BoardDTO> qnaList = null;
		
		if (gameInfoCategory == null || gameInfoCategory == "recommend") {
			gameInfoList = boardService.recommendInfoBoardSelect();
		} else {
			gameInfoList = boardService.hitInfoBoardSelect();
		}
		if (qnaCategory == null || qnaCategory == "recommend") {
			qnaList = boardService.recommendQnaBoardSelect();
		} else {
			qnaList = boardService.hitQnaBoardSelect();
		}
		newsList = boardService.newsSelect();
		
		request.setAttribute("newsList", newsList);
		request.setAttribute("qnaList", qnaList);
		request.setAttribute("gameInfoList", gameInfoList);
		RequestDispatcher dis = request.getRequestDispatcher("???.jsp");
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
