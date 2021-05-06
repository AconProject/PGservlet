package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.BoardDTO;
import com.dto.GameDTO;
import com.dto.NewsDTO;

public class BoardDAO {
	public List<BoardDTO> recommendInfoBoardSelect(SqlSession session) {
		return session.selectList("BoardMapper.recommendInfoBoardSelect.");
	}
	
	public List<BoardDTO> hitInfoBoardSelect(SqlSession session) {
		return session.selectList("BoardMapper.hitInfoBoardSelect");
	}
	
	public List<BoardDTO> recommendQnaBoardSelect(SqlSession session) {
		return session.selectList("BoardMapper.recommendQnaBoardSelect");
	}
	
	public List<BoardDTO> hitQnaBoardSelect(SqlSession session) {
		return session.selectList("BoardMapper.hitQnaBoardSelect");
	}
	
	public List<BoardDTO> boardSelect(SqlSession session, String boardCategory) {
		return session.selectList("BoardMapper.boardSelect", boardCategory);
	}
	
	public List<BoardDTO> boardTitleSearchSelect(SqlSession session, HashMap<String, String> searchMap) {
		return session.selectList("BoardMapper.boardTitleSearchSelect", searchMap);
	}
	
	public List<BoardDTO> boardContentSearchSelect(SqlSession session, HashMap<String, String> searchMap) {
		return session.selectList("BoardMapper.boardContentSearchSelect", searchMap);
	}
	
}
