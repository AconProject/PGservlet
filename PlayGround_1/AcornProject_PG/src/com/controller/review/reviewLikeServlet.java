package com.controller.review;

import java.io.IOException;
import java.io.PrintWriter;

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

		// likeNo: like테이블 들어갈 시, 순서 && mbrId: 원글작성자 ID && reviewId: 해당 댓글에 대한 순서
		LikeDTO xx = new LikeDTO();
		xx.setMbrId(login.getMbrId());
		xx.setReviewId(Integer.parseInt(reviewId));
		LikeService lService = new LikeService();

		// 좋아요 누르기 (+1)
		int plus = rService.reviewLikePlus(Integer.parseInt(reviewId));
		System.out.println("좋아요 플러스: " + plus);

		ReviewDTO rdto = rService.updatebtn(Integer.parseInt(reviewId));
		System.out.println("찾기: " + rdto);
		int liked = rdto.getReviewLiked();
		System.out.println("증가된 좋아요 수 : " + rdto);
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(liked);

	} // end doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
