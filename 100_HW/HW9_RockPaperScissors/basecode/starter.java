/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    static Scanner sc = new Scanner(System.in);


    public static String getObject(){
        int roll = (int)(Math.random()*3);

        if(roll == 0){
            return "rock";
        }
        else if (roll == 1){
            return "paper";
        }
        else{
            return "scissors";
        }
    }
        public static int compare2(String p1, String p2) {
        if (p1.equals(p2)) {
            return 0;
        }
        if ((p1.equals("rock") && p2.equals("scissors"))
                || (p1.equals("paper") && p2.equals("rock"))
                || (p1.equals("scissors") && p2.equals("paper"))) {
            return 1;
        }
        return 2;
    }
    public static void main(String[] args) {
       
    while(true){
        System.out.print("Would you like to play the computer? (Yes/No/Done): ");
        String choice = sc.nextLine();
        if(choice.equalsIgnoreCase("done")){
            System.out.println("Thanks for playing. Goodbye!");
            break;
        }
        else if(choice.equalsIgnoreCase("yes")){
            playGame();
        }
        else if(choice.equalsIgnoreCase("no")){
            cvc();
        }
        else{
            System.out.println("Please type yes, no, or done.");
        }
    }
}
    public static void playGame(){
        String playerChoice;
        System.out.println("----------------------------------------");

        while(true){
            System.out.println("Choose rock, paper or scissors.");
            playerChoice = sc.nextLine();
            if(playerChoice.equalsIgnoreCase("rock")
                || playerChoice.equalsIgnoreCase("paper")
                || playerChoice.equalsIgnoreCase("scissors")){
                break;
            }
            System.out.println("Thats not a valid choice try again.");
        }
        String cc = getObject();

        System.out.println("");

        System.out.println("You chose " + playerChoice);
        System.out.println("The computer chose " + cc);

        int result = compare2(playerChoice, cc);

        if(result == 0){
            System.out.println("It was a tie!");
        }
        else if(result == 1){
            System.out.println("You win!");
        }
        else{
            System.out.println("You lose!");
        }
        System.out.println("----------------------------------------");
    }
    public static void cvc(){
        int rounds;
        System.out.println("----------------------------------------");
      

        while(true){
            System.out.println("How many times should the computer play against itself?");
            rounds = sc.nextInt();
            break;
        }
        int p1wins = 0;
        int p2wins = 0;
        int ties = 0;
        int count = 0;

        while(count != rounds){
            String p1 = getObject();
            String p2 = getObject();

            int result = compare2(p1,p2);

            if(result == 0){
                ties++;
                count++;
            }
            else if(result == 1){
                p1wins++;
                count++;
            }
            else{
                p2wins++;
                count++;
            }
        }
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("Player 1 wins: " + p1wins);
        System.out.println("Player 2 wins: " + p2wins);
        System.out.println("TIes: " + ties);

        System.out.println("");
        System.out.println("----------------------------------------");
    }
}