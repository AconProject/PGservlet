package com.service;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;

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
}
