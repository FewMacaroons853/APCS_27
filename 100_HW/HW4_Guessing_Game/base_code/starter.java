/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int random = (int)(Math.random()*3);
		
		if (random == 0)
			System.out.println("It's a planet in our solar system!");
			System.out.print("What is your guess? ");
			String mars = sc.nextLine();
				if (mars == mars,Mars)
					System.out.println("You win!");
				else
					System.out.println("You sadly didnt guess right, heres another hint!");
					System.out.print("It is sometimes called the red planet");
					String mars1 = sc.nextLine();
					if (mars1 == mars,Mars)
						System.out.println("You win!");
					else 
						System.out.println("Sorry you lost!");
		else if (random == 1)
			System.out.println("CAT");
		else
			System.out.println("APPLE");
	}
}
