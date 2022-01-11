package day12_ScannerPractice;

import java.util.Scanner;

public class Scanner_Practice2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       // System.out.println("True or False");

       // boolean result = input.nextBoolean(); // you can you use when  user ask or false
        // EX.  0==0, you  can enter  only true of fauls

        System.out.println("Enter your name");
        String name = input.next(); // java
        System.out.println("Java");

input.close();
    }

}
