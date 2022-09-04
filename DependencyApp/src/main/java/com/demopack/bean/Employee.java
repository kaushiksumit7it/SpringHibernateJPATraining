package com.demopack.bean;

public class Employee {

	private int empno;
	private String empname;
	private int salary;
	private String job;
	private Account accinfo;  // user defined data type;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Account getAccinfo() {
		return accinfo;
	}
	public void setAccinfo(Account accinfo) {
		this.accinfo = accinfo;
	}

	public void PrintEmpDetails()
	{
		System.out.println("Emp No : " + getEmpno());
		System.out.println("Emp Name : " + getEmpname());
		System.out.println("Emp Salary: " + getSalary());
		System.out.println("Emp Job : " + getJob());
		System.out.println("---Account Details----");
		System.out.println("Account No : " + accinfo.getAccNo());
		System.out.println("Account Name : " + accinfo.getAccName());
		System.out.println("Account Balance : " + accinfo.getBalance());		
	}
	@Override
    public String toString() {
		String results = "";
		results = results + "Employee Info : ";
		results += "\nEmployee Number : " + empno;
		results += "\nEmployee Name : " + empname;
		results += "\nEmployee JOb : " + job;
		results += "\nEmployee Salary : " + salary;
		results += "\nAccount Info : ";
		results += accinfo.toString();
        return results;
    }

	
}
