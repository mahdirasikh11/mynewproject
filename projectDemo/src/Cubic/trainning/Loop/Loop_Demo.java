package Cubic.trainning.Loop;

import java.util.Scanner;

public class Loop_Demo {
	
	public static void main (String []args) {
	
		Scanner input= new Scanner (System.in);
		
		System.out.print("how many names you want to enter : " );

		int n= input.nextInt();
		
		String name [] = new String [n];
		
		for (int i=0; i<=n; i++) {
		
		name  [i] = input.nextLine();
		
		
		}
}

}