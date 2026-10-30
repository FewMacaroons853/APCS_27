/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Dog name?");
		String name = sc.nextLine();
		System.out.println("What age should " + name + " be?");
		int age = sc.nextInt();
		
		Dog didi = new Dog("Didi", "German Sheperd");
		Dog input = new Dog(name, age);

		boolean sleep = input.isSleeping();
		boolean didisleep = didi.isSleeping();
		
		String dibreed = didi.getBreed();
		int diage = didi.getAge();
		String diname = didi.getName();

		String inpname = input.getName();
		int inpage = input.getAge();
		String inpbreed = input.getBreed();

		System.out.println(diname + " is a " + dibreed + " that is " + diage + " years old!");
		System.out.println(inpname + " is a " + inpbreed + " that is " + inpage + " years old!");

		if(sleep){
			System.out.println(name + " is sleeping! Dont wake " + name + " up!");
			if(didisleep){
				System.out.println(diname + " is sleeping too!");
			}
			else{
				System.out.println(diname + " isnt sleeping!");
			}
		}
		else{
			System.out.println(name + " is awake!");
			input.bark();
			System.out.println(diname + " hears " + name);
			didi.bark();
		}



	}
}
