package com.dto;

import java.util.List;

public class PageDTO {

	private List<ReviewDTO> list; // 페이지번호(curPage)에 해당하는 perPage개수만큼만
	// db에서 가져와서 리스트에 저장
	private int curPage; // 현재 또는 요청 페이지
	private int perPage = 4; // 한페이지에 보여질 갯수
	private int totalCount; // 전체 레코드 갯수

	public PageDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<ReviewDTO> getList() {
		return list;
	}

	public void setList(List<ReviewDTO> list) {
		this.list = list;
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	@Override
	public String toString() {
		return "PageDTO [list=" + list + ", curPage=" + curPage + ", perPage=" + perPage + ", totalCount=" + totalCount
				+ "]";
	}

}