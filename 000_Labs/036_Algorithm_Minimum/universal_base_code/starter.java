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
		
		int size = (int)(Math.random()*150)+51;
		int [] x = new int[size];

		for(int i=0; i<x.length; i++){
			int rand = (int)(Math.random()*100)+1;
			x[i] = rand;
		}	
		int min = Integer.MAX_VALUE;
		for(int i=0; i<x.length; i++){
			if(x[i]<min){
				min = x[i];
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i=0; i<x.length; i++){
			if(x[i]>max){
				max = x[i];
			}
		}
		int run = 0;
		for(int i=0; i<x.length; i++){
			run += x[i];
		}
		run = (run/x.length);
		System.out.println("The minimum of " + x.length + " random digits is " + min + ".");
		System.out.println("The maximum of " + x.length + " random digits is " + max + ".");
		System.out.println("The average of all the digits is " + run + ".");
		System.out.println("There were " + x.length + " elements.");
	}
}
