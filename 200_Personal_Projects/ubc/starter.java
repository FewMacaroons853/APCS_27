
import java.util.*;
import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double total = 0;
        System.out.print("How many grades will you enter today?");
        int gradecount = sc.nextInt();

        while (count < gradecount){
            System.out.print("Enter a grade: ");
            double grade = sc.nextDouble();

            System.out.println("");
            total = total+grade;
            
            count = count+1;
        }
        System.out.println("");
        double average = (total/count);
        System.out.println("Your average of grades is " + average);
    }
}
