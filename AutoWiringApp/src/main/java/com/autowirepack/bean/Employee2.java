package com.autowirepack.bean;

public class Employee2 {
	private String empNo, empName;	
	private Account2 eaccinfo;
	
	
	public Account2 getEaccinfo() {
		return eaccinfo;
	}


	public void setEaccinfo(Account2 eaccinfo) {
		this.eaccinfo = eaccinfo;
	}


	public Employee2(String empNo, String empName, Account2 eaccinfo) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.eaccinfo = eaccinfo;
	}
	
	
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
	
	
	
	public void printEmpDetails()
	{
		System.out.println("Emp No : " + getEmpNo());
		System.out.println("Emp Name : " + getEmpName());
		System.out.println(eaccinfo.toString());		
	}
	
}
