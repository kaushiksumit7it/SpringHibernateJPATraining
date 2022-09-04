package com.demopack.main;
import com.demopack.bean.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CusMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext fact = new ClassPathXmlApplicationContext("config.xml");
		Customer cust = (Customer)fact.getBean("cusObj");
		
		System.out.println("Customer Name : " + cust.getCname());
		System.out.println("Phone Number : " + cust.getPhone());
		System.out.println("Customer Location : " + cust.getLoc());
	}

}
