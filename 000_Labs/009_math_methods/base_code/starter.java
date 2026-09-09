/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program. 
		
		int x = Math.max(13 - 6 * 11, 30 % 7 * (-2));
 		double y = Math.sqrt(3 * 8 + 31 % 7);
 		double z = Math.pow(37 / 3, 35 % 21);
		double c = Math.max( Math.pow( 2,14%3) , Math.sqrt ( 2*6) );
		System.out.println("Maximum = " + x);
		System.out.println("Square root = " + y);
		System.out.println("Power = " + z);
		System.out.println("Max = " + c);

		System.out.println("");
		System.out.println("Extra Class");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.println("Put in a value.");
		int ab = sc.nextInt();
		System.out.println("Put in another value.");
		int cd = sc.nextInt();
		
		int max = Math.max(ab,cd);
		double sqrt = Math.sqrt(cd);
		double pow = Math.pow(ab,cd);
		System.out.println("Max = " + max);
		System.out.println("Square root = " + sqrt );
		System.out.println( ab + " to the power of "+ cd + " is " + pow);
		
	}
}
