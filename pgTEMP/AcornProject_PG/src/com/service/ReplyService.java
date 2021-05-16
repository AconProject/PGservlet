package com.service;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.ReplyDAO;
import com.dto.ReplyDTO;

public class ReplyService {

	public int replyLikePlus(String replyId) {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			ReplyDAO dao = new ReplyDAO();
			n = dao.replyLikePlus(session, replyId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return n;
	}
	
	public int replyLikeMinus(String replyId) {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			ReplyDAO dao = new ReplyDAO();
			n = dao.replyLikeMinus(session, replyId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return n;
	}
	
	public List<ReplyDTO> replyListSelect(String boardId) {
		List<ReplyDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			ReplyDAO dao = new ReplyDAO();
			list = dao.replyListSelect(session, boardId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
}
