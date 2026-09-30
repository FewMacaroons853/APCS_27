/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Would you like to be wizard, Warrior or Rogue? ");
		String ans = sc.nextLine();
		if (ans.equalsIgnoreCase("rogue")){
			System.out.println("You have chosen rogue!");
		}
		else if (ans.equalsIgnoreCase("wizard")){
			System.out.println("You have chosen the wizard!");
		}
		else if (ans.equalsIgnoreCase("warrior")){
			System.out.println("You have chosen to be the warrior!");
		}
		else{
			System.out.println("You have decided to not choose a role");
		}
	}
}
