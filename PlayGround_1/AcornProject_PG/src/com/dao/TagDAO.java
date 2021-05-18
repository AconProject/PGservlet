package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class TagDAO {
	public List<String> tagSelect(SqlSession session) {
		return session.selectList("TagMapper.tagSelect");
	}
}
