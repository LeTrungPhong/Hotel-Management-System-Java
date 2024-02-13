package com.appManageHotel.models.bill;
import com.appManageHotel.models.time.Time;

public class Bill {

	private String IDBill;
	private String IDCustomer;
	private String IDRoom;
	private Time TimeCheckIn;
	private Time TimeCheckOut;
	private Time TimeReality;
	
	public Bill() {
		this.setIDBill(null);
		this.setIDCustomer(null);
		this.setIDRoom(null);
		this.setTimeCheckIn(null);
		this.setTimeCheckOut(null);
		this.setTimeReality(null);
	}
	
	public Bill(String IDBill, String IDCustomer, String IDRoom, Time TimeCheckIn, Time TimeCheckOut, Time TimeReality) {
		this.setIDBill(IDBill);
		this.setIDCustomer(IDCustomer);
		this.setIDRoom(IDRoom);
		this.setTimeCheckIn(TimeCheckIn);
		this.setTimeCheckOut(TimeCheckOut);
		this.setTimeReality(TimeReality);
	}

	public String getIDBill() {
		return IDBill;
	}

	public void setIDBill(String iDBill) {
		this.IDBill = iDBill;
	}

	public String getIDCustomer() {
		return IDCustomer;
	}

	public void setIDCustomer(String iDCustomer) {
		this.IDCustomer = iDCustomer;
	}

	public String getIDRoom() {
		return IDRoom;
	}

	public void setIDRoom(String iDRoom) {
		this.IDRoom = iDRoom;
	}

	public Time getTimeCheckIn() {
		return TimeCheckIn;
	}

	public void setTimeCheckIn(Time timeCheckIn) {
		this.TimeCheckIn = timeCheckIn;
	}

	public Time getTimeCheckOut() {
		return TimeCheckOut;
	}

	public void setTimeCheckOut(Time timeCheckOut) {
		this.TimeCheckOut = timeCheckOut;
	}

	public Time getTimeReality() {
		return TimeReality;
	}

	public void setTimeReality(Time timeReality) {
		this.TimeReality = timeReality;
	}
	
	

}
