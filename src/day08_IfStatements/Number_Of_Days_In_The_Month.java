package day08_IfStatements;

public class Number_Of_Days_In_The_Month {
    public static void main(String[] args) {
        /*
         Create a class called NumberOfDays,
         Write a program that can print the number of days in a month
            Ex:
                number = 1~12;
            output:
                31 Days
            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
         */
        int n = 4;
        boolean has28Days = n == 2;  // for month that has 28 days
        boolean has30Days = n == 4 || n == 6 || n == 9 || n == 11;// for the months that has 30 days
        boolean has31Days = !has28Days &&!has30Days;
        //boolean has31Days = n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12; //for the months that has 31 days


        if(has28Days){
            System.out.println("28 days");
        }
        if(has30Days){
            System.out.println("30 days");
        }
        if(has31Days){
            System.out.println("31 days");
        }




    }

}
