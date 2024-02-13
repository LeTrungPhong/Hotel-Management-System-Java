package com.appManageHotel.models.people;
import com.appManageHotel.models.time.Date;

public class Customer extends People {

	private boolean Check;
	private int times;

	public Customer() {
		super();
		this.Check = false;
		this.times = 0;
	}
	
	public Customer(String CCCD, String Name, Date Date, int times, boolean Check) {
		super(CCCD,Name,Date);
		this.Check = Check;
		this.times = times;
	}
	
	public void PrintCustomer() {
		System.out.print(this.CCCD + "    ");
		System.out.print(this.Name);
		for(int i = 0; i < 25 - this.Name.length(); ++i) {
			System.out.print(" ");
		}
		System.out.print(this.Date.PrintDate());
		for(int i = 0; i < 15 - this.Date.PrintDate().length(); ++i) {
			System.out.print(" ");
		}
		System.out.print(this.times);
		System.out.println("   " + this.Check);
	}
	
	public int getCheck() {
		if(this.Check == true) return 1;
		return 0;
	}
	
	public void changeChecktoTrue() {
		this.Check = true;
	}
	
	public void changeChecktoFalse() {
		this.Check = false;
	}
	
	public int gettimes() {
		return this.times;
	}
	
	public void settimes(int times) {
		this.times = times;
	}
	
	public void counttimes() {
		this.times++;
	}
}

