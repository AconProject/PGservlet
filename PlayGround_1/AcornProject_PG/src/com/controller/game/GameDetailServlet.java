package com.controller.game;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.GameDTO;
import com.service.GameService;


@WebServlet("/GameDetailServlet")
public class GameDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public GameDetailServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gameNo=request.getParameter("gameNo");
		GameService service= new GameService();
		GameDTO dto = service.detailGameSelect(gameNo);
		request.setAttribute("detailGame", dto);
		System.out.println("DTO: "+ dto.toString());
		RequestDispatcher dis = request.getRequestDispatcher("detailPage.jsp");
		dis.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
