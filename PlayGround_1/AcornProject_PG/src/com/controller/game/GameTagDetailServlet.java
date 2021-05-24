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
import com.service.GameService;

@WebServlet("/GameTagDetailServlet")
public class GameTagDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public GameTagDetailServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String gameCategory = request.getParameter("gameCategory");
		GameService service = new GameService();
		List<GameDTO> list = service.tagDetailSelect(gameCategory);
		request.setAttribute("gameList", list);
		RequestDispatcher dis = request.getRequestDispatcher("tagDetail.jsp");
		dis.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
		
}
