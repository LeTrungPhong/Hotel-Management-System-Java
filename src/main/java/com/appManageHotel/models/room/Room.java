package com.appManageHotel.models.room;

public class Room {

	private String IDRoom;
	private boolean Check;
	private int Money;
	private String TypeRoom;

	public Room() {
		this.IDRoom = null;
		this.Check = false;
		this.Money = 0;
		this.TypeRoom = null;
	}
	
	public Room(String IDRoom, boolean Check, int Money, String TypeRoom) {
		this.IDRoom = IDRoom;
		this.Check = Check;
		this.Money = Money;
		this.TypeRoom = TypeRoom;
	}
	
	public String getIDRoom() {
		return this.IDRoom;
	}
	
	public void setIDRoom(String IDRoom) {
		this.IDRoom = IDRoom;
	}
	
	public boolean getCheck() {
		return this.Check;
	}
	
	public void changeChecktoTrue() {
		this.Check = true;
	}
	
	public void changeChecktoFalse() {
		this.Check = false;
	}
	
	public int getMoney() {
		return this.Money;
	}
	
	public String getTypeRoom() {
		return this.TypeRoom;
	}
	
	public void setTypeRoom(String TypeRoom) {
		this.TypeRoom = TypeRoom;
	}
	
	public void PrintRoom() {
		System.out.print(this.IDRoom + "   ");
		if(this.Check == true) {
			System.out.print("Trong" + "      ");
		}
		else {
			System.out.print("Khong trong");
		}
		System.out.print("   ");
		System.out.print(this.TypeRoom);
		for(int i = 0; i < 20 - this.TypeRoom.length(); ++i) {
			System.out.print(" ");
		}
		System.out.print(this.Money);
	}
}
