package com.appManageHotel.models.service;

public class Service {

	private String IDService;
	private String NameService;
	private int MoneyService;
	private String InformationService;
	
	public Service() {
		this.IDService = null;
		this.NameService = null;
		this.MoneyService = 0;
		this.InformationService = null;
	}
	
	public Service(String IDService, String NameService, int MoneyService, String InformationService) {
		this.IDService = IDService;
		this.NameService = NameService;
		this.MoneyService = MoneyService;
		this.InformationService = InformationService;
	}

	public String getIDService() {
		return this.IDService;
	}
	
	public void setIDService(String IDService) {
		this.IDService = IDService;
	}
	
	public String getNameService() {
		return this.NameService;
	}
	
	public void setNameService(String NameService) {
		this.NameService = NameService;
	}
	
	public int getMoneyService() {
		return this.MoneyService;
	}
	
	public void setMoneyService(int MoneyService) {
		this.MoneyService = MoneyService;
	}
	
	public String getInformationService() {
		return this.InformationService;
	}
	
	public void setInformationService(String InformationService) {
		this.InformationService = InformationService;
	}
	
	public void PrintService() {
		System.out.print(this.IDService + "   ");
		System.out.print(this.NameService);
		for(int i = 0; i < 25 - this.NameService.length(); ++ i) {
			System.out.print(" ");
		}
		System.out.print(this.MoneyService);
		for(int i = 0; i < 10 - String.valueOf(this.MoneyService).length(); ++i) {
			System.out.print(" ");
		}
		System.out.print(this.InformationService);
	}
}
