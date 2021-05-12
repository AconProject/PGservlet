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
import com.dto.MemberDTO;
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
		List<BoardDTO> list = null;
		if (boardKind.contentEquals("boardList")) {
			String boardCategory = request.getParameter("boardCategory");
			list = service.boardSelect(boardCategory);
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
		}
		request.setAttribute("list", list);
		RequestDispatcher dis = request.getRequestDispatcher("boardList");
		dis.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
