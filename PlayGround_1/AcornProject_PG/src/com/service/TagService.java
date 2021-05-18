package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.TagDAO;

public class TagService {
	public List<String> tagSelect() {
		List<String> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			TagDAO dao = new TagDAO();
			list = dao.tagSelect(session);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
}
