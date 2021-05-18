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
	
	public List<GameDTO> recommendGameListSelect(SqlSession session, int limit) {
		List<GameDTO> list = session.selectList("GameMapper.recommendGameListSelect", limit);
		return list;
	}
	
	public List<GameDTO> tagGameListSelect(SqlSession session) {
		List<GameDTO> list = session.selectList("GameMapper.tagGameListSelect");
		return list;
	}

	public GameDTO detailGameSelect(SqlSession session, String gameNo) {
		GameDTO dto = 
				   session.selectOne("GameMapper.detailGameSelect", gameNo);
		   return dto;
	}
	
	public List<GameDTO> recommendUserTagListSelect(SqlSession session, String mbrId) {
		List<GameDTO> list = session.selectList("GameMapper.recommendUserTagListSelect", mbrId);
		return list;
	}
	
	public List<GameDTO> tagGameListSelect(SqlSession session, List<String> listTags) {
		List<GameDTO> list = session.selectList("GameMapper.tagGameListSelect", listTags);
		return list;
	}

}
