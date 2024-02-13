package com.appManageHotel.models.room;

public class DetailConvenientRoom {

	private String IDDetailConvenientRoom;
	private String ConvenientName;
	
	public DetailConvenientRoom() {
		this.IDDetailConvenientRoom = null;
		this.ConvenientName = null;
	}
	
	public DetailConvenientRoom(String IDDetailConvenientRoom, String ConvenientName) {
		this.IDDetailConvenientRoom = IDDetailConvenientRoom;
		this.ConvenientName = ConvenientName;
	}
	
	public String getIDDetailConvenientRoom() {
		return this.IDDetailConvenientRoom;
	}
	
	public void setIDDetailConvenientRoom(String IDDetailConvenientRoom) {
		this.IDDetailConvenientRoom = IDDetailConvenientRoom;
	}
	
	public String getConvenientName() {
		return this.ConvenientName;
	}
	
	public void setConvenientName(String ConvenientName) {
		this.ConvenientName = ConvenientName;
	}
}
