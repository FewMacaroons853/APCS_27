/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = (int)(Math.random()*9+1);
		int y = (int)(Math.random()*9+1);
		int z = (int)(Math.random()*9+1);
		int money = 100;
		System.out.println("Slot Machine Rules:"); 
		System.out.println("1. Each player starts with $100."); 
		System.out.println("2. Input a wager less than your total amount of money."); 
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10."); 
		System.out.println("	a. If two numbers match, you double your money."); 
		System.out.println("	b. If three numbers match, you triple your money."); 
		System.out.println("	c. If none match, you lose your money.");
		System.out.println("-------------------------------------------------------");
		System.out.println(""); 
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");

		String play = sc.nextLine();

		if (play.equalsIgnoreCase("yes") || play.equalsIgnoreCase("y")){
		while(money > 1){
				System.out.print("You have $" + money + ". How much would you like to wager? ");
				int wager = sc.nextInt();
				System.out.println("");
				System.out.println("Great! Let's play!!!");
				System.out.println("Your rolls are:");
				System.out.println("_______________________");
				System.out.println(" | "+x+" | "+y+" | "+z+" |");
				System.out.println("_______________________");
				if ((x==y && x==z) || (y==x && y==z) || (z==x && z==y)){
					wager*=3;
					money += wager;
					System.out.println("Nice! You have " + money +" dollars left!");
					x = (int)(Math.random()*9+1);
					y = (int)(Math.random()*9+1);
					z = (int)(Math.random()*9+1);
					System.out.print("You have $" + money + ". How much would you like to wager? ");
					wager = sc.nextInt();
				}
				else if ((x==y || x ==z) || (y==x || y==z) || (z==x || z==y)){
					wager*=2;
					money += wager;
					System.out.println("Nice! You have " + money +" dollars left!");
					x = (int)(Math.random()*9+1);
					y = (int)(Math.random()*9+1);
					z = (int)(Math.random()*9+1);
				}
				else {
					money -= wager;
					System.out.println("Sorry better luck next time! You have " + money + " dollars left");
					x = (int)(Math.random()*9+1);
					y = (int)(Math.random()*9+1);
					z = (int)(Math.random()*9+1);
				}
		}
		}
		else{
			System.out.println("That wasn't quite the correct answer. Rerun the code.");
			System.out.println("---------------------------------------------------"); 
		}		
	}
}
