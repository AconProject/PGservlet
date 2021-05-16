package com.controller.game;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.dto.GameDTO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
	    response.setContentType("text/html;charset=utf-8");
		List<GameDTO> gameList = null;
		String tag = request.getParameter("tags"); //세션으로 바꿔야할 지 모르겠음.
		String[] tags = tag.split(",");
		List<Double> rate = new ArrayList<Double>();
		GameService gameService = new GameService();
		RateService rateService = new RateService();
		Gson gson = new GsonBuilder().create();
	    JSONArray jsonList = new JSONArray();
	    
		if (tags == null) {
			gameList = gameService.recommendGameListSelect(6);
			rate = rateService.rateRecommendSelect();
		} else {
			ArrayList<String> listTags = new ArrayList<String>(Arrays.asList(tags));

			gameList = gameService.tagGameListSelect(listTags);
			rate = rateService.rateTagSelect(listTags);
		}

		PrintWriter out = response.getWriter();
		int limit = gameList.size();
		System.out.println(rate + "\t" + gameList);
	      for (int i = 0; i < limit; i++ ) {
	    	  JSONObject json = new JSONObject();
	    	  json.put("rate" + Integer.toString(i), rate.get(i));
	    	  jsonList.add(gson.toJson(gameList.get(i)));
	    	  jsonList.add(json);
	      }
	      out.println(jsonList);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
