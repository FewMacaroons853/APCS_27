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
		else if (guess<num){
			System.out.println("Sorry you guessed lower than the number. The number was "+num+".");
		}
		else{
			System.out.println("Sorry you guessed higher than the number. The number was "+num+".");
		}
		
	}
}
