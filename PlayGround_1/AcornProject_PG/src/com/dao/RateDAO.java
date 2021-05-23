package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class RateDAO {
	public List<Double> rateRecommendSelect(SqlSession session) {
		return session.selectList("RateMapper.rateRecommendSelect");
	}
	
	public List<Double> rateTagSelect(SqlSession session, List<Integer> listTags) {
		return session.selectList("RateMapper.rateTagSelect", listTags);
	}
}
