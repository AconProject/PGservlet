package com.controller.board;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

import com.dto.BoardDTO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.service.BoardService;

/**
 * 게시판 리스트와 검색 조건에 따른 리스트를 처리하는 서블릿입니다.
 */
@WebServlet("/BoardListServlet")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardService service = new BoardService();
		String boardKind = request.getParameter("boardKind");
		String boardCategory = request.getParameter("boardCategory");
		Gson gson = new GsonBuilder().create();
		JSONArray jsonList = new JSONArray();
		List<BoardDTO> list = null;
		if (boardKind.contentEquals("boardList")) {
			list = service.boardSelect(boardCategory);
		} else if (boardKind.contentEquals("boardSearchList")) {
			String searchWord = request.getParameter("searchWord");
			String searchCategory = request.getParameter("searchCategory");
			HashMap <String, String> searchMap = new HashMap<String, String>();
			System.out.println(boardKind + "\t" + boardCategory + "\t" + searchWord + "\t" + searchCategory);
			if (searchWord == null)
				searchWord = "%";
			searchMap.put("searchWord", searchWord);
			searchMap.put("searchCategory", searchCategory);
			searchMap.put("boardCategory", boardCategory);
			for (String s : searchMap.keySet())
				System.out.println(s + "\t" + searchMap.get(s));
			list = service.boardSearchSelect(searchMap);
		}
		System.out.println("list" + list);
		PrintWriter out = response.getWriter();
		for (BoardDTO dto : list) {
			jsonList.add(gson.toJson(dto));
		}
		out.println(jsonList);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
