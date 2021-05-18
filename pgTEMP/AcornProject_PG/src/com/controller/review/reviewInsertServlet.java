package com.controller.review;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.LikeDTO;
import com.dto.MemberDTO;
import com.dto.ReviewDTO;
import com.service.LikeService;
import com.service.ReviewService;

@WebServlet("/reviewInsertServlet")
public class reviewInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public reviewInsertServlet() {
		super();
	}

	// 댓글 입력하기
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO) session.getAttribute("login");

		ReviewService rservice = new ReviewService();
		String nextPage = null;

		if (dto != null) {
			int reviewId = 0;
			String mbrId = request.getParameter("mbrId");
			String gameNo = request.getParameter("gameNo");
			String reviewContent = request.getParameter("reviewContent");
			int reviewLiked = Integer.parseInt(request.getParameter("reviewLiked"));
			Double reviewScore = Double.parseDouble(request.getParameter("reviewScore"));
			String reviewDate = "";

			ReviewDTO rdto = new ReviewDTO(reviewId, mbrId, gameNo, reviewContent, reviewLiked, reviewScore,
					reviewDate);

			int reviewResult = rservice.reviewInsert(rdto);

			///////////////////////
			int likeNo = 0;
			int boardId = 0;
			int replyId = 0;

			LikeDTO ldto = new LikeDTO(likeNo, mbrId, boardId, reviewId+1, replyId);
			LikeService lservice = new LikeService();

			int likedResult = lservice.likeInsert(ldto);

			if (reviewResult == 1 && likedResult == 1) {
				System.out.println("삽입 성공");
			} else {
				System.out.println("삽입 실패");
			}

			nextPage = "GameDetailServlet";
		} else {
			nextPage = "LoginServlet";
			session.setAttribute("mesg", "로그인이 필요한 작업입니다.");
		}
		response.sendRedirect(nextPage);
	} // end doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
