package com.dto;

public class LikeDTO {
	
	int likeNo;
	String mbrId;
	int boardId;
	int reviewId;
	int replyId;
	
	
	public LikeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LikeDTO(int likeNo, String mbrId, int boardId, int reviewId, int replyId) {
		super();
		this.likeNo = likeNo;
		this.mbrId = mbrId;
		this.boardId = boardId;
		this.reviewId = reviewId;
		this.replyId = replyId;
	}
	public int getLikeNo() {
		return likeNo;
	}
	public void setLikeNo(int likeNo) {
		this.likeNo = likeNo;
	}
	public String getMbrId() {
		return mbrId;
	}
	public void setMbrId(String mbrId) {
		this.mbrId = mbrId;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	@Override
	public String toString() {
		return "LikedDTO [likeNo=" + likeNo + ", mbrId=" + mbrId + ", boardId=" + boardId + ", reviewId=" + reviewId
				+ ", replyId=" + replyId + "]";
	}
	
	
	
	

}
