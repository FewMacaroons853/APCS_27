
import java.util.*;
import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = (int)(Math.random()*3+1);
        System.out.println("Rock, Paper, Scissors!");
        System.out.println("");
        System.out.print("Enter Rock, Paper, or Scissors: ");
        String rps = sc.nextLine();

        if (num == 1) {
            System.out.println("Computer chose Rock.");

            if (rps.equalsIgnoreCase("Rock")) {
                System.out.println("Tie!");
            } else if (rps.equalsIgnoreCase("Paper")) {
                System.out.println("You win!");
            } else if (rps.equalsIgnoreCase("Scissors")) {
                System.out.println("Computer wins!");
            }
        }

        else if (num == 2) {
            System.out.println("Computer chose Paper.");

            if (rps.equalsIgnoreCase("Rock")) {
                System.out.println("Computer wins!");
            } else if (rps.equalsIgnoreCase("Paper")) {
                System.out.println("Tie!");
            } else if (rps.equalsIgnoreCase("Scissors")) {
                System.out.println("You win!");
            }
        }

        else if (num == 3) {
            System.out.println("Computer chose Scissors.");

            if (rps.equalsIgnoreCase("Rock")) {
                System.out.println("You win!");
            } else if (rps.equalsIgnoreCase("Paper")) {
                System.out.println("Computer wins!");
            } else if (rps.equalsIgnoreCase("Scissors")) {
                System.out.println("Tie!");
            }
        }
    }
}
