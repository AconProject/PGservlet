package com.dto;

import java.sql.Date;

public class BoardDTO {
	private int boardId;
	private String mbrId;
	private String mbrName;
	private String boardName;
	private String boardCategory;
	private String boardContent;
	private int boardLiked;
	private int boardCount;
	private Date boardDate;
	
	public BoardDTO() {
		super();
	}
<<<<<<< HEAD


=======
	



>>>>>>> aa374320a698c2d165c889bf7818200cbe58f412
	public BoardDTO(int boardId, String mbrId, String mbrName, String boardName, String boardCategory,
			String boardContent, int boardLiked, int boardCount, Date boardDate) {
		super();
		this.boardId = boardId;
		this.mbrId = mbrId;
		this.mbrName = mbrName;
		this.boardName = boardName;
		this.boardCategory = boardCategory;
		this.boardContent = boardContent;
		this.boardLiked = boardLiked;
		this.boardCount = boardCount;
		this.boardDate = boardDate;
	}

	public String getBoardName() {
		return boardName;
	}


<<<<<<< HEAD
=======

	public String getBoardName() {
		return boardName;
	}




>>>>>>> aa374320a698c2d165c889bf7818200cbe58f412
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

<<<<<<< HEAD
=======



>>>>>>> aa374320a698c2d165c889bf7818200cbe58f412
	public String getMbrName() {
		return mbrName;
	}


	public void setMbrName(String mbrName) {
		this.mbrName = mbrName;
	}



	public int getBoardLiked() {
		return boardLiked;
	}


	public void setBoardLiked(int boardLiked) {
		this.boardLiked = boardLiked;
	}


	public int getBoardCount() {
		return boardCount;
	}



	public void setBoardCount(int boardCount) {
		this.boardCount = boardCount;
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


	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	@Override
	public String toString() {
		return "BoardDTO [boardId=" + boardId + ", mbrId=" + mbrId + ", boardCategory=" + boardCategory
				+ ", boardContent=" + boardContent + ", boardCount=" + boardCount
				+ ", boardDate=" + boardDate + "]";
	}
	
}
