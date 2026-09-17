/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("==========================================");
		System.out.println("        WELCOME RESTRAUNT OWNER!");
		System.out.println("==========================================");
		System.out.println("");
		
		// Name of restraunt
		System.out.print("What's the name of your restraunt? ");
		String Restraunt = sc.nextLine();
		System.out.println("");
		System.out.print("What's your name? ");
		String Name = sc.nextLine();
		System.out.println("");
		System.out.println("Great to see you, " + Name + "! Let's set up a menu for " + Restraunt + "!");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");
		System.out.println("");
		//Item 1
		System.out.println("--- Item #1 ---");
		System.out.print("Item name: ");
		String Item1 = sc.nextLine();
		System.out.print("Price of " + Item1 + " ($): ");
		double Price1 = sc.nextDouble();
		sc.nextLine();
		System.out.print("How many " + Item1 + " would you like? ");
		int Amount1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Added " + Amount1 + "x " + Item1 + " to your order! ($" + (Price1*Amount1) + ")");
		//Item 2
		System.out.println("--- Item #2 ---");
		System.out.print("Item name: ");
		String Item2 = sc.nextLine();
		System.out.print("Price of " + Item2 + " ($): ");
		double Price2 = sc.nextDouble();
		sc.nextLine();
		System.out.print("How many " + Item2 + " would you like? ");
		int Amount2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Added " + Amount2 + "x " + Item2 + " to your order! ($" + (Price2*Amount2) + ")");
		//Item 3
		System.out.println("--- Item #3 ---");
		System.out.print("Item name: ");
		String Item3 = sc.nextLine();
		System.out.print("Price of " + Item3 + " ($): ");
		double Price3 = sc.nextDouble();
		sc.nextLine();
		System.out.print("How many " + Item3 + " would you like? ");
		int Amount3 = sc.nextInt();
		sc.nextLine();
		System.out.println("Added " + Amount3 + "x " + Item3 + " to your order! ($" + (Price3*Amount3) + ")");
		System.out.print("Nice choices! What tip percentage wouldyou like to leave? (ex: 15, 18, 20): ");
		double Tip = sc.nextDouble();
		
		double TotalPrice = ((Price1*Amount1) + (Price2*Amount2) + (Price3*Amount3));
		double trueTip = Tip/100;
		double tax = TotalPrice*0.0975;
		double REALTIP = TotalPrice*trueTip;
		double TOTAL = TotalPrice+tax+REALTIP;
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("                "+Restraunt + " - Menu For Today");
		System.out.println("==================================================");
		System.out.println("Owner: " + Name);
		System.out.println("--------------------------------------------------");
		System.out.println("Item                 Qty    Price                 ");
		System.out.println("--------------------------------------------------");
		System.out.println(Item1+"                    "+Amount1+"      "+Price1*Amount1);
		System.out.println(Item2+"                    "+Amount2+"      "+Price2*Amount2);
		System.out.println(Item3+"                    "+Amount3+"      "+Price3*Amount3);
		System.out.println("--------------------------------------------------");
		System.out.println("Subtotal:                   "+(TotalPrice));
		System.out.println("Tax (9.75%):                "+tax);
		System.out.println("Tip:                        "+Tip+"%");
		System.out.println("Tip Amount ("+Tip+"%):          "+(TotalPrice*trueTip));
		System.out.println("==================================================");
		System.out.println("TOTAL:                     $"+TOTAL);
		System.out.println("==================================================");
		System.out.println("");
	}
}
