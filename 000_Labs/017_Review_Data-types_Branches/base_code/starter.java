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
		int pointstr = (totalpoints-Str);
		if(Str >= totalpoints){
			System.out.print("Please input a smaller value. Strength (1-10): ");
			Str = sc.nextInt();
			pointstr = (totalpoints-Str);
			System.out.println("You have "+pointstr+" points left.");
		}
		else if (Str <= totalpoints){
			System.out.println("You have "+pointstr+" points left.");
		}
		
		
		


		System.out.println("");
		System.out.print("Dexterity (1-10): ");
		int dex = sc.nextInt();
		int pointdex = (pointstr-dex);
		if(dex >= pointdex){
			System.out.print("Please input a smaller value. Dexterity (1-10): ");
			dex = sc.nextInt();
			pointdex = (pointstr-dex);
			System.out.println("You have "+pointdex+" points left.");
		}
		else if (dex <= pointstr){
			System.out.println("You have "+pointdex+" points left.");
		}
		


		System.out.println("");
		System.out.print("Intelligence (1-10): ");
		int intel = sc.nextInt();
		int pointint = (pointdex-intel);
		if(intel >= pointint){
			System.out.print("Please input a smaller value. Intelligence (1-10): ");
			intel = sc.nextInt();
			pointint = (pointdex-intel);
			System.out.println("You have "+pointint+" points left.");
		}
		else if (intel <= pointdex){
			System.out.println("You have "+pointint+" points left.");
		}
		
		

		System.out.println("");
		System.out.print("Constitution (1-10): ");
		int con = sc.nextInt();
		int pointcon = (pointint-con);
		if(con >= pointcon){
			System.out.println("Please input a smaller value. Constituiton (1-10): ");
			con = sc.nextInt();
			pointcon = (pointint-con);
			System.out.println("You have "+pointcon+" points left.");
		}
		else if (con <= pointint){
			System.out.println("You have "+pointcon+" points left.");
		}
		

		System.out.println("");
		System.out.print("Charisma (1-10): ");
		int cha = sc.nextInt();
		int pointcha = (pointcon-cha);
		if(cha >= pointcha){
			System.out.println("Please input a smaller value. Charisma (1-10): ");
			cha = sc.nextInt();
			pointcha = (pointcon-cha);
			System.out.println("You have "+pointcha+" points left.");
		}
		else if (cha <= pointcon){
			System.out.println("You have "+pointcha+" points left.");
		}

		System.out.println("--------------------------------------");
		System.out.println("You are " + name + ", the " + title + " of CVHS.");
		System.out.println("You're a " + ans + " with the following stats!");
		System.out.println("Strength: " + Str);
		System.out.println("Dextrity: " + dex);
		System.out.println("Intelligence: " + intel);
		System.out.println("Charisma: " + cha);

		System.out.println("");
		System.out.println("Good luck on your quest " + name +"!");
	}
}
