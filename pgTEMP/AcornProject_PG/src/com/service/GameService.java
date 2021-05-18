package com.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.GameDAO;
import com.dto.GameDTO;

public class GameService {
	
	public List<GameDTO> newGameListSelect() {
		List<GameDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			GameDAO dao = new GameDAO();
			list = dao.newGameListSelect(session);
		} catch(Exception e) {
			e.printStackTrace();
		} finally { 
			session.close();
		}
		return list;
	}
	
	public List<GameDTO> recommendGameListSelect(int limit) {
		List<GameDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			GameDAO dao = new GameDAO();
			list = dao.recommendGameListSelect(session, limit);
		} catch(Exception e) {
			e.printStackTrace();
		} finally { 
			session.close();
		}
		return list;
	}
	
	public List<GameDTO> tagGameListSelect(List<String> listTags) {
		List<GameDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			GameDAO dao = new GameDAO();
			list = dao.tagGameListSelect(session);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	public GameDTO detailGameSelect(String gameNo) {
		SqlSession session = MySqlSessionFactory.getSession();
		GameDTO dto = null;
		try {
			 GameDAO dao = new GameDAO();
			 dto = dao.detailGameSelect(session, gameNo);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return dto;
	}//end idCheck
	
	public List<GameDTO> recommendUserTagListSelect(String mbrId) {
		List<GameDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			GameDAO dao = new GameDAO();
			list = dao.recommendUserTagListSelect(session, mbrId);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
}
