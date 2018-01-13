package Cubic.trainning.Practice;

import java.util.Scanner;

public class Array_list {
	
	public static void main (String []args) {
	 
	
 Scanner sc = new Scanner(System.in);

     System.out.print("please Enter a number from [1  /6  ]  "  );
 
   int s = sc.nextInt();
   
   String day;
   
   if(s == 1 || s == 0) {
	   day ="saterday";
	   System.out.println("today is :  "+day);
   }else if(s == 2 || s == 2) {
	 
	   day ="sunday";
	   System.out.println("today is :  "+day);
   }else if(s == 3) {
	   day ="monday";
	   System.out.println("today is :  "+day);
   }else if(s == 4) {
	   day ="tusday";
	   System.out.println("today is :  "+day);
   }else if(s == 5) {
	   day ="wensday";
	   System.out.println("today is :  "+day);
   }else if(s == 6) {
	   day ="friday";
	   System.out.println("today is :  "+day);

   }else {
	   
	   System.out.println("please enter a valide number from 1 /5");
   }

	}
}
