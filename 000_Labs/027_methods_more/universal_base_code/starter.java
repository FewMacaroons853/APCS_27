/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		BankAccount a = new BankAccount();
		BankAccount b = new BankAccount("Aiden", 19233);
		BankAccount c = new BankAccount("Joey", 23000.00);
		BankAccount d = new BankAccount("Louie", 25000.00);

		b.setOwner("Aiden Chun");
		

		a.displayAccountInfo();
		b.displayAccountInfo();
		c.displayAccountInfo();
		d.displayAccountInfo();

		//atm time boys
		System.out.println("Welcome to Aiden ATM!");
		System.out.println("We're going to create a bank account! What info do we know?");
		System.out.println("1 - Nothing ");
		System.out.println("2 - Owner");
		System.out.println("3 - Owner and Initial Deposit");
		int num = sc.nextInt();
		sc.nextLine();

		if(num == 1){
			System.out.println("Account succesfully created!");
			BankAccount x = new BankAccount();
			x.displayAccountInfo();	
			System.out.println("Would you like to check your balance of this account? (Yes/No)");
			String bc = sc.nextLine();
			double balance = x.getBalance();
			if(bc.equalsIgnoreCase("yes")){
				System.out.println("You currently have " + balance);
				System.out.println("");
				System.out.println("Thank you for visiting!");
			}
			else{
				System.out.println("");
				System.out.println("Thank you for visiting!");
			}
		}
		if(num == 2){
			System.out.println("");
			System.out.println("What is the name of the owner of this bank account?");
			String name = sc.nextLine();
			BankAccount x = new BankAccount(name);
			x.displayAccountInfo();
			double balance = x.getBalance();
			System.out.println("Would you like to check your balance of this account? (Yes/No)");
			String bc = sc.nextLine();
			if(bc.equalsIgnoreCase("yes")){
				System.out.println("You currently have " + balance);
				System.out.println("");
				System.out.println("Thank you for visiting!");
			}
			else{
				System.out.println("");
				System.out.println("Thank you for visiting!");
			}
		}
		if(num == 3){
			System.out.println("");
			System.out.println("What is the name of the owner of this bank account?");
			String name = sc.nextLine();
			System.out.println("How much are you initially depositing into this account?");
			int deposit = sc.nextInt();
			BankAccount x = new BankAccount(name, deposit);
			x.displayAccountInfo();
			double balance = x.getBalance();
			System.out.println("Would you like to check your balance of this account? (Yes/No)");
			String bc = sc.nextLine();
			if(bc.equalsIgnoreCase("yes")){
				System.out.println("You currently have " + balance);
				System.out.println("");
				System.out.println("Thank you for visiting!");
			}
			else{
				System.out.println("");
				System.out.println("Thank you for visiting!");
			}
		}

		
	
	}
}
