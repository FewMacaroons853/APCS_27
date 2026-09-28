/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// I just did scanner thing becuz i thought it was more fun than just 
		// being told if 1 int is bigger than another without being able to choose
		System.out.print("Enter an integer: ");
		int int1 = sc.nextInt();
		System.out.print("Enter another integer: ");
		int int2 = sc.nextInt();
		boolean tf = int1 != int2;
		if (tf){
			System.out.println(int1 + " is different than " + int2);
		} 
			if (!tf){
			System.out.println(int2 + " is the same as " + int1);
		} 
	}
}
