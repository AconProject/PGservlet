package com.dto;

public class RateDTO {
	String gameNo;
	Double gameScore;
	int rateCount;
	

	public RateDTO() {
		super();
	}
	public RateDTO(String gameNo, Double gameScore, int rateCount) {
		super();
		this.gameNo = gameNo;
		this.gameScore = gameScore;
		this.rateCount = rateCount;
	}
	public String getGameNo() {
		return gameNo;
	}
	public void setGameNo(String gameNo) {
		this.gameNo = gameNo;
	}
	public Double getGameScore() {
		return gameScore;
	}
	public void setGameScore(Double gameScore) {
		this.gameScore = gameScore;
	}
	public int getRateCount() {
		return rateCount;
	}
	public void setRateCount(int rateCount) {
		this.rateCount = rateCount;
	}
	@Override
	public String toString() {
		return "RateDTO [gameNo=" + gameNo + ", gameScore=" + gameScore + ", rateCount=" + rateCount + "]";
	}
	
	
}
