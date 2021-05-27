package com.controller.board;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

import com.dto.BoardDTO;
import com.dto.ReplyDTO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.service.BoardService;
import com.service.ReplyService;

/**
 * Servlet implementation class BoardDetailServlet
 */
@WebServlet("/BoardDetailServlet")
public class BoardDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html;charset=utf-8");
		int boardId = Integer.parseInt(request.getParameter("boardId"));
		BoardService bService = new BoardService();
		ReplyService rService = new ReplyService();
		String mesg = request.getParameter("mesg");
	    Gson gson = new GsonBuilder().create();
		JSONArray jsonList = new JSONArray();
		
		System.out.println("boardID : " + boardId);
		BoardDTO dto = bService.boardDetailSelect(boardId);
		List<ReplyDTO> replyList = rService.replyListSelect(boardId);
		System.out.println("게시판 상세 페이지 :" + dto);
		PrintWriter out = response.getWriter();
		jsonList.add(gson.toJson(dto));
		for (ReplyDTO reply : replyList) {
			jsonList.add(gson.toJson(reply));
		}
		out.println(jsonList);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
