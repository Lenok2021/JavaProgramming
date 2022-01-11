package day09_IfStatement;

public class MedianNumber {
    public static void main(String[] args) {
        /*
        Create a class called MedianNumber.
        write a program that can find the median number between three DIFFERENT given integers
                       Ex:
                a = 10, b= 15, c = 20;
            Output:
                15 is the median number
        we have 3 possibility:
         possibility#1 - a could be median number
         possibility#2 - b could be median number
         possibility#3 - c could be median number

         */

        int a = 10,
                b = 15,
                c = 20;
        //if(a < b && a >c)  short way

        boolean aIsMedian = a > b && a < c;
        //  or ( a>b && a<c) || (a>c && a<b) because in the future if we dont know the value of a, b, c
        //  or your  we have 3 numbers and one number MUST  be max,  one number MUST be min, one number MUST be median

        //               if b=15, a=20, c =10    b=15, a=10, c=20 // if a = 15, b, c
        boolean bisMedian = (b > c && b < a) || (b > a && b < c); //  we have to posib. if  a is median number
        boolean cisMedian = !aIsMedian && !bisMedian;
        if (aIsMedian) {
            System.out.println(a + " is a Median number");
        }

        if (bisMedian) {
            System.out.println(b + " is a Median number");
        }
        if (cisMedian) {

            System.out.println(c + " is a Median number");
            /*
            In order for a to be the maximum number:
            1. ic c is the max & b is the min num, then a is a med
            2. if b is the max num & c ic the min num, then a is the med. num

             */
           // if we have 3 different numbers, one MUST max, one MUST be min, one MUST be median
// TASK   in order b to be the median number
          // in order c to be median number


        }
    }

}


