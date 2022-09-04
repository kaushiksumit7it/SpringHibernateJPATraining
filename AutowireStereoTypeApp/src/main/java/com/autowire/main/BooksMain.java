package com.autowire.main;
import com.autowire.dao.*;
import com.autowire.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BooksMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		//BookService bs = (BookService)ctx.getBean("BookService");
		//String res = bs.CreateBook(1001, "Wings of Fire", "APJ", 500.00f);
		//System.out.println(res);
		
		
		BooksDao bd = (BooksDao)ctx.getBean("BookDao");
		String res = bd.Create(1001, "Wings of Fire", "APJ", 500.00f);
		System.out.println(res);
	}

}
