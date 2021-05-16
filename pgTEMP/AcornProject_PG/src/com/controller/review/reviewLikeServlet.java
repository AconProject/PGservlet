package com.controller.review;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.LikeDTO;
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
		ReviewService rservice = new ReviewService();
		LikeService lservice = new LikeService();
		int reviewId = Integer.parseInt(request.getParameter("reviewId"));
		String mbrId = request.getParameter("mbrId"); // 좋아요 누른 사람 ID (혹은 nickname)
		int reviewAdd = 0;

		// 증가되기전 좋아요 확인
		int before_reviewLike = Integer.parseInt(request.getParameter("reviewLike"));

		// 이미 좋아요한 사람 확인 (List로 받음)
		List<LikeDTO> list = lservice.reviewLikeCheck(reviewId);
		
		if (list.contains(mbrId)) { // 좋아요를 누른 사람들 list에  나의 mbrId가 있는경우 (이미 좋아요 한경우 -1)
			reviewAdd = rservice.reviewLikeUpdate(reviewId); // 1 0
			System.out.println("좋아요 성공여부: " + reviewAdd);
		} else { // 좋아요를 누른 사람들 list에  나의 mbrId가 없는경우 -> 좋아요 안한 경우 +1
			// 좋아요 증가
			reviewAdd = rservice.reviewLikeUpdate(reviewId); // 1 0
			System.out.println("좋아요 성공여부: " + reviewAdd);
		}

		// 증가된 좋아요 가져오기
		int after_reviewLike = rservice.reviewLikeSelect(reviewId);
		System.out.println("review Like 개수: " + after_reviewLike);

		if (reviewAdd == 1 && (before_reviewLike != after_reviewLike)) {
			PrintWriter out = response.getWriter();
			out.print(after_reviewLike);
		} else {
			PrintWriter out = response.getWriter();
			out.print("좋아요 에러");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
