package com.controller.review;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ReviewDAO;
import com.dto.ReviewDTO;
import com.service.ReviewService;

/**
 * Servlet implementation class reviewUpdateformServlet
 */
@WebServlet("/reviewUpdateformServlet")
public class reviewUpdateformServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String reviewId = request.getParameter("reviewId");
		System.out.println("updatefomr-reviewId: " + reviewId);
		
		ReviewService rservice = new ReviewService();
		ReviewDTO reviewDTO = rservice.updatebtn(Integer.parseInt(reviewId));
		System.out.println("reviewDTO(UPDATEBTN): " + reviewDTO);
		int id = reviewDTO.getReviewId();
		String content = reviewDTO.getReviewContent();
		
		request.setAttribute("review", reviewDTO);
		request.setAttribute("content", content);
		response.sendRedirect("Game/reviewUpdateForm.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
