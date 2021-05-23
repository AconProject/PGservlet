package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.BoardDTO;
import com.dto.GameDTO;
import com.dto.NewsDTO;

public class BoardDAO {
	public List<BoardDTO> recommendInfoBoardSelect(SqlSession session) {
		return session.selectList("BoardMapper.recommendInfoBoardSelect");
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
	
	public int boardInsert(SqlSession session, BoardDTO dto) {
		return session.insert("BoardMapper.boardInsert", dto);
	}
	
	public int boardUpdate(SqlSession session, BoardDTO dto) {
		return session.update("BoardMapper.boardUpdate", dto);
	}
	
	public int boardDelete(SqlSession session, int boardId) {
		return session.delete("BoardMapper.boardDelete", boardId);
	}
	
	public int boardLikePlus(SqlSession session, String boardId) {
		return session.update("BoardMapper.boardLikePlus", boardId);
	}
	
	public int boardLikeMinus(SqlSession session, String boardId) {
		return session.update("BoardMapper.boardLikeMinus", boardId);
	}
	
	public BoardDTO boardDetailSelect(SqlSession session, String boardId) {
		return session.selectOne("BoardMapper.boardDetailSelect", boardId);
	}
}
