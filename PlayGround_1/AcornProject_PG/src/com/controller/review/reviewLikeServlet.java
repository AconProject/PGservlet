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
		
		
		//추가되었을시,
		//1.reviewId와  mbrId를  사용해서, 체크 (reviewId(몇번째 게임 댓글 ID)가 작성한 댓글의 좋아요를 mbrId로 증가)
		//.jsp에서 해당 댓글(reviewID)에 대한 좋아요를 가져옴 (getParameter(reviewLiked--? 아직 불확실))
		//2.이후, 클릭시 reviewId에 
		

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

		if (reviewAdd == 1) {
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
