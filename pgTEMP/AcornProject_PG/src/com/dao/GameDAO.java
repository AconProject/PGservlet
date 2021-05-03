package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.GameDTO;

public class GameDAO {
	public List<GameDTO> newGameListSelect(SqlSession session) {
		List<GameDTO> list = session.selectList("GameMapper.newGameListSelect");
		return list;
	}
	
	public List<GameDTO> recommendGameListSelect(SqlSession session) {
		List<GameDTO> list = session.selectList("GameMapper.recommendGameListSelect");
		return list;
	}
	
	public List<GameDTO> tagGameListSelect(SqlSession session, List<String> gameTags) {
		List<GameDTO> list = session.selectList("GameMapper.tagGameListSelect", gameTags);
		return list;
	}
}
