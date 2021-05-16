package com.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.RateDAO;

public class RateService {
	public List<Double> rateRecommendSelect() {
		SqlSession session = MySqlSessionFactory.getSession();
		List<Double> rate = null;
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
	
	public List<Double> rateTagSelect(List<String> listTags) {
		SqlSession session = MySqlSessionFactory.getSession();
		List<Double> rate = null;
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
