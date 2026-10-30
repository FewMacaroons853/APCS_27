/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman tom = new Spiderman("Tom Holland", 27, "The Vulture");
		tom.displaySpiderInfo();
		Spiderman andrew = new Spiderman("Andrew Garfield", 40, "Electro");
		andrew.displaySpiderInfo();
		Spiderman tobey = new Spiderman("Tobey Maguire",43,"Green Goblin");
		tobey.displaySpiderInfo();
		Spiderman miles = new Spiderman("Miles Morales", 17, "The Spot");
		miles.displaySpiderInfo();
		String milesactor = miles.getActor();
		tobey.setAge(48);
		int tobaeyage = tobey.getAge();
		miles.fight();
		System.out.println("");
		System.out.println(tobaeyage);
		System.out.println(milesactor);
	}
}
