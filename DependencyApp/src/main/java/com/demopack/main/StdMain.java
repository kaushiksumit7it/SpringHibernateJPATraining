package com.demopack.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demopack.bean.*;

public class StdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext fact = new ClassPathXmlApplicationContext("config.xml");
		Student std = (Student)fact.getBean("stdObj");
		std.StudentDetails();
	}
}
