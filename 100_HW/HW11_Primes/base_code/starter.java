
import java.util.Scanner;

class starter {
	public static boolean checkPrime(int a){
		if(a<=1){
			return false;
		}
		int c = 2;
		while(c*c <= a){
			if(a % c == 0){
				return false;
			}
			c++;
		}
		return true;
	}
	public static void printPrimes(int a){
    int count = 2;
    	while(count < a){
        	if(checkPrime(count)){
            	System.out.println(count + " is a prime number! ");
        	}
        	count++;
    	}
	}	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer to check if its prime: ");
		int input = sc.nextInt();
		printPrimes(input);
	}
}
