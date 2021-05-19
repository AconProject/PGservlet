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

	// 댓글 입력 && like 추가 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO) session.getAttribute("login");

		ReviewService rService = new ReviewService();
		String nextPage = null;

		if (dto != null) {
			int reviewId = Integer.parseInt(request.getParameter("reviewId"));
			String mbrId = request.getParameter("mbrId");
			String gameNo = request.getParameter("gameNo");
			String reviewContent = request.getParameter("reviewContent");
			int reviewLiked = Integer.parseInt(request.getParameter("reviewLiked"));
			Double reviewScore = Double.parseDouble(request.getParameter("reviewScore"));
			String reviewDate = "";

			ReviewDTO rdto = new ReviewDTO(reviewId, mbrId, gameNo, reviewContent, reviewLiked, reviewScore,
					reviewDate);

			
			//댓글 삽입
			int reviewResult = rService.reviewInsert(rdto);

			////////like 테이블에 삽입: reviewId 
			int likeNo = 0; //추천번호 
			int boardId = 0; //게시글 ID 
			int replyId = 0; //게시판 댓글ID

			
			//likeNo: like테이블 들어갈 시, 순서 && mbrId: 원글작성자 ID && reviewId: 해당 댓글에 대한  순서 
			LikeDTO ldto = new LikeDTO(likeNo, mbrId, boardId, reviewId, replyId);
			LikeService lService = new LikeService();

			// 댓글에 대한 좋아요를 위해 삽입 
			int likedReviewInsert = lService.likeReviewInsert(ldto); 
			int cnt = lService.likeReviewCount(ldto); //여기부터 내일
			if (cnt == 1) { //이미 있는 경우
				reviewLike += rService.reviewLikeMinus(replyId) * -1;
				isComplete = lService.likeReviewDelete(ldto);
			} else { //없는 경우
				reviewLike += rService.reviewLikePlus(replyId);
				isComplete = lService.likeReviewInsert(ldto);
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
