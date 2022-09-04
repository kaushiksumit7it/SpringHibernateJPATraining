package com.autowire.service;

import org.springframework.stereotype.Service;
import com.autowire.dao.*;
import com.autowire.bean.Books;
@Service("BookService")
public class BookServiceimpl implements BookService {

	BooksDao bk = new BooksDaoImple(); // injecting interface
	
	public String CreateBook(int bno, String bname, String author, float price) {
		// TODO Auto-generated method stub
		String res = bk.Create(bno, bname, author, price);
		return res;
	}

	public Books GetBook(int bno) {
		// TODO Auto-generated method stub
		Books b = bk.Search(bno);
		return b;
	}
}
