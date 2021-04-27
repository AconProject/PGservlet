package com.dto;

public class GameTagDTO {
	private String gameNo;
	private String tagTemp;
	
	public GameTagDTO() {
		super();
	}

	public GameTagDTO(String gameNo, String tagTemp) {
		super();
		this.gameNo = gameNo;
		this.tagTemp = tagTemp;
	}
	
	public String getGameNo() {
		return gameNo;
	}
	public void setGameNo(String gameNo) {
		this.gameNo = gameNo;
	}
	public String getTagTemp() {
		return tagTemp;
	}
	public void setTagTemp(String tagTemp) {
		this.tagTemp = tagTemp;
	}
	
	@Override
	public String toString() {
		return "GameTagDTO [gameNo=" + gameNo + ", tagTemp=" + tagTemp + "]";
	}
	
}
