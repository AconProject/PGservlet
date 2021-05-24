package com.service;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.ReplyDAO;
import com.dto.ReplyDTO;

public class ReplyService {

	public int replyLikePlus(int replyId) {
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
	
	public int replyLikeMinus(int replyId) {
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
	
	public List<ReplyDTO> replyListSelect(int boardId) {
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
	
	public boolean replyInsert(ReplyDTO dto) {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			ReplyDAO dao = new ReplyDAO();
			n = dao.replyInsert(session, dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
		return n == 1 ? true : false;
	}
	
	public boolean replyUpdate(ReplyDTO dto) {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			ReplyDAO dao = new ReplyDAO();
			n = dao.replyUpdate(session, dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
		return n == 1 ? true : false;
	}
	
	public boolean replyDelete(int replyId) {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			ReplyDAO dao = new ReplyDAO();
			n = dao.replyDelete(session, replyId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
		return n == 1 ? true : false;
	}
}
