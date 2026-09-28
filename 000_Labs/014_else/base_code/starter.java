/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*1000+1);
		System.out.print("Guess a integer 1-1000: ");
		int guess = sc.nextInt();
		if (guess == num){
			System.out.println("You win!!!");
		}
		else{
			System.out.println("Sorry the number was "+num+".");
		}
		
	}
}
