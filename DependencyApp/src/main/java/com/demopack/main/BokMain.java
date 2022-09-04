package com.demopack.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.demopack.bean.Books;
public class BokMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext fact = new ClassPathXmlApplicationContext("config.xml");
		Books b = (Books)fact.getBean("BokObj");
		b.printBookDetails();
	}

}
