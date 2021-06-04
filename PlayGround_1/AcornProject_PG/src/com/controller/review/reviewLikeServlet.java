package com.controller.review;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

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
		MemberDTO login = (MemberDTO) session.getAttribute("login");
		System.out.println("로그인되어있는 회원정보: " + login);

		// 상세페이지에서 넘어온 데이터 파싱 (gameNo, reviewId)
		String gameNo = request.getParameter("gameNo");
		String reviewId = request.getParameter("reviewId");
		System.out.println("likeservlet 도착!!");
		System.out.println("gameNo: " + gameNo + " reviewId: " + reviewId);
		
		ReviewService rService = new ReviewService();

		// 좋아요 누르기 (+1)
		int plus = rService.reviewLikePlus(Integer.parseInt(reviewId));
		System.out.println("좋아요 플러스: " + plus);

		// 좋아요 수 불러오기
		int reviewliked = rService.reviewLikeSelect(Integer.parseInt(reviewId));
		System.out.println("좋아요 수: " + reviewliked);
		
	} // end doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
