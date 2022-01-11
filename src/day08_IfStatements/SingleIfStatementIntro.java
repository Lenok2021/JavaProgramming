package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        // task  if this number even number OR odd number
        // print only one statement
        // If number is odd  -  System.out.println("Odd number");
        // If the number is even - System.out.println("Even number");
        // I want only one statement must be executed
        //  what does it mean even = remaindor =0

        int number = 100;
        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = ! evenNumber;
        if (evenNumber) { // even number
            System.out.println(number + " is even Number");

        }

        if(oddNumber){ // not even number
            System.out.println(number + " not even number"); // or odd number
        }

        System.out.println("_______________________");

      // positive, number = 10
      int number1 = 10;
      boolean ifPositive = number1 > 0;
      boolean ifNegative = number1< 0;
      boolean ifEqualZero = number1 == 0;
      if(ifPositive){
          System.out.println(number1 + " is a positive number " + ifPositive);
      }
      if(ifNegative){
          System.out.println(number1 + " is a negative number " + ifNegative);
      }
       if(ifEqualZero){
           System.out.println(number1 + " is a Zero " + ifEqualZero);
       }

        System.out.println(87%5/100);


    }

}
