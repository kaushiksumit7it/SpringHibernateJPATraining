package com.autowirepack.main;
import com.autowirepack.bean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext fact = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee)fact.getBean("empObj");
		emp.printEmpDetails();
		
		System.out.println("------------------------");
		Employee2 emp2 = (Employee2)fact.getBean("empObj1");
		emp2.printEmpDetails();
	}

}
