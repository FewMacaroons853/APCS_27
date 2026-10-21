/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static int pow(int a, int b){
		int answer = 1;
		int count = 0;
		while(count < b){
			answer *= a;
			count += 1;
		}
		return answer;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = sc.nextInt();
		System.out.print("Enter an integer: ");
		int b = sc.nextInt();
		int c = pow(a,b);
		System.out.println(a +" to the power of " + b +" is equals to " + c + ".");	
	}
}
	

