
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
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		List<GameDTO> gameList = null;
		String tag = request.getParameter("tags");
		System.out.println(tag);
		List<Double> rate = new ArrayList<Double>();
		GameService gameService = new GameService();
		RateService rateService = new RateService();
		Gson gson = new GsonBuilder().create();
		JSONArray jsonList = new JSONArray();

		if (tag == null) {
			gameList = gameService.recommendGameListSelect(6);
			rate = rateService.rateRecommendSelect();
		} else {
			String[] tags = tag.split(",");
			for (String t : tags) {
				System.out.println(t);
			}
			List<String> listTags = new ArrayList<String>(Arrays.asList(tags));

			gameList = gameService.tagGameListSelect(listTags);
			rate = rateService.rateTagSelect(listTags);
		}

		PrintWriter out = response.getWriter();
		int limit = gameList.size();
		System.out.println(rate + "\t" + gameList);
		for (int i = 0; i < limit; i++) {
			JSONObject json = new JSONObject();
			json.put("rate" + Integer.toString(i), rate.get(i));
			jsonList.add(gson.toJson(gameList.get(i)));
			jsonList.add(json);
		}
		out.println(jsonList);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
