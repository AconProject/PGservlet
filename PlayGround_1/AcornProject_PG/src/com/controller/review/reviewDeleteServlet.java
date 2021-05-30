package com.controller.review;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.dto.ReviewDTO;
import com.service.ReviewService;

@WebServlet("/reviewDeleteServlet")
public class reviewDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public reviewDeleteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	//댓글 삭제 기능
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		ReviewService rservice = new ReviewService();
		String nextPage = null;

		if (dto != null) {
			String reviewId = request.getParameter("reviewId");
			String gameNo = request.getParameter("gameNo");
			System.out.println("gameno: " + gameNo);
			int result = rservice.reviewDelete(Integer.parseInt(reviewId));
			if (result == 1) {
				System.out.println("Update 성공");
			} else {
				System.out.println("Update 실패");
			}
			nextPage = "GameDetailServlet?gameNo="+gameNo;

		} else {
			nextPage = "LoginServlet";
			session.setAttribute("mesg", "로그인이 필요한 작업입니다.");
		}

		response.sendRedirect(nextPage);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
