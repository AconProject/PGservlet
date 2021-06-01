package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.LikeDAO;
import com.dto.LikeDTO;

public class LikeService {
	public int likeBoardCount(LikeDTO like) {
		SqlSession session = MySqlSessionFactory.getSession();
		int cnt = 0;
		try {
			LikeDAO dao = new LikeDAO();
			cnt = dao.likeBoardCount(session, like);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}
	
	public boolean likeBoardInsert(LikeDTO like) {
		SqlSession session = MySqlSessionFactory.getSession();
		int cnt = 0;
		try {
			LikeDAO dao = new LikeDAO();
			cnt = dao.likeBoardInsert(session, like);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return cnt == 1 ? true : false;
	}
	
	public boolean likeBoardDelete(LikeDTO like) {
		SqlSession session = MySqlSessionFactory.getSession();
		int cnt = 0;
		try {
			LikeDAO dao = new LikeDAO();
			cnt = dao.likeBoardDelete(session, like);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return cnt == 1 ? true : false;
	}
	
	public int likeReplyCount(LikeDTO like) {
		SqlSession session = MySqlSessionFactory.getSession();
		int cnt = 0;
		try {
			LikeDAO dao = new LikeDAO();
			cnt = dao.likeBoardCount(session, like);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}
	
	public boolean likeReplyDelete(LikeDTO like) {
		SqlSession session = MySqlSessionFactory.getSession();
		int cnt = 0;
		try {
			LikeDAO dao = new LikeDAO();
			cnt = dao.likeReplyDelete(session, like);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return cnt == 1 ? true : false;
	}
	
	public boolean likeReplyInsert(LikeDTO like) {
		SqlSession session = MySqlSessionFactory.getSession();
		int cnt = 0;
		try {
			LikeDAO dao = new LikeDAO();
			cnt = dao.likeReplyInsert(session, like);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return cnt == 1 ? true : false;
	}
/////////Review(게임 댓글 부분)//////////////////

//like 테이블 +1
	public int likeReviewInsert(LikeDTO ldto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int likeReview = 0;
		try {
			LikeDAO dao = new LikeDAO();
			likeReview = dao.likeReviewInsert(session, ldto);
			session.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return likeReview ;
	}
//like 테이블 -1	
	public int likeReviewDelete(LikeDTO ldto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int likeReview = 0;
		try {
			LikeDAO dao = new LikeDAO();
			likeReview = dao.likeReviewDelete(session, ldto);
			session.commit();

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
