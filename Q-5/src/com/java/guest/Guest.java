package com.java.guest;

public class Guest {
	private String name;
    private String emailId;
    private String dob;
    private String arrivalFrom;
    private int room;
    private String address;
    
	public Guest() {
		super();
	}

	public Guest(String name, String emailId, String dob, String arrivalFrom, int room, String address) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.dob = dob;
		this.arrivalFrom = arrivalFrom;
		this.room = room;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getArrivalFrom() {
		return arrivalFrom;
	}

	public void setArrivalFrom(String arrivalFrom) {
		this.arrivalFrom = arrivalFrom;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Guest [name=" + name + ", emailId=" + emailId + ", dob=" + dob + ", arrivalFrom=" + arrivalFrom
				+ ", room=" + room + ", address=" + address + "]";
	}    
    
}
