/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int [] x = new int[1000];
		for(int i = 0; i<1000; i++){
			int rand = (int)(Math.random()*1000)+1;
			x[i] = rand;
		}
		for(int i = 0; i<1000; i++){
			System.out.println(x[i]);
		}

		
	}
}
