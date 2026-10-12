/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);

		System.out.println("welcome to the guessing game!");
		System.out.print("Please guess a number: ");
		int guess = sc.nextInt();
		int x = (int)(Math.random()*1000+1);

		while(true){
			if(x == guess){
				System.out.println("You got it!");
				break;
			}
			else if(guess < x){
				System.out.print("Your guess is lower than the number, guess again: ");
				guess = sc.nextInt();
			}
			else if(guess > x){
				System.out.print("Your guess is higher than the number, guess again: ");
				guess = sc.nextInt();
			}
		}
	}
}
