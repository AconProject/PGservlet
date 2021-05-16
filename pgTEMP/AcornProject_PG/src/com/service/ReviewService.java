package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.GameDAO;
import com.dao.ReviewDAO;
import com.dto.GameDTO;
import com.dto.PageDTO;
import com.dto.ReviewDTO;

public class ReviewService {

	ReviewDAO dao;

	public List<ReviewDTO> reviewSelect(String gameNo) {
		List<ReviewDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {

			list = dao.reviewSelect(session, gameNo);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	///////////////////////////////////

	public ReviewService() {
		dao = new ReviewDAO();
	}

	public List<ReviewDTO> selectAllReview() {
		SqlSession session = MySqlSessionFactory.getSession();
		List<ReviewDTO> list = null;
		try {
			list = dao.selectAllReview(session);
		} finally {
			session.close();
		}
		return list;
	}

	public PageDTO selectAllPage(int curPage) {
		SqlSession session = MySqlSessionFactory.getSession();
		PageDTO pDTO = null;
		try {
			pDTO = dao.selectAllPage(session, curPage);
		} finally {
			session.close();
		}
		return pDTO;
	}

	/////// 댓글 삽입////////
	public int reviewInsert(ReviewDTO rdto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int result;
		try {
			result = dao.reviewInsert(session, rdto);
		} finally {
			session.close();
		}
		return result;
	}
	


	////// 댓글 수정///////
	public int reviewUpdate(ReviewDTO rdto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int result;
		try {
			result = dao.reviewUpdate(session, rdto);
		} finally {
			session.close();
		}
		return result;
	}
	
	
	//////댓글 삭제///////	
	public int reviewDelete(int reviewId) {
		SqlSession session = MySqlSessionFactory.getSession();
		int result;
		try {
			result = dao.reviewDelete(session, reviewId);
		} finally {
			session.close();
		}
		return result;
	}
	//좋아요 눌렀을때 +1
	public int reviewLikeUpdate(int reviewId) {
		SqlSession session = MySqlSessionFactory.getSession();
		int result;
		try {
			result = dao.reviewLikeUpdate(session, reviewId);
		} finally {
			session.close();
		}
		return result;
		
	}
	//증가된 좋아요 가져오기
	public int reviewLikeSelect(int reviewId) {
		SqlSession session = MySqlSessionFactory.getSession();
		int result;
		try {
			result = dao.reviewLikeSelect(session, reviewId);
		} finally {
			session.close();
		}
		return result;
	}



}
