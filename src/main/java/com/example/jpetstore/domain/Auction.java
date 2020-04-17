package com.example.jpetstore.domain;

import java.sql.Date;

public class Auction {
	private String aucId;
	private Date startDate;
	private Date deadLine;
	private String place;
	private String comment;
	private int startPrice;
	private int finalPrice;
	public String getAucId() {
		return aucId;
	}
	public void setAucId(String aucId) {
		this.aucId = aucId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(int startPrice) {
		this.startPrice = startPrice;
	}
	public int getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(int finalPrice) {
		this.finalPrice = finalPrice;
	}
	
	
}
