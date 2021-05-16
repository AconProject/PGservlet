package com.controller.game;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.dto.GameDTO;
import com.dto.MemberDTO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.service.GameService;

/**
 * Servlet implementation class GameListServlet
 * 
 */
@WebServlet("/GameListServlet")
public class GameListServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GameListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      response.setContentType("text/html;charset=utf-8");
      String gameCategory = request.getParameter("gameCategory");
      HttpSession session = request.getSession();
      MemberDTO mDto = (MemberDTO)session.getAttribute("login");
      List<GameDTO> gameList = null;
      GameService service = new GameService();
      Gson gson = new GsonBuilder().create();
      JSONArray jsonList = new JSONArray();
      
      if (gameCategory == null || gameCategory.contentEquals("new")) {   
          gameList = service.newGameListSelect();
      } else if (mDto == null && gameCategory.contentEquals("recommend")) {
         gameList = service.recommendGameListSelect();
      } else if (mDto != null && gameCategory.contentEquals("recommend")) {
         gameList = service.recommendUserTagListSelect(mDto.getMbrId());
      }
      
      PrintWriter out = response.getWriter();
      for (GameDTO dto : gameList) {
    	  jsonList.add(gson.toJson(dto));
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