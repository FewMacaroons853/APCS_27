/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random numbers");
		System.out.print("Please enter an integer: ");
		int range1 = sc.nextInt();
		
		System.out.print("Please enter another integer (bigger than the first): ");		
		int range2 = sc.nextInt();
		int RANGE = range2 - range1+1;

		int a = (int)(Math.random()*RANGE)+range1;
		int b = (int)(Math.random()*RANGE)+range1;
		int e = (int)(Math.random()*RANGE)+range1;
		int c = (int)(Math.random()*RANGE)+range1;
		int d = (int)(Math.random()*RANGE)+range1;

		System.out.println("");
		System.out.println("Your range is " + range1 + " to " + range2 + ".");
		System.out.println("Here are 5 numbers generated in that range."); 
		
		System.out.println(a + ", "+b+", "+c+", "+d+", "+e+".");
	}
}
