package day04_Variables;

public class PrimitivesIntro {


    public static void main(String[] args) {

        // INTEGER NUMBERS
        // age:  38 years old // 38 is within byte's range
        byte age = 38;
        // weight: 160 pounds // 160 is within the range of short' range
        // byte weight = 160; 160 is out of byte' range
        short weight = 160;
        // salary: 100000 $ // 100000 is out of short' range
        int salary = 100_000;
        // int data type is PREFERRED  for all integer numbers!!!!!!!
        // whenever you have INTEGER numbers (values) int data type is preferred by default
        // asset = 3_333_333_333is out of int' range
         long asset = 3_333_333_333L;
         /*!!!!!!  when you use long data type put "L" or "i" after the last character.
         since int date type is preferred data type far all integer digits in Java you will
         get compiler error.
          */

        //DECIMAL NUMBERS  - FLOATING POINT
        // tax: 0.26

        float tax = 0.26F;
        // double is the most preferred data type for all decimals!!!
        // PI: 3.14

        double PI = 3.14;


        // char  #

        char ch1 = '#';
        System.out.println("ch1 = " + ch1);
        char ch2 = 35;
        System.out.println("ch1 = " + ch1);
        char ch3 = 45000;
        System.out.println("ch3 = " + ch3);
        char ch4 = 'F';
        System.out.println("ch4 = " + ch4);

        boolean isEmploeed = true;
        boolean isMariied = false;
        boolean result = 500 > 300;
        System.out.println("isEmploeed = " + isEmploeed);
        System.out.println("isMariied = " + isMariied);
        System.out.println("result = " + result);


    String name = "Wooden Stone";
    String city = "Brooklyn";
    String state = "NY";
    String country = "USA";
        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);












    }


}
