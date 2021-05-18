package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.GenreDAO;
import com.dto.GenreDTO;

public class GenreService {
	public List<GenreDTO> genreSelect() {
		List<GenreDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			GenreDAO dao = new GenreDAO();
			list = dao.genreSelect(session);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
}
