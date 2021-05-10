package com.controller.game;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.GameDTO;
import com.service.GameService;
import com.service.RateService;

/**
 * Servlet implementation class GameTagListServlet
 */
@WebServlet("/GameTagListServlet")
public class GameTagListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GameTagListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<GameDTO> gameList = null;
		String[] tags = request.getParameterValues("tags"); //세션으로 바꿔야할 지 모르겠음.
		ArrayList<String> listTags = new ArrayList<String>(Arrays.asList(tags));
		List<Double> rate = new ArrayList<Double>();
		GameService gameService = new GameService();
		RateService rateService = new RateService();
		
		if (tags == null) {
			gameList = gameService.recommendGameListSelect();
			rate = rateService.rateRecommendSelect();
		} else {
			gameList = gameService.tagGameListSelect(listTags);
			rate = rateService.rateTagSelect(listTags);
		}
		request.setAttribute("rate", rate);
		request.setAttribute("gameList", gameList);
		//jsp 경로 추가해야함 
		RequestDispatcher dis = request.getRequestDispatcher("???");
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
