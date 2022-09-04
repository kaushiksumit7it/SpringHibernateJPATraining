package com.autowirepack.bean;

public class Address {
private String doorno, city;

public String getDoorno() {
	return doorno;
}

public void setDoorno(String doorno) {
	this.doorno = doorno;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String toString()
{
	return "Address Info :\nDoor No : " + getDoorno() + "\nLocation : " + getCity();  
}
}
