package day11_Switch;

public class NameNumberTernary {

    public static void main(String[] args) {
// Write a program that can convert numbers 0~9 to words.
//    NOTE: MUST use ternary
        int n  = 2;
       

            String result = (n >= 0 && n <= 9)?(n == 1)? "One" : (n == 2)? "Two" : (n ==3)? "Three" :
                    (n == 4)? "Four": (n == 5)? "Five" : (n == 6)? "Six" :
                            (n == 7)? "Seven" : ( n == 8)?  "Eight" : "Nine" : "Invalid world";

        System.out.println(result);



    }
}
