package com.controller.game;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.GameDTO;
import com.dto.RateDTO;
import com.dto.ReviewDTO;
import com.service.GameService;
import com.service.RateService;
import com.service.ReviewService;

@WebServlet("/GameDetailServlet")
public class GameDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GameDetailServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1.상단. (게임정보) → detailGame (완료)
		System.out.println("1: 상단: 게임 관련 정보 & 게임 평점");
		String gameNo = request.getParameter("gameNo");
		System.out.println("1-1:게임정보");
		GameService gService = new GameService();
		GameDTO gdto = gService.detailGameSelect(gameNo);
		System.out.println("게임정보: " + gdto.toString());

		System.out.println("1-2:게임점수");
		RateService rateService = new RateService();
		RateDTO rateDTO = rateService.getGameScore(gameNo);
		System.out.println("게임점수: " + rateDTO.toString());
		
		request.setAttribute("detailGame", gdto); // 게임하나에 대한 게임 정보
		request.setAttribute("gameScore", rateDTO); // 게임 하나에 대한 점수 정보

		// 2. 중단. (리뷰) →reviewList (완료)
		System.out.println("2: 중단: 게임 댓글 ");
		ReviewService rservice = new ReviewService();
		List<ReviewDTO> rdto = rservice.reviewSelect(gameNo);
		System.out.println("댓글: " + rdto.toString());
		request.setAttribute("reviewList", rdto);


		// 3. 하단. (관련 게임) → relateGame
		// String gameNo=request.getParameter("gameNo");
		// GameDTO gdto = gservice.detailGameSelect(gameNo);
		System.out.println("3: 하단: 관련 게임 ");
		String gameCategory = gdto.getGameCategory(); // 해당 게임 타이틀 정보의 gameCategory()를 가져옴
		List<GameDTO> relatedGameList = gService.relatedGameList(gameCategory); // 해당 게임 카테고리를 가진 다른 게임 리스트 도출
		System.out.println("관련 게임 리스트: " + relatedGameList.toString());
		request.setAttribute("relateGame", relatedGameList); // 해당 값을 relateGame에 저장

		RequestDispatcher dis = request.getRequestDispatcher("Game/detailPage.jsp");
		dis.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
