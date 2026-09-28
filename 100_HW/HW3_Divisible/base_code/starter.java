/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type an integer: ");
		int num1 = sc.nextInt();
		System.out.print("Type in another integer: ");
		int num2 = sc.nextInt();
		System.out.println("");

		if (num1 % 3 == 0){
			System.out.println(num1+" is divisible by 3");
		}
		if (num1 % 4 == 0){
			System.out.println(num1+" is divisible by 4");
		}
		if (num1 % 5 == 0){
			System.out.println(num1+" is divisible by 5");
		}
		System.out.println("");
		if (num2 % 3 == 0){
			System.out.println(num2+" is divisible by 3");
		}
		if (num2 % 4 == 0){
			System.out.println(num2+" is divisible by 4");
		}
		if (num2 % 5 == 0){
			System.out.println(num2+" is divisible by 5");
		}
		if (num1 % 3 != 0 && num1 % 5 != 0 && num1 % 5 != 0){
			System.out.println(num1 +" isnt divisble by 3, 4, and 5");
		}
		if (num2 % 3 != 0 && num2 % 5 != 0 && num2 % 5 != 0){
			System.out.println(num2 +" isnt divisble by 3, 4, and 5");
		}
			
	}
}
