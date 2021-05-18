package com.controller.review;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.PageDTO;
import com.service.ReviewService;



@WebServlet("/ReviewListServlet")
public class ReviewListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String curPage = request.getParameter("curPage"); // 현재 페이지 번호 얻기
		if(curPage == null) curPage="1";
		
		ReviewService service = new ReviewService();
		
		PageDTO pDTO = service.selectAllPage(Integer.parseInt(curPage));
		System.out.println("pDTO : " + pDTO);
		System.out.println(pDTO.getPerPage());
		
		request.setAttribute("pDTO", pDTO);
		
		RequestDispatcher dis = request.getRequestDispatcher("detailPage.jsp");
		dis.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
