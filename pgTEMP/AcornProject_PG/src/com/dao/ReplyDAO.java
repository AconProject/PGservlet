package com.dao;

import org.apache.ibatis.session.SqlSession;

public class ReplyDAO {
	public int replyLikeMinus(SqlSession session, String replyId) {
		return session.update("ReplyMapper.replyLikeMinus", replyId);
	}
	
	public int replyLikePlus(SqlSession session, String replyId) {
		return session.update("ReplyMapper.replyLikeMinus", replyId);
	}
}
