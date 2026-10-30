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
	public String getOwner(){
		return owner;
	}

	public void setOwner(String o){
		owner = o;
	}
	public double getBalance(){
		return balance;
	}
	public boolean closeAccount(){
		return false;
	}
	public boolean isActive(){
		return isActive;
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
	public void deposit(double d){
		if(isActive == true){
			balance += d;
		}
	}
	public void withdraw(double w){
		if(isActive == true && balance <= 0 && balance - w >= 0){
			balance -= w;
		}
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