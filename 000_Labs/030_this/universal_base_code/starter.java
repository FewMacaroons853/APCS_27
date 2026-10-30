/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf zero = new PooleDwarf(randName(), (int)(Math.random()*90) + 1);
		PooleDwarf one = new PooleDwarf(randName(), (int)(Math.random()*90) + 1);
		PooleDwarf two = new PooleDwarf(randName(), (int)(Math.random()*90) + 1);
		PooleDwarf three = new PooleDwarf(randName(), (int)(Math.random()*90) + 1);
		PooleDwarf four = new PooleDwarf(randName(), (int)(Math.random()*90) + 1);
		PooleDwarf five = new PooleDwarf(randName(), (int)(Math.random()*90) + 1);
		PooleDwarf six = new PooleDwarf(randName(), (int)(Math.random()*90) + 1);

		String firstName = zero.getName();
		int duplicates = 0;

		if(zero.isSameName(one.getName())){
			duplicates++;
		}
		if(zero.isSameName(two.getName())){
			duplicates++;
		}
		if(zero.isSameName(three.getName())){
			duplicates++;
		}
		if(zero.isSameName(four.getName())){
			duplicates++;
		}
		if(zero.isSameName(five.getName())){
			duplicates++;
		}
		if(zero.isSameName(six.getName())){
			duplicates++;
		}
		
		System.out.println(firstName + " was the name!");
		System.out.println("");
		if(duplicates>0){
			System.out.println("There are " + duplicates + " name(s) that match!");
		}
		else{
			System.out.println("There are no matches");
		}
	}
}
