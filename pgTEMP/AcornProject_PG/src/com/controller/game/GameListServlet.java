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

import com.dto.GameDTO;
import com.dto.MemberDTO;
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
      
      if (gameCategory == null || gameCategory == "new") {
          gameList = service.newGameListSelect();
      } else if (mDto == null && gameCategory == "recommend") {
         gameList = service.recommendGameListSelect();
      } else if (mDto != null && gameCategory == "recommend") {
         gameList = service.recommendUserTagListSelect(mDto.getMbrId());
      }
      PrintWriter out = response.getWriter();
      for (GameDTO dto : gameList) {
         out.println(dto);
      }

//      request.setAttribute("gameList", gameList);
//      RequestDispatcher dis = request.getRequestDispatcher("Main.jsp");
//      dis.forward(request, response);
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doGet(request, response);
   }

}