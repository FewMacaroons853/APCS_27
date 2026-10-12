/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("");

		System.out.print("How many times would you like it to be printed: ");
		int amount = sc.nextInt();
		System.out.println("");
		
		int count = 0;

		while (count<amount){
			System.out.println(name);
			count += 1;
		}


		
	}
}
