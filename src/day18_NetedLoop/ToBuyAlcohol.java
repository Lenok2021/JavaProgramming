package day18_NetedLoop;
import java.util.Scanner;
public class ToBuyAlcohol {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {

            System.out.println("Enter you age:");
            int age = scan.nextInt();

            // assume that the valid age is between 1~120

            while (!(age >= 1 && age <= 120)) {// while the age is invalid
                System.err.println("Invalid Entry, Please re-enter your age:");
            }
            System.out.println("would you like to continue?");
            String a= scan.next().toLowerCase();

            while(!(a.equals("yes")||a.equals("no"))){ // while the answer is invalid
                System.out.println("Invalid Entry, Please re-enter, Would you like to continue?");
                a= scan.next().toLowerCase();
            }

            if (a.equals("no")){ // this if statement is given within the outer loop.
                break;
            }





        }







        scan.close();

    }

}
