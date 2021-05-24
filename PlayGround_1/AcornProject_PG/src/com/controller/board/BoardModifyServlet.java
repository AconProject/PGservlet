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
		doAction(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAction(request, response);
	}
	
	private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8"); 
		BoardService service = new BoardService();
		HttpSession session = request.getSession();
		String boardKind = request.getParameter("boardKind");
		boolean isComplete = false;
		String mesg = "";
		MemberDTO login= (MemberDTO) session.getAttribute("login");
		System.out.println(login);
		int boardId = Integer.parseInt(request.getParameter("boardId"));
		String boardName = request.getParameter("boardName");
		String boardCategory = request.getParameter("boardCategory");
		String boardContent = request.getParameter("boardContent");
		int boardLiked = 0;
		int boardCount = 0;
		long miliSeconds = System.currentTimeMillis();
		Date boardDate = new Date(miliSeconds);
		String nextPage = "";
		BoardDTO dto = new BoardDTO(boardId, login.getMbrId(), login.getMbrName(), boardName, boardCategory, boardContent, boardLiked
				, boardCount, boardDate);
		System.out.println(dto);
		if (login != null) {
			if (login.getMbrId().contentEquals(login.getMbrId()) && boardKind.contentEquals("boardInsert")) {
				boardId = service.getBoardId();
				dto.setBoardId(boardId);
				isComplete = service.boardInsert(dto);
			} else if (login.getMbrId().contentEquals(login.getMbrId()) && boardKind.contentEquals("boardUpdate")) {
				isComplete = service.boardUpdate(dto);
			} else if (login.getMbrId().contentEquals(login.getMbrId()) && boardKind.contentEquals("boardDelete")){
				isComplete = service.boardDelete(boardId);
			}
		}
		if (isComplete) {
			if (boardKind.contentEquals("boardInsert")) {
				mesg = "해당 게시글을 추가하였습니다.";
				nextPage = "BoardDetailServlet?boardId=" + boardId;
			}
			else if (boardKind.contentEquals("boardUpdate")) {
				mesg = "해당 게시글을 수정하였습니다.";
				nextPage = "BoardDetailServlet?boardId=" + boardId;
			}
			else {
				mesg = "해당 게시글을 삭제하였습니다.";
				nextPage = "boardList.jsp";
			}
		} 
		if (!isComplete){
			if (login != null)
				mesg = "로그인 필요합니다.";
			else
				mesg = "해당 게시물에 대한 처리를 수행하지 못했습니다.";
		}
		System.out.println(isComplete + "\t " + mesg);
		System.out.println(nextPage);
		request.setAttribute("mesg", mesg);
		RequestDispatcher dis = request.getRequestDispatcher(nextPage);
	     dis.forward(request, response);
	}
}
