package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.GenreDTO;

public class GenreDAO {
	public List<GenreDTO> genreSelect(SqlSession session) {
		return session.selectList("TagMapper.genreSelect");
	}
}
