package com.demopack.bean;

public class Books {
private int bid;
private String bname;
private float price;

public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}

public void printBookDetails()
{
System.out.println("Book ID : " + getBid());
System.out.println("Book Name : " + getBname());
System.out.println("Book Price : " + getPrice());

}

}
