/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Fortune Cookie Generator :D");
	System.out.println("");
	int number = (int)(Math.random()*10);
	if (number==0){
		System.out.print("Why are you here right now? : ");
		String answer = sc.nextLine();
		System.out.println("..");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

	}
	if (number==1){
		System.out.println("Be yourself because everyone else is already taken.");
	}
	if (number==2){
		System.out.println("If you only live once then dont act like you live forever.");
	}
	if (number==3){
		System.out.println("You only live once but if you do it right once is enough.");
	}
	if (number==4){
		System.out.println("Be the change that you wish to see in the world.");
	}
	if (number==5){
		System.out.println("Make it happen");
	}
	if (number==6){
		System.out.println("To live is the rarest thing in the world.");
	}
    if (number == 7){
		System.out.println("A friend is someone who knows all about you and still loves you.");
	}
	if (number==8){
		System.out.println("Always forgive your enemies nothing annoys them so much.");
	}
	else if (number==9){
		System.out.println("Live as if you were to die tomorrow.");
	}
	

	}
}
