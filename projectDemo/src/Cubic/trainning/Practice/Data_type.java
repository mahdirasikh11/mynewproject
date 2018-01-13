package Cubic.trainning.Practice;

import java.util.Scanner;

public class Data_type {

	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Pleas Enter a number from [1  / 6]:"   );
		
		int name = sc.nextInt();
		    	 
		
		switch (name) {
		case 1:
			System.out.println("today is monday ");
			break;
		case 2:
			System.out.println("today is sunday");
			break;
		case 3:
			System.out.println("today is tuesday");
			break;
		case 4:
			System.out.println("today is friday");
			break;
		default:
			System.out.println("not a valid week day");
		}
		if (name == 1 || name == 2) {
			System.out.println("today is off");
		}else {
			System.out.println("go to work now");
			
		}
		
	}
		
	}
	

