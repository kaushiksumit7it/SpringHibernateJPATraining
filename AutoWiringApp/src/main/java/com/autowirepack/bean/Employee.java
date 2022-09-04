package com.autowirepack.bean;

public class Employee {
	private String empNo, empName;
	private Address eddrs;
	private Account eacc;
	
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getEddrs() {
		return eddrs;
	}
	public void setEddrs(Address eddrs) {
		this.eddrs = eddrs;
	}
	public Account getEacc() {
		return eacc;
	}
	
	public void setEacc(Account eacc) {
		this.eacc = eacc;
	}
	
	
	public void printEmpDetails()
	{
		System.out.println("Emp No : " + getEmpNo());
		System.out.println("Emp Name : " + getEmpName());
		System.out.println(eacc.toString());
		System.out.println(eddrs.toString());
	}
	
}
