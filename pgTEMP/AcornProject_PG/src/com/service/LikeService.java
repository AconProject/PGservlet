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
	
	
	// 현수님 LikeService
	public int likeInsert(LikeDTO ldto) {
		// Liked 테이블에 집어넣기
		SqlSession session = MySqlSessionFactory.getSession();
		int result;
		try {
			LikeDAO dao = new LikeDAO();
			result = dao.likeInsert(session, ldto);
		} finally {
			session.close();
		}
		return result;
	}

	public List<LikeDTO> reviewLikeCheck(int reviewId) {

		SqlSession session = MySqlSessionFactory.getSession();
		List<LikeDTO>  list = null;
		try {
			LikeDAO dao = new LikeDAO();
			list = dao.reviewLikeCheck(session,reviewId);
		} finally {
			session.close();
		}
		return list;

	}
}