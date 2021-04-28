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
		String boardCategory = request.getParameter("boardCategory");
		BoardService service = new BoardService();
		List<BoardDTO> list = null;
		
		if (boardCategory == null || boardCategory == "recommend") {
			list = service.recommendInfoBoardSelect();
		} else {
			list = service.hitInfoBoardSelect();
		}
		
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
