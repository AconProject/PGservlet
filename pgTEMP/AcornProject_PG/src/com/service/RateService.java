package com.service;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.RateDAO;

public class RateService {
	public double rateRecommendSelect() {
		SqlSession session = MySqlSessionFactory.getSession();
		double rate = 0.0;
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
	
	public double rateTagSelect() {
		SqlSession session = MySqlSessionFactory.getSession();
		double rate = 0.0;
		try {
			RateDAO dao = new RateDAO();
			rate = dao.rateTagSelect(session);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return rate;
	}
}
