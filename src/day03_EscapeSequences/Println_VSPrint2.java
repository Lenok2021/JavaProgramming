package day03_EscapeSequences; // Package name of this class

import java.sql.SQLOutput;

public class Println_VSPrint2 {

    public static void main(String[] args) { // main method

        System.out.println("Khock Khock"); // first it prints Knock Knock, then it appends a new line
        System.out.println("Who is this?");

        System.out.println("This is Java");


        System.out.println("_______");

        System.out.print("Knock Knock");// first it appends Knock Knock, it does not append  a new line
        System.out.print("Who is this?");
        System.out.print("This is Java");

        System.out.println("");
        System.out.println("______________");

        System.out.println("Hello everyone, how are you all today? Today we will learn Escape Sequences, and next week we will learn Variables");

        System.out.println("___________");

        System.out.print("Hello everyone,");
        System.out.print("how are you all today?");
        System.out.print("Today we will learn Escape Sequences, ");
        System.out.print("and next week we will learn Variables ");

    }
}
/* the difference between
println
print
 */