package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.LikeDAO;
import com.dto.LikeDTO;

public class LikeService {
	public int likeBoardCount(HashMap<String, String> ids) {
		SqlSession session = MySqlSessionFactory.getSession();
		int cnt = 0;
		try {
			LikeDAO dao = new LikeDAO();
			cnt = dao.likeBoardCount(session, ids);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}
	
	public boolean likeBoardInsert(HashMap<String, String> ids) {
		SqlSession session = MySqlSessionFactory.getSession();
		int cnt = 0;
		try {
			LikeDAO dao = new LikeDAO();
			cnt = dao.likeBoardInsert(session, ids);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return cnt == 1 ? true : false;
	}
	
	public boolean likeBoardDelete(HashMap<String, String> ids) {
		SqlSession session = MySqlSessionFactory.getSession();
		int cnt = 0;
		try {
			LikeDAO dao = new LikeDAO();
			cnt = dao.likeBoardDelete(session, ids);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return cnt == 1 ? true : false;
	}
	
	public boolean likeReplyDelete(HashMap<String, String> ids) {
		SqlSession session = MySqlSessionFactory.getSession();
		int cnt = 0;
		try {
			LikeDAO dao = new LikeDAO();
			cnt = dao.likeReplyDelete(session, ids);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return cnt == 1 ? true : false;
	}
	
	public boolean likeReplyInsert(HashMap<String, String> ids) {
		SqlSession session = MySqlSessionFactory.getSession();
		int cnt = 0;
		try {
			LikeDAO dao = new LikeDAO();
			cnt = dao.likeReplyInsert(session, ids);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return cnt == 1 ? true : false;
	}
	///////////////////////////


	public int likeReviewInsert(LikeDTO ldto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int likeReview = 0;
		try {
			LikeDAO dao = new LikeDAO();
			likeReview = dao.likeReviewInsert(session, ldto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return likeReview ;
	}
	//////
	public int likeReviewCount(LikeDTO ldto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int result = 0;
		try {
			LikeDAO dao = new LikeDAO();
			result = dao.likeReviewCount(session, ldto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;
	}
	
	
	
}
