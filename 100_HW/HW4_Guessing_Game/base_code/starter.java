/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int random = (int)(Math.random()*3);
		System.out.println("Guessing game!");
		System.out.println("");

		if (random == 0){
			System.out.println("Its a planet in our solar system!");
			System.out.print("What's your guess: ");
			String mars = sc.nextLine();
				if (mars.equalsIgnoreCase("mars")){
					System.out.println("Nice you got it!");
				}
				else{
					System.out.println("Sorry you got it wrong. :(");
					System.out.print("Heres another hint, its known as the red planet: ");
					String mars2 = sc.nextLine();
						if (mars2.equalsIgnoreCase("mars")){
							System.out.println("Nice you got it!");
						}
						else{
							System.out.println("Sorry you're wrong the word was mars :(");
						}
				} 
		}

		if (random == 1){
			System.out.println("Its an animal");
			System.out.print("What's your guess: ");
			String dog = sc.nextLine();
			if (dog.equalsIgnoreCase("dog")){
					System.out.println("Nice you got it!");
				}
				else{
					System.out.println("Sorry you got it wrong. :(");
					System.out.print("Heres another hint, its mans best friend: ");
					String dog2 = sc.nextLine();
						if (dog2.equalsIgnoreCase("dog")){
							System.out.println("Nice you got it!");
						}
						else{
							System.out.println("Sorry you're wrong the word was dog :(");
						}
				} 
		}

		if (random == 2){
			System.out.println("Its a fruit!");
			System.out.print("What's your guess: ");
			String orange = sc.nextLine();
			if (orange.equalsIgnoreCase("orange")){
					System.out.println("Nice you got it!");
				}
				else{
					System.out.println("Sorry you got it wrong. :(");
					System.out.print("Heres another hint, its a color and a fruit: ");
					String orange2 = sc.nextLine();
						if (orange2.equalsIgnoreCase("orange")){
							System.out.println("Nice you got it!");
						}
						else{
							System.out.println("Sorry you're wrong the word was orange :(");
						}
				} 
		}
	}
}
