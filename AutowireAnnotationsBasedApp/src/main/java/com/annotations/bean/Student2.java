package com.annotations.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student2 {
private  String sid, sname;
private Course  cinfo;

public Student2(String sid, String sname, 
		@Autowired(required=true)  // required
		@Qualifier("course2")
		Course cinfo) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.cinfo = cinfo;
}

public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Course getCinfo() {
	return cinfo;
}

public void setCinfo(Course cinfo) {
	this.cinfo = cinfo;
}

public void printStudentInfo()
{
	System.out.println("Student ID : " + getSid());
	System.out.println("Student Name : " + getSname());
	System.out.println(cinfo.toString());
}

}
