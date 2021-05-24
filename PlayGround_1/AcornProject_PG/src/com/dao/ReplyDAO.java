package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.ReplyDTO;

public class ReplyDAO {
	public int replyLikeMinus(SqlSession session, int replyId) {
		return session.update("ReplyMapper.replyLikeMinus", replyId);
	}
	
	public int replyLikePlus(SqlSession session, int replyId) {
		return session.update("ReplyMapper.replyLikeMinus", replyId);
	}

	public List<ReplyDTO> replyListSelect(SqlSession session, int boardId) {
		return session.selectList("ReplyMapper.replyListSelect", boardId);
	}
	
	public int replyInsert(SqlSession session, ReplyDTO dto) {
		return session.insert("ReplyMapper.replyInsert", dto);
	}
	
	public int replyUpdate(SqlSession session, ReplyDTO dto) {
		return session.update("ReplyMapper.replyUpdate", dto);
	}
	
	public int replyDelete(SqlSession session, int replyId) {
		return session.delete("ReplyMapper.replyDelete", replyId);
	}
}
