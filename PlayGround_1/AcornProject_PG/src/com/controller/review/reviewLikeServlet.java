package com.controller.review;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.LikeDTO;
import com.dto.MemberDTO;
import com.service.LikeService;
import com.service.ReviewService;

@WebServlet("/reviewLikeServlet")
public class reviewLikeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public reviewLikeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

//댓글에 대해 좋아요 눌렀을때 기능 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO) session.getAttribute("login");

		ReviewService rService = new ReviewService();
		LikeService lService = new LikeService();
		String nextPage = null;

		if (dto != null) {

			int reviewId = Integer.parseInt(request.getParameter("reviewId"));

			String mbrId = request.getParameter("mbrId"); // 좋아요 누른 사람 ID (혹은 nickname)
			// 댓글에 대한 좋아요를 위해 삽입
			int likeNo = 0; // 추천번호
			int boardId = 0; // 게시글 ID
			int replyId = 0; // 게시판 댓글ID
			LikeDTO ldto = new LikeDTO(likeNo, mbrId, boardId, reviewId, replyId);
			////

			int reviewLike = 0;
			int isComplete = 0;
			int likedReviewInsert = lService.likeReviewInsert(ldto);
			int cnt = lService.likeReviewCount(ldto); // 여기부터 내일

			if (cnt == 0) { // 없는 경우: review 좋아요 +1 & like 보드에 삽입
				reviewLike = rService.reviewLikePlus(reviewId); // review 댓글 +1
				isComplete = lService.likeReviewInsert(ldto); //

			} else { // 있는 경우: review 좋아요 -1 && like 보드에서 삭제.
				reviewLike = rService.reviewLikeMinus(reviewId); // review 댓글 -1
				isComplete = lService.likeReviewDelete(ldto); //
			}

			System.out.println("reviewLike: " + reviewLike + "\t" + "isComplete: " + isComplete + "\t"
					+ "likedReviewInsert: " + likedReviewInsert);
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
