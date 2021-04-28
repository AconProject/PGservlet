package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.BoardDTO;

public class BoardDAO {
	public List<BoardDTO> recommendInfoBoardSelect(SqlSession session) {
		return session.selectList("BoardMapper.recommendInfoBoardSelect.");
	}
	
	public List<BoardDTO> hitInfoBoardSelect(SqlSession session) {
		return session.selectList("BoardMapper.hitInfoBoardSelect");
	}
}
