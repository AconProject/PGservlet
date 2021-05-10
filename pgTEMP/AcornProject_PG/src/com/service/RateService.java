package com.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.RateDAO;
import com.dto.RateDTO;

public class RateService {
	public List<RateDTO> rateRecommendSelect() {
		SqlSession session = MySqlSessionFactory.getSession();
		List<RateDTO> rate = null;
		try {
			RateDAO dao = new RateDAO();
			rate = dao.rateRecommendSelect(session);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return rate;
	}
	
	public List<RateDTO> rateTagSelect(ArrayList<String> listTags) {
		SqlSession session = MySqlSessionFactory.getSession();
		List<RateDTO> rate = null;
		try {
			RateDAO dao = new RateDAO();
			rate = dao.rateTagSelect(session, listTags);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return rate;
	}
}
