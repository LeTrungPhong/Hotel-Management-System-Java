package com.appManageHotel.models.people;
import com.appManageHotel.models.time.Date;

public class People {
	
	protected String CCCD;
	protected String Name;
	protected Date Date;
	
	public People() {
		this.CCCD = null;
		this.Name =null;
		this.Date = new Date();
	}
	
	public People(String CCCD, String Name, Date Date) {
		this.CCCD = CCCD;
		this.Name = Name;
		this.Date = Date;
	}
	
	public String getCCCD() {
		return this.CCCD;
	}
	
	public void setCCCD(String CCCD) {
		this.CCCD = CCCD;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public Date getDate() {
		return this.Date;
	}
	
	public String getStringDate() {
		return Integer.toString(this.Date.getYear()) + "-" + Integer.toString(this.Date.getMonth()) + "-" + Integer.toString(this.Date.getDay());
	}
	
	public void setDate(Date Date) {
		this.Date = Date;
	}	
}
