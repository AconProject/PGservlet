package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.BoardDAO;
import com.dto.BoardDTO;

public class BoardService {
	public List<BoardDTO> recommendInfoBoardSelect() {
		List<BoardDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			BoardDAO dao = new BoardDAO();
			list = dao.recommendInfoBoardSelect(session);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	public List<BoardDTO> hitInfoBoardSelect() {
		List<BoardDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			BoardDAO dao = new BoardDAO();
			list = dao.hitInfoBoardSelect(session);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
	
	public List<BoardDTO> recommendQnaBoardSelect() {
		List<BoardDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			BoardDAO dao = new BoardDAO();
			list = dao.recommendQnaBoardSelect(session);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
	
	public List<BoardDTO> hitQnaBoardSelect() {
		List<BoardDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			BoardDAO dao = new BoardDAO();
			list = dao.hitQnaBoardSelect(session);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
	
	public List<BoardDTO> boardSelect() {
		List<BoardDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			BoardDAO dao = new BoardDAO();
			list = dao.boardSelect(session);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	public List<BoardDTO> boardSearchSelect(HashMap<String, String> searchMap) {
		List<BoardDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			BoardDAO dao = new BoardDAO();
			if (searchMap.get("searchCategory").contentEquals("title")) {
				list = dao.boardTitleSearchSelect(session, searchMap);
			} else {
				list = dao.boardContentSearchSelect(session, searchMap);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
	
	public boolean boardInsert(BoardDTO dto) {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			BoardDAO dao = new BoardDAO();
			n = dao.boardInsert(session, dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
		return n == 1 ? true : false;
	}
	
	public boolean boardUpdate(BoardDTO dto) {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			BoardDAO dao = new BoardDAO();
			n = dao.boardUpdate(session, dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
		return n == 1 ? true : false;
	}
	
	public boolean boardDelete(int boardId) {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			BoardDAO dao = new BoardDAO();
			n = dao.boardDelete(session, boardId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
		return n == 1 ? true : false;
	}
	
	public int boardLikePlus(int boardId) {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			BoardDAO dao = new BoardDAO();
			n = dao.boardLikePlus(session, boardId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return n;
	}
	
	public int boardLikeMinus(int boardId) {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			BoardDAO dao = new BoardDAO();
			n = dao.boardLikeMinus(session, boardId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return n;
	}
	
	public BoardDTO boardDetailSelect(int boardId) {
		BoardDTO dto = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			BoardDAO dao = new BoardDAO();
			dto = dao.boardDetailSelect(session, boardId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return dto;
	}
	
	public int getBoardId() {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			BoardDAO dao = new BoardDAO();
			n = dao.getBoardId(session);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return n;
	}
}
