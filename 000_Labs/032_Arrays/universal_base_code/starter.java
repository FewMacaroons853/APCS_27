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
	int [] arr1 = new int[10];
	int x = 0;
	int y = 9;

	while(x<10){
		arr1[x] = y;
		y -= 1;
		x++;
	}
	x = 0;
	while(x<10){
		System.out.println(arr1[x]);
		x++;
	}
		
	}
}
