package com.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.dto.LikeDTO;

public class LikeDAO {
	
	public int likeBoardCount(SqlSession session, LikeDTO like) {
		return session.selectOne("LikeMapper.likeBoardCount", like);
	}
	
	public int likeBoardInsert(SqlSession session, LikeDTO like) {
		return session.insert("LikeMapper.likeBoardInsert", like);
	}
	
	public int likeBoardDelete(SqlSession session, LikeDTO like) {
		return session.delete("LikeMapper.likeBoardDelete", like);
	}
	
	public int likeReplyDelete(SqlSession session, LikeDTO like) {
		return session.delete("LikeMapper.likeReplyDelete", like);
	}
	
	public int likeReplyInsert(SqlSession session, LikeDTO like) {
		return session.insert("LikeMapper.likeReplyInsert", like);
	}
	
	/////게임 댓글에 대한  좋아요 삽입 가능
	public int likeReviewInsert(SqlSession session, LikeDTO ldto) {
		return session.insert("LikeMapper.likeReviewInsert",ldto); 
	}
	/////게임 댓글에 대한  좋아요 삭제 가능
	public int likeReviewDelete(SqlSession session, LikeDTO ldto) {
		return session.delete("LikeMapper.likeReviewDelete",ldto); 
	}

	public int likeReviewCount(SqlSession session, HashMap<String, String> map) {
		return session.selectOne("LikeMapper.likeReviewCount", map);
	}
	
	public int likeReplyCount(SqlSession session, LikeDTO like) {
		return session.selectOne("LikeMapper.likeReplyCount", like);
	}
}
