package com.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

public class LikeDAO {
	
	public int likeBoardCount(SqlSession session, HashMap<String, String> ids) {
		return session.selectOne("LikeMapper.likeBoardCount", ids);
	}
	
	public int likeBoardInsert(SqlSession session, HashMap<String, String> ids) {
		return session.insert("LikeMapper.likeBoardInsert", ids);
	}
	
	public int likeBoardDelete(SqlSession session, HashMap<String, String> ids) {
		return session.delete("LikeMapper.likeBoardDelete", ids);
	}
	
	public int likeReplyDelete(SqlSession session, HashMap<String, String> ids) {
		return session.delete("LikeMapper.likeReplyDelete", ids);
	}
	
	public int likeReplyInsert(SqlSession session, HashMap<String, String> ids) {
		return session.insert("LikeMapper.likeReplyInsert", ids);
	}
}
