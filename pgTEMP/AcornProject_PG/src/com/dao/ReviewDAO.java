package com.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.GameDTO;
import com.dto.PageDTO;
import com.dto.ReviewDTO;

public class ReviewDAO {

	public List<ReviewDTO> reviewSelect(SqlSession session, String gameNo) {
		List<ReviewDTO> list = session.selectList("ReviewMapper.reviewSelect", gameNo);
		return list;
	}
	
	
	///////////////////////////////////////////////////////////////////////////////
	// 전체 레코드 갯수 구하는 sql
	private int totalCount(SqlSession session) {
		return session.selectOne("com.dto.totalCount");
	}

	public PageDTO selectAllPage(SqlSession session, int curPage) {
		
		PageDTO pDTO = new PageDTO();
		int perPage = 4;
		int offset = (curPage - 1)*perPage;
		
		List<ReviewDTO> list = session.selectList("com.dto.selectAll", null, new RowBounds(offset, perPage));
		pDTO.setPerPage(perPage);
		pDTO.setCurPage(curPage); // 현재페이지 저장
		pDTO.setList(list);
		pDTO.setTotalCount(totalCount(session));
		return pDTO;
	}
	
	public List<ReviewDTO> selectAllReview(SqlSession session) {
		List<ReviewDTO> list = session.selectList("selectAll");
		return list;
	}

//////////////////댓글 삽입 부붑
	public int reviewInsert(SqlSession session,ReviewDTO rdto) {
		int result= session.insert("ReviewMapper.reviewInsert",rdto);
		return result;
	}

//////////////////댓글 수정 부붑
	public int reviewUpdate(SqlSession session, ReviewDTO rdto) {
		int result= session.update("ReviewMapper.reviewUpdate",rdto);
		return result;
	}
//////////////////댓글 삭제 부붑
	public int reviewDelete(SqlSession session,int reviewId) {
		int result= session.delete("ReviewMapper.reviewDelete",reviewId);
		return result;
	}


	public int reviewLikeUpdate(SqlSession session, int reviewId) {
		int result= session.update("ReviewMapper.reviewLikeUpdate",reviewId);
		return result;
	}


	public int reviewLikeSelect(SqlSession session, int reviewId) {
		int result= session.selectOne("ReviewMapper.reviewLikeSelect",reviewId);
		return result;
	}




	
	
}
