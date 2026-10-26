/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount a = new BankAccount();
		BankAccount b = new BankAccount("Aiden", 19233);
		BankAccount c = new BankAccount("Joey", 23000.00);
		BankAccount d = new BankAccount("Louie", 25000.00);

		b.setOwner("Aiden Chun");

		a.printDetails();
		b.printDetails();
		c.printDetails();
		d.printDetails();
		
		
	}
}
