/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr1 = new int[1000];
		int [] arr2 = new int[1000];
		int x = 0;
		int y = 3;
		while(x<1000){
			arr1[x] = y;
			y+=3;
			x++;
		}
		x = 0;
		while(x<1000){
			System.out.print(arr1[x] + ", ");
			x++;
		}
		System.out.println("--------------------------------------------------------");
		int b = 0;
		int c = 1000;
		while(b<1000){
			arr2[b] = c;
			c-=1;
			b++;
		}
		b = 0;
		while(b<1000){
			System.out.print(arr2[b] + ", ");
			b++;
		}
	}
}
