package com.appManageHotel.models.time;

public class Date {
	
	protected int Day;
	protected int Month;
	protected int Year;
	
	public Date() {
		this.Day = 0;
		this.Month = 0;
		this.Year = 0;
	}
	
	public Date(int Day, int Month, int Year) {
		this.Day = Day;
		this.Month = Month;
		this.Year = Year;
	}
	
	public int getDay() {
		return this.Day;
	}
	
	public void setDay(int Day) {
		this.Day = Day;
	}
	
	public int getMonth() {
		return this.Month;
	}
	
	public void setMonth(int Month) {
		this.Month = Month;
	}
	
	public int getYear() {
		return this.Year;
	}
	
	public void setYear(int Year) {
		this.Year = Year;
	}
	
	public String PrintDate() {
		return this.Day + "/" + this.Month + "/" + this.Year;
	}
}
