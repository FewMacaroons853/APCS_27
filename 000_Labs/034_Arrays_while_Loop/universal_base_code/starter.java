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
		int i = 0;
		while(i<1000){
			int rand = (int)(Math.random()*1000)+1;
			x[i] = rand;
			i++;
		}
		i = 0;
		while(i<1000){
			System.out.println(x[i]);
			i++;
		}
	}
}
