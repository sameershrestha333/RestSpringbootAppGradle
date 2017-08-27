package com.rest.model;

public class ECU {
	
	private int id;
	private String ecuAddress;
	private String shortName;
	private String canRepId;
	public ECU() {
		super();
	}
	public ECU(int id, String ecuAddress, String shortName, String canRepId) {
		super();
		this.id = id;
		this.ecuAddress = ecuAddress;
		this.shortName = shortName;
		this.canRepId = canRepId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEcuAddress() {
		return ecuAddress;
	}
	public void setEcuAddress(String ecuAddress) {
		this.ecuAddress = ecuAddress;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getCanRepId() {
		return canRepId;
	}
	public void setCanRepId(String canRepId) {
		this.canRepId = canRepId;
	}
	
	
}
