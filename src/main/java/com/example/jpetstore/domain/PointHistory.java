package com.example.jpetstore.domain;

import java.io.Serializable;
import java.sql.Date;
/*이거추가한거.*/
@SuppressWarnings("serial")
public class PointHistory implements Serializable  {
 
	private String pointId;
	private Date date;
	private int status;
	private int amount;
	private String history;
	
	
	public String getPointId() {
		return pointId;
	}
	public void setPointId(String pointId) {
		this.pointId = pointId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	
}
