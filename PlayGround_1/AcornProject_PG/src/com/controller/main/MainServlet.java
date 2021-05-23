package com.controller.main;

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



@WebServlet("/main")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MainServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GameService service = new GameService();
		List<GameDTO> topList = service.newGameListSelect(); //상단:기본 최신게임
		request.setAttribute("gameList1", topList); //상단:최신 게임에서 나온 게임 리스트
		
		List<GameDTO> middleList = service.tagGameListSelect(null); //중단: 기본장르 액션
		request.setAttribute("gameList2", middleList); //중단:기본 장르에서 나온 게임 리스트
		
		
		RequestDispatcher dis = request.getRequestDispatcher("Main.jsp");
		dis.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
