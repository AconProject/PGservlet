package com.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.dto.LikeDTO;

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
	
	/////게임 댓글에 대한  좋아요 삽입 가능
	public int likeReviewInsert(SqlSession session, LikeDTO ldto) {
		return session.insert("LikeMapper.likeReviewInsert",ldto); 
	}

	public int likeReviewCount(SqlSession session, LikeDTO ldto) {
		return session.selectOne("LikeMapper.likeReviewCount", ldto);
	}
	
}
