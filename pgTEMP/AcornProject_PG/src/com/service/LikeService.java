package com.service;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.LikeDAO;

public class LikeService {
	public int likeBoardCount(HashMap<String, String> ids) {
		SqlSession session = MySqlSessionFactory.getSession();
		int cnt = 0;
		try {
			LikeDAO dao = new LikeDAO();
			cnt = dao.likeBoardCount(session, ids);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}
	
	public boolean likeBoardInsert(HashMap<String, String> ids) {
		SqlSession session = MySqlSessionFactory.getSession();
		int cnt = 0;
		try {
			LikeDAO dao = new LikeDAO();
			cnt = dao.likeBoardInsert(session, ids);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return cnt == 1 ? true : false;
	}
	
	public boolean likeBoardDelete(HashMap<String, String> ids) {
		SqlSession session = MySqlSessionFactory.getSession();
		int cnt = 0;
		try {
			LikeDAO dao = new LikeDAO();
			cnt = dao.likeBoardDelete(session, ids);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return cnt == 1 ? true : false;
	}
}
