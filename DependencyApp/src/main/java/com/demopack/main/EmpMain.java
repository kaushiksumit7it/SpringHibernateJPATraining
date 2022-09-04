package com.demopack.main;
import com.demopack.bean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext fact = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee)fact.getBean("empObj");
		emp.PrintEmpDetails();
	}

}
