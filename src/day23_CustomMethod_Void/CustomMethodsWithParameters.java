package day23_CustomMethod_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        oddOrEven(15);  //  the method demands additional information to complete its task
        //  when you  call  the method with argument  you  need to put your argument
        System.out.println("=========================");
        ageOfPerson(1983); //  the parameter must be matched with data type

        System.out.println("=======================");

        allNumbers(3,8);
    }

    //  creat function  that can check  if the number odd or  even number?
    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }


//  create  a function  that can  display  the age of person ====>  ageOfPerson
    //  we must  know    the DOB

    public static void ageOfPerson(int birthYear) {
        int age = 2021 - birthYear;
        System.out.println("Your age  is: " + age);


    }


    // create  function that can print all the numbers between  x  and y
    public static void allNumbers(int x, int y) {
        for (int i = x; i < y; i++) {
            System.out.print(i + " ");
        }

    }
}