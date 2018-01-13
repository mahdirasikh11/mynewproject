package com.hashset.demo;

import java.util.Date;

public class books {
	
	String name ;
	int quantity;
	String author;
	Date yearPublshide;
	public books(String name, int quantity, String author, Date date) {
		
		this.name = name;
		this.quantity = quantity;
		this.author = author;
		this.yearPublshide = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getYearPublshide() {
		return yearPublshide;
	}
	public void setYearPublshide(Date yearPublshide) {
		this.yearPublshide = yearPublshide;
	}
	
	

}
