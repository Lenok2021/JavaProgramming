package day13_1_String;


import java.util.Scanner;

public class String_Method {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  your full name");
        String name = input.nextLine(); // wooden spoon

        System.out.println("Enter your Pragramming Lang");
        String programming = input.nextLine();

        System.out.println("Enter  age");
        int age = input.nextInt();// 24 enter

        input.nextLine();//!!!!!!!!!!!!!!!!!

        System.out.println("enter school name");
        String school = input.nextLine();

        System.out.println("name = " + name);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("school = " + school);

    }
}
