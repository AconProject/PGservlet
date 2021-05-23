package com.dto;

public class ReviewDTO {

	private int reviewId;
	private String mbrId;
	private String mbrName;
	private String gameNo;
	private String reviewContent;
	private int reviewLiked;
	private Double reviewScore;
	private String reviewDate;

	public ReviewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReviewDTO(int reviewId, String mbrId, String mbrName, String gameNo, String reviewContent, int reviewLiked,
			Double reviewScore, String reviewDate) {
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

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
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

	public Double getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(Double reviewScore) {
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
