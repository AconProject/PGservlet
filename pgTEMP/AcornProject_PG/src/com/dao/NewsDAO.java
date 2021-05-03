package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.BoardDTO;
import com.dto.NewsDTO;

public class NewsDAO {
	
	public List<NewsDTO> newsSelect(SqlSession session) {
		return session.selectList("NewsMapper.newsSelect");
	}
}
