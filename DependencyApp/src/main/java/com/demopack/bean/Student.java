package com.demopack.bean;
import java.util.*;
public class Student {
	private int sid;
	private String sname;
	private List<String> squal;
	private Set<String> scourse;
	private Map<String, String> course_and_faculty;
	private Properties course_and_fees;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<String> getSqual() {
		return squal;
	}
	public void setSqual(List<String> squal) {
		this.squal = squal;
	}
	public Set<String> getScourse() {
		return scourse;
	}
	public void setScourse(Set<String> scourse) {
		this.scourse = scourse;
	}
	public Map<String, String> getCourse_and_faculty() {
		return course_and_faculty;
	}
	public void setCourse_and_faculty(Map<String, String> course_and_faculty) {
		this.course_and_faculty = course_and_faculty;
	}
	public Properties getCourse_and_fees() {
		return course_and_fees;
	}
	public void setCourse_and_fees(Properties course_and_fees) {
		this.course_and_fees = course_and_fees;
	}


	public void StudentDetails()
	{
		System.out.println("Student ID : " + getSid());
		System.out.println("Student Name : " + getSname());
		System.out.println("Qualification : " + getSqual());
		System.out.println("Courses : " + getScourse());
		System.out.println("Faculties: " + getCourse_and_faculty());
		System.out.println("Fees: " + getCourse_and_fees());		
	}
}
