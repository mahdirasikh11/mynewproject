package com.getter.setter;

public class Vehicle {
	
	private String name;
	private String model;
	private int engine;
	private String color;
	
public void setModel( String model) {
	
	String validatModel = model.toLowerCase();
	
	if(validatModel.equals("Honda Accured ") || validatModel.equals("totyo corrolla")) {
		this.model = model;
	}else {
		this.model ="unknown";
	}
  
}
public  String getModel() { 
	 return this.model = model;
	
}
public void setEngin (String engine ) {
	
}
}
