package day17_WhileAndDoLoop;

import java.util.Scanner;

public class WillYouMaryMe {

    public static void main(String[] args) {

        /*
        Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer,
     please re-enter"
    and repeat it until the user enters either yes or no

         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me. Yes or no?");
        String answer = scan.nextLine();


        while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer, please enter Yes or No");
            answer = scan.next();
        }

        if (answer.equals("yes")) {
            System.out.println("Congratulation");
        } else {
            System.out.println("Goodbye");
        }

        scan.close();

    }
}
