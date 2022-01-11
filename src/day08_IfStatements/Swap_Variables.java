package day08_IfStatements;

public class Swap_Variables {
    public static void main(String[] args) {
        /*
        write a program that can swipe two variables'
        value by  NOT using a temporary variable
		    Ex: if a= 10, b=15
		    output: a = 15, b = 10
		                         */

        int a = 10, b=15;
        a+= 5;
        b-= 5;
        System.out.println( "a = " + a);
        System.out.println( "b = " + b);

    }
}
