package com.dto;

import java.sql.Date;

public class NewsDTO {
	private String newsTitle;
	private String newsUrl;
	private Date newsDate;
	
	public NewsDTO() {
		super();
	}

	public NewsDTO(String newsTitle, String newsUrl, Date newsDate) {
		super();
		this.newsTitle = newsTitle;
		this.newsUrl = newsUrl;
		this.newsDate = newsDate;
	}

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getNewsUrl() {
		return newsUrl;
	}

	public void setNewsUrl(String newsUrl) {
		this.newsUrl = newsUrl;
	}

	public Date getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(Date newsDate) {
		this.newsDate = newsDate;
	}

	@Override
	public String toString() {
		return "NewsDTO [newsTitle=" + newsTitle + ", newsUrl=" + newsUrl + ", newsDate=" + newsDate + "]";
	}
}
