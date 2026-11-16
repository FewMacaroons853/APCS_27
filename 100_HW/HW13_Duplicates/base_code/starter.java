/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] x = new int[20];
		for(int i = 0; i < 20; i++){
			x[i] = (int)(Math.random()*10)+1;
		}
		int rand = (int)(Math.random()*10)+1;

		System.out.println("----------------------------------------------------");
		System.out.println("These are the 20 numbers.");
		System.out.println(x[0] + " " + x[1] + " " +x[2] + " " + x[3] + " " + x[4] + " " + x[5] + " " + x[6] + " " + x[7] + " " + x[8] + " " + x[9] + " " + x[10] + " " + x[11] + " " + x[12] + " " +x[13] + " " + x[14] + " " + x[15] + " " + x[16] + " " + x[17] + " " + x[18] + " " + x[19]);
		System.out.println("----------------------------------------------------");

		System.out.println("The random number to look for is " + rand);

		int c = 0;
		for(int i = 0; i < x.length; i++){
			if(rand == x[i]){
			System.out.println("Duplicate found at index " + i);
			c++;
			if(x[i] == x[i+1]){
				System.out.println("Two in a row found at indexes " + i + " and " + (i+1) + ". The number is " + x[i]);
			}
			}
		}
		System.out.println("Total number of duplicates for " + rand +  " is " + c);
		System.out.println("----------------------------------------------------");

		
		
		

	}
}
