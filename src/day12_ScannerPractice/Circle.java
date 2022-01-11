package day12_ScannerPractice;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius for the circle");

        double r = input.nextDouble();

        double area = r * r * 3.14;
        double perimeter = 2 * r * 3.14;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
        input.close();

        String hh = "java";
        String hhn = new String("jav");
        String s1 = "a";


    }
}