package Computer_Demo;

public class Mycomputer_demo {

	private String name ;
	private int model;
	private String color;
	private int RAM;
	private int CPU;
	private double price;
	
	public Mycomputer_demo(String name, int model, String color, int ram, int cpu ,double price) {
		
		
		 this.name = name;
		 this.color = color;
	     this.model= model;
	     this.RAM = ram;
	     this.CPU = cpu;
	     this.price= price;
	    
	}
	public String computerInormation() {
		
		return "Computer name: " +name+ "\nComputer model : " +model+ "\nComputer color is "+color+ "\nComputer RAM "+ RAM +
				"\nComputer CPU "+CPU+ "\nCompute price "+price;
		
	}
	public void powerOn () {
		System.out.println("power on");
		
	}
	public void powerOf() {
		
		System.out.println("powe Off");
	}
	public int getmodel() {
		return this.model;
		
	   
	}
	public void setmodel() {
		
		this.model= model;
	}
	
}

