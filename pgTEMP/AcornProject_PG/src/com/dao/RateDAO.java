package com.dao;

import org.apache.ibatis.session.SqlSession;

public class RateDAO {
	public double rateRecommendSelect(SqlSession session) {
		return session.selectOne("RateMapper.rateRecommendSelect");
	}
	
	public double rateTagSelect(SqlSession session) {
		return session.selectOne("RateMapper.rateTagSelect");
	}
}
