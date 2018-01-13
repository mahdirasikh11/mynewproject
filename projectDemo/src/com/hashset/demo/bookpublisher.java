package com.hashset.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class bookpublisher {

	public static void main(String[] args) {
		books b= new  books("java master", 100, "mahdir", null);
		books b1= new  books("google learing", 10, "sharif khan", null);
		
		
		ArrayList <books> al = new ArrayList <>();
		al.add(b);
		al.add(b1);
		
		Iterator ir = al.iterator();
		
		while(ir.hasNext()) {
			books book = (books)ir.next();
			System.out.println("book name :" +book.name+  " book athur "+ book.author+  " book year of quantity " +book.quantity);
			
		}
		
	}

}
