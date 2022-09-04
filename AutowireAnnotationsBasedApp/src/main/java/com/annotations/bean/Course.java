package com.annotations.bean;

public class Course {
private String cid, cname;
private float cost;


public String getCid() {
	return cid;
}
public void setCid(String cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public float getCost() {
	return cost;
}
public void setCost(float cost) {
	this.cost = cost;
}

public String toString()
{
	return "Course Info :\nCourse ID : " + getCid() + "\nCourse Name : " + getCname() + "\nCost : " + getCost(); 
}
}
