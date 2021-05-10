package com.dto;

import java.sql.Date;

public class RateDTO {
	private Double rate;

	public RateDTO(Double rate) {
		super();
		this.rate = rate;
	}

	public RateDTO() {
		super();
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "RateDTO [rate=" + rate + "]";
	}
	
	
}
