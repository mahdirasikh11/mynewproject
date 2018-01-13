package arrayDemo;

import java.util.Scanner;

public class Array_daimonsion {


	public static void main(String []args) {

	Scanner sc = new Scanner (System.in);
	
	double x;
	double y;
	String operation;

		
	while (true) {
    	System.out.print("please Enter frist number:  ");
		
        x = sc.nextDouble();
	     
	   System.out.print("Please Enter the following operation (+ /  -  *):  ");
		  
	     operation = sc.next();
	 		  
	     System.out.print("please enter second number :  ");
	     y  = sc.nextDouble();
	 
	 if (operation.equals("+")) {
	    	 
	     System.out.println(add(x,y));	
	     
} 	else if (operation.equals("-")) {
	System.out.println(substraction(x, y));
}
  else if (operation.equals("*")) {
	System.out.println(devide(x, y));
}
else if (operation.equals("/")) {
	System.out.println(mulitply(x, y));
}else {
	System.out.println("not valid operation");
}
}
}
	public static double add (double x, double y) {
		return x+y;
	
	}	
	public static double substraction (double x, double y) {
		return x-y;
	
	}	
	public static double devide(double x, double y) {
		return x*y;
	
	}
	public static double mulitply (double x, double y) {
		return x/y;
	
	}
	
	
	
}