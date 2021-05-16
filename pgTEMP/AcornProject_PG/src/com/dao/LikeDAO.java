package com.dao;

import java.util.HashMap;
import java.util.List;

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
	
	// 현수님 LikeDAO
	public int likeInsert(SqlSession session, LikeDTO ldto) {
		int result = session.insert("LikeMapper.likeInsert", ldto);
		return result;

	}

	public List<LikeDTO>  reviewLikeCheck(SqlSession session, int reviewId) {
		List<LikeDTO> list = session.selectList("LikeMapper.reviewLikeCheck",reviewId);
		return list;
	}
}
