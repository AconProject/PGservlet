package com.controller.board;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

import com.dto.BoardDTO;
import com.dto.NewsDTO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.service.BoardService;
import com.service.NewsService;

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
	    response.setContentType("text/html;charset=utf-8");
		String infoCategory = request.getParameter("infoCategory");
		BoardService boardService = new BoardService();
	    Gson gson = new GsonBuilder().create();
	    JSONArray jsonList = new JSONArray();  
		List<BoardDTO> qnaList = null;
		
		if (infoCategory == null || infoCategory == "recommend") {
			qnaList = boardService.recommendInfoBoardSelect();
		} else {
			qnaList = boardService.hitInfoBoardSelect();
		}
		PrintWriter out = response.getWriter();
		for (BoardDTO dto : qnaList) {
			jsonList.add(gson.toJson(dto));
		}
	    out.println(jsonList);
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
