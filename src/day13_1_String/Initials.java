package day13_1_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter  you  first name");
        String firstName = scan.next();

        System.out.println("Enter  you  last  name ");
        String lastName = scan.next();

        char f = firstName.charAt(0);

        char l = lastName.charAt(0);
         String initial = ""+ f+ "." +l; //  how to convert  char  to  String;
        System.out.println("initial = " + initial);






    }
}
