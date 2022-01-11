package day07_Operators;

public class Relational_Operators {

    public static void main(String[] args) {
        
        // only for BOOLEAN data type
        
        // <, >=, <, <=  ONLY  FOR  NUMBERS!!!!!!!!!!!!!!!!!!

        //>=  has two conditions

        
        boolean result1 = 200 > 40; // true
        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150; // true
        System.out.println("result2 = " + result2);

        boolean result3 = 100 >=100; // true
        System.out.println("result3 = " + result3);

        boolean result4 = 300 >=500; // false
        System.out.println("result4 = " + result4);

        // you want to apply for the loan
        // credit score of 720
        int score = 745;
        boolean isEligibleForLoan = score>= 720; // if the credit score is 720 or greater , then it's eligible for the loan


        boolean result5 = 100<200; // true
        System.out.println("result5 = " + result5);

        boolean result6 = 200 < 180; // false
        System.out.println("result6 = " + result6);

        int score2 = 75;
        boolean hasFailed = score2 <= 59; // false
        System.out.println("hasFailed = " + hasFailed);
        
        boolean result7 = 45 <= 60; // true
        System.out.println("result7 = " + result7);


        System.out.println("____________________");

        // Equal "=="
        // not equal "!="
         int r = 100;
         int t = 200;
         boolean equal = r == t; // false
        System.out.println("equal = " + equal);

        boolean result9 = 'A' == 'a'; // false
        System.out.println("result9 = " + result9);
        
        boolean result10 = "Java" == "Java";
        System.out.println("result10 = " + result10);

        // BUT
         boolean result11 = "Hello" == "    Hello";// space there is space!!!!!!
        System.out.println("result11 = " + result11); // false
        
        boolean result12 = 100!=200; // true  Q:  ARE  they NOT equal each other????

        System.out.println("result12 = " + result12);

        boolean result13 = "Java" != "Break"; // true

        System.out.println("result13 = " + result13);

        boolean result14 = 300 != 300; // false
        System.out.println("result14 = " + result14);



                        













        
        
    }
}
