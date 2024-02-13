package com.appManageHotel.models.room;

public class ConvenientRoom {
	
	private String IDRoom;
	private String IDConvenientRoom;
	
	public ConvenientRoom() {
		this.IDRoom = null;
		this.IDConvenientRoom = null;
	}
	
	public ConvenientRoom(String IDRoom, String IDconvenientRoom) {
		this.IDRoom = IDRoom;
		this.IDConvenientRoom = IDconvenientRoom;
	}
	
	public String getIDRoom() {
		return this.IDRoom;
	}
	
	public void setIDRoom(String IDRoom) {
		this.IDRoom = IDRoom;
	}
	
	public String getIDconvenientRoom() {
		return IDConvenientRoom;
	}
	
	public void setIDconvenientRoom(String IDconvenientRoom) {
		this.IDConvenientRoom = IDconvenientRoom;
	}
}
