package day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyWord {
    public static void main(String[] args) {


        System.out.println("Enter your age:");
        int age = new Scanner(System.in).nextInt();


        if(age<0){  // create  EX(problem) if age<0
           // System.err.println("Invalid age:");
          //  System.exit(1);
          // the better way to create Ex.
          throw new InputMismatchException("Age cannot be negative");
            //  we  create Object  from Class, we give new keyword
        }


        if (age>21){
            System.out.println("You are eligible");
        }else{
            throw new RuntimeException("You are must be at least 21 years old");
        }//  create EX. if the age <  21
        //  we can create throw+EX,  instead of Exist method

    }
}
