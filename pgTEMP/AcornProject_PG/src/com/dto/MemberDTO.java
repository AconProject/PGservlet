package com.dto;

public class MemberDTO {

	
	private String userId;
	private String userPw;
	private String userName;
	private String mbrEmail;
	private String mbrRegdate;
	private String mbrGenre;
	
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(String userId, String userPw, String userName, String mbrEmail, String mbrRegdate,
			String mbrGenre) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.mbrEmail = mbrEmail;
		this.mbrRegdate = mbrRegdate;
		this.mbrGenre = mbrGenre;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMbrEmail() {
		return mbrEmail;
	}

	public void setMbrEmail(String mbrEmail) {
		this.mbrEmail = mbrEmail;
	}

	public String getMbrRegdate() {
		return mbrRegdate;
	}

	public void setMbrRegdate(String mbrRegdate) {
		this.mbrRegdate = mbrRegdate;
	}

	public String getMbrGenre() {
		return mbrGenre;
	}

	public void setMbrGenre(String mbrGenre) {
		this.mbrGenre = mbrGenre;
	}

	@Override
	public String toString() {
		return "MemberDTO [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", mbrEmail="
				+ mbrEmail + ", mbrRegdate=" + mbrRegdate + ", mbrGenre=" + mbrGenre + "]";
	}
	
	

}
