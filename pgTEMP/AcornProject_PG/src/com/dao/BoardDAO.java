package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.BoardDTO;
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
	
	public List<NewsDTO> newsSelect(SqlSession session) {
		return session.selectList("BoardMapper.newsSelect");
	}
}
