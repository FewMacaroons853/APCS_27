/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
		String owner;
		private int accountNumber;
		double balance;
		boolean isActive;

		private static int nextAccountNumber = (int)(Math.random()*951)+50;

	// -------CONSTRUCTORS-------
	
	
	
	public BankAccount(){
		owner = "unknown";
		accountNumber = nextAccountNumber++;
		balance = 0;
		isActive = true;
	}
	public BankAccount(String ow){
		owner = ow;
		accountNumber = nextAccountNumber++;
		balance = 0;
		isActive = true;
	}
	public BankAccount(String ow, double ba){
		owner = ow;
		accountNumber = nextAccountNumber++;
		balance = ba;
		isActive = true;
	}

	// -------METHODS-------
	public void setOwner(String o){
		owner = o;
	}
	public void setBalance(double b){
		balance = b;
	}
	public void setActive(boolean a){
		isActive = a;
	}
	public void checkBalance(){
		System.out.println("");
		System.out.println(balance);
	}
	public double getBalance(){
		return balance;
	}
	public void displayAccountInfo(){
		System.out.println("----------------------");
		System.out.println("Owner: " + owner);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		if(isActive){
			System.out.println("This account is still active.");
		}
		else{
			System.out.println("This account is not active anymore.");
		}
		System.out.println("----------------------");
		System.out.println("");
	}
}