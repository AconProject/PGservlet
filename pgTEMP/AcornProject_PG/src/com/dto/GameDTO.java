package com.dto;

public class GameDTO {
	private String gameNo;
	private String gameName;
	private String gameImage;
	private int gamePrice;
	private String gameContent;
	private String gameCategory;
	
	public GameDTO() {
		super();
	}

	public GameDTO(String gameNo, String gameName, String gameImage, int gamePrice, String gameContent,
			String gameCategory) {
		super();
		this.gameNo = gameNo;
		this.gameName = gameName;
		this.gameImage = gameImage;
		this.gamePrice = gamePrice;
		this.gameContent = gameContent;
		this.gameCategory = gameCategory;
	}
	
	public String getGameNo() {
		return gameNo;
	}
	
	public void setGameNo(String gameNo) {
		this.gameNo = gameNo;
	}
	
	public String getGameName() {
		return gameName;
	}
	
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	public String getGameImage() {
		return gameImage;
	}
	
	public void setGameImage(String gameImage) {
		this.gameImage = gameImage;
	}
	
	public int getGamePrice() {
		return gamePrice;
	}
	
	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
	
	public String getGameContent() {
		return gameContent;
	}
	
	public void setGameContent(String gameContent) {
		this.gameContent = gameContent;
	}
	
	public String getGameCategory() {
		return gameCategory;
	}
	
	public void setGameCategory(String gameCategory) {
		this.gameCategory = gameCategory;
	}

	@Override
	public String toString() {
		return "GameDTO [gameNo=" + gameNo + ", gameName=" + gameName + ", gameImage=" + gameImage + ", gamePrice="
				+ gamePrice + ", gameContent=" + gameContent + ", gameCategory=" + gameCategory + "]";
	}
	
	
}