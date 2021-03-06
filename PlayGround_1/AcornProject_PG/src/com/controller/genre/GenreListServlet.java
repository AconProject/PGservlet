
package com.controller.genre;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.dto.GenreDTO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.service.GenreService;

/**
 * Servlet implementation class TagListServlet
 */

@WebServlet("/GenreListServlet")
public class GenreListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	public GenreListServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		GenreService service = new GenreService();
		Gson gson = new GsonBuilder().create();
		JSONArray jsonList = new JSONArray();
		List<GenreDTO> tags = service.genreSelect();
		System.out.println("tags: " + tags);

		PrintWriter out = response.getWriter();
		for (GenreDTO tag : tags) {
			jsonList.add(gson.toJson(tag));
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
