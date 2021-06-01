package com.controller.review;

import java.io.IOException;
import java.util.HashMap;
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
