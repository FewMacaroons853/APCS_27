/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int int1 = sc.nextInt();
		System.out.print("Enter your second integer: ");
		int int2 = sc.nextInt();
		System.out.print("Enter your last integer: ");
		int int3 = sc.nextInt();
		if (int1 > int2){
			if (int1 > int3){
				System.out.println(int1 + " is the largest integer of the three.");

			}

		}
		if (int3 > int2){
			if (int3 > int1){
				System.out.println(int3 + " is the largest integer of the three.");

			}

		}
		if (int2 > int1){
			if (int2 > int3){
				System.out.println(int2 + " is the largest integer of the three.");

			}
		}
		
		if (int1 < int2){
			if (int1 < int3){
				System.out.println(int1 + " is the smallest integer of the three.");

			}

		}
		if (int2 < int3){
			if (int2 < int1){
				System.out.println(int2 + " is the smallest integer of the three.");

			}

		}
		if (int3 < int2){
			if (int3 < int1){
				System.out.println(int3 + " is the smallest integer of the three.");

			}

		}
	}
}
