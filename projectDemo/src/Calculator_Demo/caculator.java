package Calculator_Demo;

import java.util.Scanner;

public class caculator {
	
	public static void main (String []args) {
		
		Scanner sc = new Scanner (System.in);
		double x;
		double y;
		String operation;
		while(true) {
		System.out.println("please enter a new number:   ");
		 x = sc.nextDouble();
		 operation = sc.next();
		 y = sc.nextDouble();
		System.out.println("please enter a second number:  ");
		
		
		if (operation.equals("+")) {
			System.out.println(add(x,y));
		}
		else if (operation.equals("-")) {
			System.out.println(substract(x, y));
		}
		else if (operation.equals("/")) {
			System.out.println(devid(x, y));
			
		}else if(operation.equals("*")) {
			System.out.println(multiply(x, y));
		}else {
			System.out.println("not a valid operation");
		}
		}
	}
	public static double add(double x, double y) {
		return x+y;
	}
	public static double substract(double x, double y) {
		return x-y;
	}
	
	public static double devid(double x, double y) {
		return x/y;
	}
	
	public static double multiply(double x, double y) {
		return x*y;
	}
	
	

}
