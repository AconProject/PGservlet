package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.RateDTO;

public class RateDAO {
	public List<RateDTO> rateRecommendSelect(SqlSession session) {
		return session.selectList("RateMapper.rateRecommendSelect");
	}
	
	public List<RateDTO> rateTagSelect(SqlSession session, ArrayList<String> listTags) {
		return session.selectList("RateMapper.rateTagSelect", listTags);
	}
}
