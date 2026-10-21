/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	String message = "im glad i got a good grade on quiz 3";
	String encoded = Cipher.keyedEncode(message, 5);
	System.out.println(encoded);
	}
}

