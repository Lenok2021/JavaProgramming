package day12_ScannerPractice;

import java.util.Scanner;

public class ShippingAddressAll_Scanner_Methods {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();


        System.out.println("Enter you building number");
        String building = scan.next();

        scan.nextLine();

        System.out.println("Enter your street name");
        String street = scan.nextLine();

        System.out.println("Enter  your city name");
        String city = scan.nextLine();

        System.out.println("Enter  your state");
        String state = scan.next();

        System.out.println("Enter  your Zipcode");
        String zipcode = scan.next();


        scan.nextLine();

        System.out.println("Enter  your country name");
        String country = scan.nextLine();

scan.close();




        /*

        enter  your full name = nextLine();
        building number  = next(); !!!!!!
        street name = nextLine();
        your city name = nextLine()
        state  = next()
        Zip code = next()

        Display  a shipping address
         */


    }


}
