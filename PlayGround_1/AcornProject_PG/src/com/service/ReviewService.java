package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.GameDAO;
import com.dao.MemberDAO;
import com.dao.ReplyDAO;
import com.dao.ReviewDAO;
import com.dto.GameDTO;
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


	/////// 댓글 삽입////////
	public int reviewInsert(ReviewDTO rdto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int result;
		try {
			result = dao.reviewInsert(session, rdto);
			session.commit();
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

	////// 댓글 삭제///////
	public int reviewDelete(int reviewId) {
		SqlSession session = MySqlSessionFactory.getSession();
		int result;
		try {
			result = dao.reviewDelete(session, reviewId);
			session.commit();
		} finally {
			session.close();
		}
		return result;
	}

/////////////////////////////////////// 0520
	////// 댓글 좋아요 +1///////
	public int reviewLikePlus(int reviewId) {
		int result = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			ReviewDAO dao = new ReviewDAO();
			result = dao.reviewLikePlus(session, reviewId);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;
	}

	////// 댓글 좋아요 -1///////
	public int reviewLikeMinus(int reviewId) {
		int result = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			ReviewDAO dao = new ReviewDAO();
			result = dao.reviewLikeMinus(session, reviewId);
			session.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;
	}
///////////////////////////////////

	// 증가된 좋아요 가져오기
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

	public int selectreviewId(HashMap<String, Object> map) {
		SqlSession session = MySqlSessionFactory.getSession();
		int result;
		try {
			result = dao.selectreviewId(session, map);
		} finally {
			session.close();
		}
		return result;
	}

	// 중복된 닉네임 찾기
	public int nameCheck(HashMap<String, String> map) {
		SqlSession session = MySqlSessionFactory.getSession();
		int count = 0;
		try {
			ReviewDAO dao = new ReviewDAO();
			count = dao.nameCheck(session, map);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return count;
	}

	// 댓글 수정버튼 클릭시 reviewId로 댓글 찾기
	public ReviewDTO updatebtn(int reviewId) {
		SqlSession session = MySqlSessionFactory.getSession();
		ReviewDTO dto = null;
		try {
			ReviewDAO dao = new ReviewDAO();
			dto = dao.updatebtn(session, reviewId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return dto;
	}


}
