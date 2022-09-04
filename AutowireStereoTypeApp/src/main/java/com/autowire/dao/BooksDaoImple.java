package com.autowire.dao;

import org.springframework.stereotype.Component;

import com.autowire.bean.Books;
@Component("BookDao")
public class BooksDaoImple implements BooksDao {

	public String Create(int bno, String bname, String author, float price) {
		// TODO Auto-generated method stub
		String res = "Book No : "  + bno;
		res += "\nBook Name : " + bname;
		res += "\nBook Author : " + author;
		res += "\nBook Price : " + price;
		return res;
	}

	public Books Search(int bno) {
		// TODO Auto-generated method stub
		Books b = new Books();
		b.setBno(bno);
		b.setBname("Wings of Fire");
		b.setAuthor("APJ");
		b.setPrice(500.00f);
		return b;
	}

}
