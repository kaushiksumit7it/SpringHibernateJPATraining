package com.autowire.dao;
import com.autowire.bean.*;
public interface BooksDao {

	public String Create(int bno, String bname, String author, float price);
	public Books Search(int bno);
	
}
