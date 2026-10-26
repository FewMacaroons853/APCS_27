/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.raiseSalary(50);
		dwight.employeeToString();

		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();

		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.employeeToString();

		Employee aiden = new Employee(2012, "Aiden", "Chun", 5000);
		aiden.raiseSalary(10);
		aiden.employeeToString();
	}
}
