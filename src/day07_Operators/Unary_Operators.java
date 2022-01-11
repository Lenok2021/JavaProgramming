package day07_Operators;

public class Unary_Operators {
    public static void main(String[] args) {
         int num1 = 25;
         int num2 = -25;
        System.out.println( num1 < 0);
        System.out.println( num2 < 0);

        System.out.println("________________");

        int a = 5;
        ++a; // pre increment increase value by one immidiatly
        System.out.println(a); //6

        --a; //
        System.out.println(a); // 5

        System.out.println("___________");

        int b  = 100;

       // post decrement; first passes the current value, then  decreases the value by 1
        int c = 100;
        System.out.println(c++);
        System.out.println(c);// 101


        System.out.println("_________");
        int x  = 200;
        System.out.println(--x); // pre decrement


        int y  = 200;
        System.out.println(y--); // post decrement`: has to steps
        System.out.println(y);
        System.out.println("_________________");

        int z  =45;
        System.out.println(++z); // pre increment  46, after this line Z=46

        System.out.println(z++); // post  after this lina z=47
        System.out.println(z);


        int q = 30;
        System.out.println(--q);// pre decrement // 29
        System.out.println(q--); // post decrement //29
        System.out.println(q); //28


    }
}
