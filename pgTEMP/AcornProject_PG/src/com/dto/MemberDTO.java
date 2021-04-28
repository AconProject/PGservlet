package com.dto;

public class MemberDTO {

	private String userName;
	private String userId;
	private String userPw;
	private String Email;
	private String regDate;
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberDTO(String userName, String userId, String userPw, String email, String regDate) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.userPw = userPw;
		Email = email;
		this.regDate = regDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "MemberDTO [userName=" + userName + ", userId=" + userId + ", userPw=" + userPw + ", Email=" + Email
				+ ", regDate=" + regDate + ", getUserName()=" + getUserName() + ", getUserId()=" + getUserId()
				+ ", getUserPw()=" + getUserPw() + ", getEmail()=" + getEmail() + ", getRegDate()=" + getRegDate()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
