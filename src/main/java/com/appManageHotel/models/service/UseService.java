package com.appManageHotel.models.service;
import com.appManageHotel.models.time.Time;

public class UseService {

	private String IDUseService;
	private String IDBil;
	private String IDService;
	private Time Time;
	
	public UseService() {
		this.IDUseService = null;
		this.IDBil = null;
		this.IDService = null;
		this.Time = new Time();
	}
	
	public UseService(String IDUseService, String IDBil, String IDService, Time time) {
		this.IDUseService = IDUseService;
		this.IDBil = IDBil;
		this.IDService = IDService;
		this.Time = time;
	}
	
	public String getIDUseService() {
		return this.IDUseService;
	}
	
	public void setIDUseService(String IDUseService) {
		this.IDUseService = IDUseService;
	}
	
	public String getIDBil() {
		return this.IDBil;
	}
	
	public void setIDCustomer(String IDBil) {
		this.IDBil = IDBil;
	}
	
	public String getIDService() {
		return this.IDService;
	}
	
	public void setIDService(String IDService) {
		this.IDService = IDService;
	}
	
	public Time getTime() {
		return this.Time;
	}
	
	public void setTime(Time Time) {
		this.Time = Time;
	}
}
