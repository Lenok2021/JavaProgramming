package day06_PrimitiveTypesCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("12" + 1);//  concatenation
        System.out.println(10 + 30); // addition
        System.out.println(100 - 50); //subtraction
        System.out.println(100 * 2);// multiplication



        System.out.println(100/3); //33 in Java
        System.out.println(10.0/4);// 2// but if you want max result use 10.0  OR double
        System.out.println(10/ 4.0);
        System.out.println(10d/4); //IF we wanna get max. number (decimal result) we can add D or d  after the number


        int a = 100;
        double b = a/6; // a and 6  are integer numbers you will get
        // 16 and then 16 will be assighned to double and you will get 16.0

        System.out.println(b);
        System.out.println("__________________");

        double c  = a/6.0;
        double d = a/6d;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

         


    }


}


/*
+: addition
-: subtract
*: multiplication
/: division
   in math:
   10/4  (divided 10 by 4) = 2.5
   100/3 = 33.3333...

   in Java:
   10/4 = 2
   10.0 /4=2.5
   100/3 = 33


integer / integer  = integer
decimal / integer = decimal
integer / decimal = decimal
decimal / decimal = decimal

 */