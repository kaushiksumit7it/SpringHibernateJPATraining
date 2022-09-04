package com.demopack.bean;

public class Customer {
	private String cname;
	private String phone;
	private String loc;
	
	public Customer(String cname, String phone, String loc) {
		super();
		this.cname = cname;
		this.phone = phone;
		this.loc = loc;
	}

	public String getCname() {
		return cname;
	}

	public String getPhone() {
		return phone;
	}

	public String getLoc() {
		return loc;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	
	
}
