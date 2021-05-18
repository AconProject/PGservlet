package com.dto;

public class GenreDTO {
	private int genreId;
	private String gameCategory;
	
	
	
	public GenreDTO() {
		super();
	}
	public GenreDTO(int genreId, String gameCategory) {
		super();
		this.genreId = genreId;
		this.gameCategory = gameCategory;
	}
	public int getGenreId() {
		return genreId;
	}
	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}
	public String getGameCategory() {
		return gameCategory;
	}
	public void setGameCategory(String gameCategory) {
		this.gameCategory = gameCategory;
	}
	@Override
	public String toString() {
		return "GenreDTO [genreId=" + genreId + ", gameCategory=" + gameCategory + "]";
	}
	
	
}
