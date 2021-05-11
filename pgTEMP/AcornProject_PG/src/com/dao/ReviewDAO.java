package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.GameDTO;
import com.dto.ReviewDTO;

public class ReviewDAO {

	public List<ReviewDTO> reviewSelect(SqlSession session, String gameNo) {
		List<ReviewDTO> list = session.selectList("ReviewMapper.reviewSelect", gameNo);
		return list;
	}

}
