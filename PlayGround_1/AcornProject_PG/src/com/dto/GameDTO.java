package com.dto;

public class GameDTO {
	private String gameNo;
	private String gameName;
	private String gameImage;
	private int gamePrice;
	private String gameContent;
	private String gameCategory; //1
	private String gameGenre;// 여러개  "
	private String gameReleasedDate;
	/*
	 * var gameCategory = 액션 로그라이크,로그라이크,인디,리플레이 가치,어려움"
	 * gameCategory = gameCategory.split(",");
	 * for (var i = 0; i < gameCategory.length; i++)
	 * 	gameCategory[i].valuie(
	 */
	
	
	public GameDTO() {
		super();
	}
	
	public GameDTO(String gameNo, String gameName, String gameImage, int gamePrice, String gameContent,
			String gameCategory, String gameGenre, String gameReleasedDate) {
		super();
		this.gameNo = gameNo;
		this.gameName = gameName;
		this.gameImage = gameImage;
		this.gamePrice = gamePrice;
		this.gameContent = gameContent;
		this.gameCategory = gameCategory;
		this.gameGenre = gameGenre;
		this.gameReleasedDate = gameReleasedDate;
	}

	
	public String getGameGenre() {
		return gameGenre;
	}

	public void setGameGenre(String gameGenre) {
		this.gameGenre = gameGenre;
	}

	public String getGameReleasedDate() {
		return gameReleasedDate;
	}

	public void setGameReleasedDate(String gameReleasedDate) {
		this.gameReleasedDate = gameReleasedDate;
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
				+ gamePrice + ", gameContent=" + gameContent + ", gameCategory=" + gameCategory + ", gameGenre="
				+ gameGenre + ", gameReleasedDate=" + gameReleasedDate + "]";
	}

	
	
	
}