package com.appManageHotel.models.time;

public class Time extends Date{

	private int Second;
	private int Minute;
	private int Hour;
	
	public Time() {
		super();
		this.Second = 0;
		this.Minute = 0;
		this.Hour = 0;
	}
	
	public Time(int Day, int Month, int Year, int Second, int Minute, int Hour) {
		super(Day,Month,Year);
		this.Second = Second;
		this.Minute = Minute;
		this.Hour = Hour;
	}
	
	public int getSecond() {
		return this.Second;
	}
	
	public void setSecond(int Second) {
		this.Second = Second;
	}
	
	public int getMinute() {
		return this.Minute;
	}
	
	public void setMinute(int Minute) {
		this.Minute = Minute;
	}
	
	public int getHour() {
		return this.Hour;
	}
	
	public void setHour(int Hour) {
		this.Hour = Hour;
	}
	
	public String PrintTime() {
		return this.Second + ":" + this.Minute + ":" + this.Hour + " " + super.PrintDate();
	}

}
