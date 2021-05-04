package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.BoardDAO;
import com.dao.NewsDAO;
import com.dto.BoardDTO;
import com.dto.NewsDTO;

public class NewsService {
	public List<NewsDTO> newsSelect() {
		List<NewsDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			NewsDAO dao = new NewsDAO();
			list = dao.newsSelect(session);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
}
