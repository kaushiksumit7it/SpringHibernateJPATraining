package com.annotations.main;
import com.annotations.bean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class StdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext fact = new ClassPathXmlApplicationContext("config.xml");
		Student std = (Student)fact.getBean("stdObj");
		std.printStudentInfo();
	System.out.println("=================");
		Student2 std2 = (Student2)fact.getBean("stdObj1");
		std2.printStudentInfo();
		
	}

}
