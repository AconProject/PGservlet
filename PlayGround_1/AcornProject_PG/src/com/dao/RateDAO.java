package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.RateDTO;

public class RateDAO {
	public List<Double> rateRecommendSelect(SqlSession session) {
		return session.selectList("RateMapper.rateRecommendSelect");
	}
	
	public List<Double> rateTagSelect(SqlSession session, List<Integer> listTags) {
		return session.selectList("RateMapper.rateTagSelect", listTags);
	}

	public RateDTO getGameScore(SqlSession session, String gameNo) {
		System.out.println("gameNo: "+gameNo);
		RateDTO dto = session.selectOne("RateMapper.getGameScore", gameNo);
		System.out.println(dto);
		return dto;
	}
}
