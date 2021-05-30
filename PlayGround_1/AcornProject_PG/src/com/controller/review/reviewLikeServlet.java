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

		ReviewService rService = new ReviewService();
		String nextPage = null;

		if (login != null) {

			String gameNo = request.getParameter("gameNo");

			ReviewDTO xx = new ReviewDTO();
			xx.setMbrName(login.getMbrName());
			xx.setGameNo(gameNo);

			// reviewId
			System.out.println(xx.getMbrName() + "\t" + xx.getGameNo());
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("mbrName", xx.getMbrName());
			map.put("gameNo", Integer.parseInt(gameNo));
			int reviewId = rService.selectreviewId(map);
			System.out.println("reviewId 찾았다: " + reviewId);

			////////////////////////////////////////////////////////////////////////
			//////// like 테이블에 삽입: reviewId
			int likeNo = 0; // 추천
			int boardId = 0; // 게번호시글 ID
			int replyId = 0; // 게시판 댓글ID

			// likeNo: like테이블 들어갈 시, 순서 && mbrId: 원글작성자 ID && reviewId: 해당 댓글에 대한 순서
			LikeDTO ldto = new LikeDTO(likeNo, login.getMbrId(), boardId, reviewId, replyId);
			LikeService lService = new LikeService();

			// 댓글에 대한 좋아요를 위해 삽입
			int reviewLike = 0;
			int isComplete = 0;
			int cnt = 0;
			
			try {
				//기존에 좋아요 했는지 확인하기
				cnt = lService.likeReviewCount(ldto);

			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("좋아요가 있는지 확인:" + cnt);

			if (cnt == 0) { // 없는 경우: review 좋아요 +1 & like 보드에 삽입
				System.out.println("좋아요가 없어서 +1 했습니다. ");
				//review +1
				reviewLike = rService.reviewLikePlus(reviewId); // review 댓글 +1
				System.out.println("reviewLike: " + reviewLike);
				//like테이블에  내용 추가
				isComplete = lService.likeReviewInsert(ldto);
				System.out.println("isComplete: " + isComplete);

			} else { // 있는 경우: review 좋아요 -1 && like 보드에서 삭제.
				System.out.println("좋아요가 있어서, -1했습니다");
				reviewLike = rService.reviewLikeMinus(reviewId); // review 댓글 -1
				System.out.println("reviewLike: " + reviewLike);
				isComplete = lService.likeReviewDelete(ldto); //
				System.out.println("isComplete: " + isComplete);
			}
			
			//증가된 좋아요 가져오기
			int reviewLikedSelect = rService.reviewLikeSelect(reviewId);
			PrintWriter out = response.getWriter();
			out.print(reviewLikedSelect);
			out.flush();

		} else {
			nextPage = "LoginServlet";
			session.setAttribute("mesg", "로그인이 필요한 작업입니다.");
		}

	} // end doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
