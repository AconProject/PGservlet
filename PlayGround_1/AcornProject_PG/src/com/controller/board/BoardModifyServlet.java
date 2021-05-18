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
 * 게시물 추가, 게시물 삭제, 게시물 수정을 담당하는 서블릿입니다.
 */
@WebServlet("/BoardModifyServlet")
public class BoardModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardModifyServlet() {
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
		boolean isComplete = false;
		String mesg = "";
		MemberDTO login= (MemberDTO) session.getAttribute("login");
		String bId = request.getParameter("boardId");
		int boardId = 0;
		if (bId != null)
			boardId = Integer.parseInt(bId);
		String boardCategory = request.getParameter("boardCategory");
		String boardContent = request.getParameter("boardContent");
		int boardLiked = 0;
		int boardCount = 0;
		long miliSeconds = System.currentTimeMillis();
		Date boardDate = new Date(miliSeconds);
		BoardDTO dto = new BoardDTO(boardId, login.getMbrId(), login.getMbrName(),boardCategory, boardContent, boardLiked
				, boardCount, boardDate);
		if (login != null) {
			if (login.getMbrId().contentEquals(login.getMbrId()) && boardKind.contentEquals("boardInsert")) {
				isComplete = service.boardInsert(dto);
			} else if (login.getMbrId().contentEquals(login.getMbrId()) && boardKind.contentEquals("boardUpdate")) {
				isComplete = service.boardUpdate(dto);
			} else if (login.getMbrId().contentEquals(login.getMbrId()) && boardKind.contentEquals("boardDelete")){
				isComplete = service.boardDelete(boardId);
			}
		}
		if (isComplete) {
			if (boardKind.contentEquals("boardInsert"))
				mesg = "해당 게시글을 추가하였습니다.";
			else if (boardKind.contentEquals("boardUpdate"))
				mesg = "해당 게시글을 수정하였습니다.";
			else
				mesg = "해당 게시글을 삭제하였습니다.";
		} 
		if (!isComplete){
			if (login != null)
				mesg = "로그인 필요합니다.";
			else
				mesg = "해당 게시물에 대한 처리를 수행하지 못했습니다.";
		}
		request.setAttribute("mesg", mesg);
		RequestDispatcher dis = request.getRequestDispatcher("boardPage.jsp");
	     dis.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
