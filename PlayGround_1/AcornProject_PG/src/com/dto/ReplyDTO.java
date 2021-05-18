package com.dto;

import java.sql.Date;

public class ReplyDTO {
	private int replyId;
	private int boardId;
	private String mbrId;
	private String mbrName;
	private String replyContent;
	private int replyLiked;
	private Date replyDate;
	
	public ReplyDTO() {}
	
	public ReplyDTO(int replyId, int boardId, String mbrId, String mbrName, String replyContent, int replyLiked,
			Date replyDate) {
		super();
		this.replyId = replyId;
		this.boardId = boardId;
		this.mbrId = mbrId;
		this.mbrName = mbrName;
		this.replyContent = replyContent;
		this.replyLiked = replyLiked;
		this.replyDate = replyDate;
	}
	public String getMbrName() {
		return mbrName;
	}
	public void setMbrName(String mbrName) {
		this.mbrName = mbrName;
	}
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
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
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public int getReplyLiked() {
		return replyLiked;
	}
	public void setReplyLiked(int replyLiked) {
		this.replyLiked = replyLiked;
	}
	public Date getReplyDate() {
		return replyDate;
	}
	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}

	@Override
	public String toString() {
		return "ReplyDTO [replyId=" + replyId + ", boardId=" + boardId + ", mbrId=" + mbrId + ", replyContent="
				+ replyContent + ", replyLiked=" + replyLiked + ", replyDate=" + replyDate + "]";
	}
}
