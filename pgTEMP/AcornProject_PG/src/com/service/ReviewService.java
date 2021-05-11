package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.GameDAO;
import com.dao.ReviewDAO;
import com.dto.GameDTO;
import com.dto.ReviewDTO;

public class ReviewService {

	public List<ReviewDTO> reviewSelect(String gameNo) {
		List<ReviewDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			ReviewDAO dao = new ReviewDAO();
			list = dao.reviewSelect(session,gameNo);
		} catch(Exception e) {
			e.printStackTrace();
		} finally { 
			session.close();
		}
		return list;
	}



}
