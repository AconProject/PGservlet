package com.controller.review;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.GameDTO;
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

	// 댓글 삽입 기능
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		MemberDTO login = (MemberDTO) session.getAttribute("login");
		System.out.println("로그인상태 회원정보(insert): "+ login);
		
		ReviewService rService = new ReviewService();
		String nextPage = null;

		if (login != null) {
			
//		int reviewId = Integer.parseInt(request.getParameter("reviewId"));
			String mbrId = request.getParameter("mbrId");
			String mbrName=request.getParameter("mbrName");
			String gameNo = request.getParameter("gameNo");
			String reviewContent = request.getParameter("reviewContent");
			int reviewLiked = 0;
			Double reviewScore = Double.parseDouble(request.getParameter("reviewScore"));
			String reviewDate = request.getParameter("reviewDate");

			ReviewDTO xx = new ReviewDTO();
			xx.setMbrId(login.getMbrId());
			xx.setMbrName(login.getMbrName());
			xx.setGameNo(gameNo);
			xx.setReviewContent(reviewContent);
			xx.setReviewLiked(reviewLiked);
			xx.setReviewScore(reviewScore);
			xx.setReviewDate(reviewDate);
			
			System.out.println("작성한 review: " + xx);
			
			// 댓글 삽입
			int reviewResult = rService.reviewInsert(xx);
			System.out.println("댓글삽입 성공: " + reviewResult);
			
			/*
			 * //////// like 테이블에 삽입: reviewId int likeNo = 0; // 추천 int boardId = 0; //
			 * 게번호시글 ID int replyId = 0; // 게시판 댓글ID
			 * 
			 * // likeNo: like테이블 들어갈 시, 순서 && mbrId: 원글작성자 ID && reviewId: 해당 댓글에 대한 순서 //
			 * LikeDTO ldto = new LikeDTO(likeNo, login.getMbrId(), boardId, reviewId,
			 * replyId); // LikeService lService = new LikeService();
			 * 
			 * // 댓글에 대한 좋아요를 위해 삽입 int reviewLike = 0; int isComplete = 0; int
			 * likedReviewInsert = lService.likeReviewInsert(ldto); // int cnt =
			 * lService.likeReviewCount(ldto); // 여기부터 내일 // if (cnt == 0) { // 없는 경우:
			 * review 좋아요 +1 & like 보드에 삽입 // reviewLike =
			 * rService.reviewLikePlus(reviewId); // review 댓글 +1 // isComplete =
			 * lService.likeReviewInsert(ldto); //
			 * 
			 * // } else { // 있는 경우: review 좋아요 -1 && like 보드에서 삭제. // reviewLike =
			 * rService.reviewLikeMinus(reviewId); // review 댓글 -1 // isComplete =
			 * lService.likeReviewDelete(ldto); // // }
			 * 
			 * System.out.println("reviewLike: " + reviewLike + "\t" + "isComplete: " +
			 * isComplete + "\t" + "likedReviewInsert: " + likedReviewInsert);
			 */
			nextPage = "GameDetailServlet?gameNo="+gameNo;
			
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
