package com.dto;

public class MemberDTO {

	
	private String mbrId;
	private String mbrPw;
	private String mbrName;
	private String mbrEmail;
	private String mbrRegdate;
	private String mbrGenre;
	
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(String mbrId, String mbrPw, String mbrName, String mbrEmail, String mbrRegdate, String mbrGenre) {
		super();
		this.mbrId = mbrId;
		this.mbrPw = mbrPw;
		this.mbrName = mbrName;
		this.mbrEmail = mbrEmail;
		this.mbrRegdate = mbrRegdate;
		this.mbrGenre = mbrGenre;
	}

	public String getMbrId() {
		return mbrId;
	}

	public void setMbrId(String mbrId) {
		this.mbrId = mbrId;
	}

	public String getMbrPw() {
		return mbrPw;
	}

	public void setMbrPw(String mbrPw) {
		this.mbrPw = mbrPw;
	}

	public String getMbrName() {
		return mbrName;
	}

	public void setMbrName(String mbrName) {
		this.mbrName = mbrName;
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
		return "MemberDTO [mbrId=" + mbrId + ", mbrPw=" + mbrPw + ", mbrName=" + mbrName + ", mbrEmail=" + mbrEmail
				+ ", mbrRegdate=" + mbrRegdate + ", mbrGenre=" + mbrGenre + "]";
	}

	

}
