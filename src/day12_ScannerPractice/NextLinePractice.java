package day12_ScannerPractice;
import java.util.Scanner;
public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // has  Enter

        System.out.println("Enter  your age");
        int age = input.nextInt(); //  ignor  enter key  and enter key  still left in Scanner

        input.nextLine(); //

        System.out.println("Enter  your full name");
        String fullName = input.nextLine(); //  takes all  from Scanner  you will get


        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);

        System.out.println("GPA");
        double gpa = input.nextDouble();

        input.nextLine(); //

        System.out.println("School name");
        String schoolName = input.nextLine();
input.close();






    /*
    1. ask  the user  to enter  age (netInt());
    2. Ask the user  to  enter full name ((nextLine());
     */



    }

}
