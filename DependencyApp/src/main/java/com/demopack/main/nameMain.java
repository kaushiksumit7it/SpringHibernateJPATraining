package com.demopack.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demopack.bean.*;
public class nameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext fact = new ClassPathXmlApplicationContext("config2.xml");
		Books bk = (Books)fact.getBean("bokObj");
		bk.printBookDetails();
		System.out.println("===========");
		Customer cust = (Customer)fact.getBean("cusObj");
		System.out.println("Customer Name : " + cust.getCname());
		System.out.println("Phone Number : " + cust.getPhone());
		System.out.println("Customer Location : " + cust.getLoc());
		
		System.out.println("===========");
		
		Employee emp = (Employee)fact.getBean("EmpObj");
		System.out.println(emp.toString());
	}
}
