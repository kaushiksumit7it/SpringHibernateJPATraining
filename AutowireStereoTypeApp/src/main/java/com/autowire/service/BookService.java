package com.autowire.service;
import com.autowire.bean.*;
public interface BookService {

	public String CreateBook(int bno, String bname, String author, float price);
	public Books GetBook(int bno);
}
