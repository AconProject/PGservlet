package com.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.GameDTO;
import com.dto.ReviewDTO;

public class ReviewDAO {

	public List<ReviewDTO> reviewSelect(SqlSession session, String gameNo) {
		List<ReviewDTO> list = session.selectList("ReviewMapper.reviewSelect", gameNo);
		return list;
	}

	///////////////////////////////////////////////////////////////////////////////


	public List<ReviewDTO> selectAllReview(SqlSession session) {
		List<ReviewDTO> list = session.selectList("ReviewMapper.selectAll");
		return list;
	}

//////////////////댓글 삽입 부분
	public int reviewInsert(SqlSession session, ReviewDTO rdto) {
		int result = session.insert("ReviewMapper.reviewInsert", rdto);
		return result;
	}

//////////////////댓글 수정 부분
	public int reviewUpdate(SqlSession session, ReviewDTO rdto) {
		int result = session.update("ReviewMapper.reviewUpdate", rdto);
		return result;
	}

//////////////////댓글 삭제 부분
	public int reviewDelete(SqlSession session, int reviewId) {
		int result = session.delete("ReviewMapper.reviewDelete", reviewId);
		return result;
	}

////////////////
	public int reviewLikePlus(SqlSession session, int reviewId) {
		int result = session.update("ReviewMapper.reviewLikePlus", reviewId);
		return result;
	}

	public int reviewLikeMinus(SqlSession session, int reviewId) {
		int result = session.update("ReviewMapper.reviewLikeMinus", reviewId);
		return result;
	}
////////////////

	public int reviewLikeSelect(SqlSession session, int reviewId) {
		int result = session.selectOne("ReviewMapper.reviewLikeSelect", reviewId);
		return result;
	}

}
