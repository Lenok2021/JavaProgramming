package day07_Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;

        int division = num1/num2;// division variable contains the result of num1 divided by num2
        int remainder = num1%num2; // remainder variable contains the remainder of num
        // 10 divide by 3 equal to 3 with a remainder of num1 divided by

        System.out.println(num1 +" divided by " + num2 + " is equal to " + division + " with a remainder of " + remainder);

    // Ex. what is the remainder of 25 divided 4
        System.out.println( 25 % 4 );

    }

    public static class LogicalOperators {
        public static void main(String[] args) {
            // we want to check is the member eligible to vote

             String name = "Elena";
             int age = 19;
             String  citizenStatus = "USA";
             boolean isEligible = age >= 18 && citizenStatus == "USA";
                               // analyze:



            System.out.println(name + " is eligible to vote " + isEligible);


        }
    }
}
