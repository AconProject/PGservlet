package com.dto;

import java.sql.Date;

public class BoardDTO {
	private int boardId;
	private String mbrId;
	private String boardCategory;
	private String boardContent;
	private String boardRecommend;
	private String boardCount;
	private Date boardDate;
	
	public BoardDTO() {
		super();
	}
	public BoardDTO(int boardId, String mbrId, String boardCategory, String boardContent, String boardRecommend,
			String boardCount, Date boardDate) {
		super();
		this.boardId = boardId;
		this.mbrId = mbrId;
		this.boardCategory = boardCategory;
		this.boardContent = boardContent;
		this.boardRecommend = boardRecommend;
		this.boardCount = boardCount;
		this.boardDate = boardDate;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getMbrId() {
		return mbrId;
	}
	public void setMbrId(String mbrId) {
		this.mbrId = mbrId;
	}
	public String getBoardCategory() {
		return boardCategory;
	}
	public void setBoardCategory(String boardCategory) {
		this.boardCategory = boardCategory;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardRecommend() {
		return boardRecommend;
	}
	public void setBoardRecommend(String boardRecommend) {
		this.boardRecommend = boardRecommend;
	}
	public String getBoardCount() {
		return boardCount;
	}
	public void setBoardCount(String boardCount) {
		this.boardCount = boardCount;
	}
	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	@Override
	public String toString() {
		return "BoardDTO [boardId=" + boardId + ", mbrId=" + mbrId + ", boardCategory=" + boardCategory
				+ ", boardContent=" + boardContent + ", boardRecommend=" + boardRecommend + ", boardCount=" + boardCount
				+ ", boardDate=" + boardDate + "]";
	}
	
}
