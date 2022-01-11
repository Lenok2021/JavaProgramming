package day09_IfStatement;

public class MinNumber {
    public static void main(String[] args) {
         /*
       Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal
            Ex:  n1= 100, n2 = 200;
            output:
                100 is the minimum number
              we have 3 conditions:
               possibility n1isMin = n1<n2
               possibility n2isMin = n2<n1
               possibility equal  = n1 == n2
        */

        int n1 = 100, n2 = 200;
        boolean n1isMin = n1 < n2;
        boolean n2IsMin = n2 < n1;
        boolean equal = n1 == n2;
        if (n1isMin) { // is n1 is  a minimum number
            System.out.println(n1+ " is minimum number");

        }
        if(n2IsMin) { // if n2 is a minimum number
            System.out.println(n2+ " is minimum number");
        }
        if(equal){
            System.out.println("Equal");
        }

        }




    }



