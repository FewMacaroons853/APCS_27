/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = sc.nextLine();

		System.out.print("What is your title? Ex: Slayer of Dragons: ");
		String title = sc.nextLine();

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

		System.out.println("");
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		System.out.println("");

		int totalpoints = 20;
		System.out.print("Strength (1-10): ");
		int Str = sc.nextInt();
		if(Str >= totalpoints){
			System.out.println("Please input a smaller value. Strength (1-10): ");
		}
		int pointstr = (totalpoints-Str);
		System.out.println("You have "+pointstr+" points left.");
		
		System.out.println("");
		System.out.print("Dexterity (1-10): ");
		int dex = sc.nextInt();
		if(dex >= pointstr){
			System.out.println("Please input a smaller value. Strength (1-10): ");
		}
		int pointdex = (pointstr-Str);
		System.out.println("You have "+pointdex+" points left.");

		System.out.println("");
		System.out.print("Intelligence (1-10): ");
		int intel = sc.nextInt();
		if(intel >= pointdex){
			System.out.println("Please input a smaller value. Intelligence (1-10): ");
		}
		int pointint = (pointdex-Str);
		System.out.println("You have "+pointint+" points left.");

		System.out.println("");
		System.out.print("Constitution (1-10): ");
		int con = sc.nextInt();
		if(con >= pointint){
			System.out.println("Please input a smaller value. Constituiton (1-10): ");
		}
		int pointcon = (pointint-Str);
		System.out.println("You have "+pointcon+" points left.");

		System.out.println("");
		System.out.print("Charisma (1-10): ");
		int cha = sc.nextInt();
		if(cha >= pointcon){
			System.out.println("Please input a smaller value. Charisma (1-10): ");
		}
		int pointcha = (pointcon-Str);
		System.out.println("You have "+pointcha+" points left.");
	}
}
