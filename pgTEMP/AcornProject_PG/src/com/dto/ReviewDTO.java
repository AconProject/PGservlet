package com.dto;

public class ReviewDTO {

	String reviewId; //고유 번호 (보이지 않음)
	String mbrId; //ID
	String mbrName; //닉네임
	String gameNo;
	String reviewContent;
	int reviewLiked;
	double reviewScore;
	String reviewDate;
	public ReviewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReviewDTO(String reviewId, String mbrId, String mbrName, String gameNo, String reviewContent,
			int reviewLiked, double reviewScore, String reviewDate) {
		super();
		this.reviewId = reviewId;
		this.mbrId = mbrId;
		this.mbrName = mbrName;
		this.gameNo = gameNo;
		this.reviewContent = reviewContent;
		this.reviewLiked = reviewLiked;
		this.reviewScore = reviewScore;
		this.reviewDate = reviewDate;
	}
	public String getReviewId() {
		return reviewId;
	}
	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}
	public String getMbrId() {
		return mbrId;
	}
	public void setMbrId(String mbrId) {
		this.mbrId = mbrId;
	}
	public String getMbrName() {
		return mbrName;
	}
	public void setMbrName(String mbrName) {
		this.mbrName = mbrName;
	}
	public String getGameNo() {
		return gameNo;
	}
	public void setGameNo(String gameNo) {
		this.gameNo = gameNo;
	}
	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	public int getReviewLiked() {
		return reviewLiked;
	}
	public void setReviewLiked(int reviewLiked) {
		this.reviewLiked = reviewLiked;
	}
	public double getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(double reviewScore) {
		this.reviewScore = reviewScore;
	}
	public String getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}
	@Override
	public String toString() {
		return "ReviewDTO [reviewId=" + reviewId + ", mbrId=" + mbrId + ", mbrName=" + mbrName + ", gameNo=" + gameNo
				+ ", reviewContent=" + reviewContent + ", reviewLiked=" + reviewLiked + ", reviewScore=" + reviewScore
				+ ", reviewDate=" + reviewDate + "]";
	}
	
	
	
}
