package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.ReplyDTO;

public class ReplyDAO {
	public int replyLikeMinus(SqlSession session, String replyId) {
		return session.update("ReplyMapper.replyLikeMinus", replyId);
	}
	
	public int replyLikePlus(SqlSession session, String replyId) {
		return session.update("ReplyMapper.replyLikeMinus", replyId);
	}

	public List<ReplyDTO> replyListSelect(SqlSession session, String boardId) {
		return session.selectList("ReplyMapper.replyListSelect", boardId);
	}
}
