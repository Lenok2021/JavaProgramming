package day41_Exceptions;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {

// unchecked
         int a  = 10;
         int b = 0;  //  in Java  and Math  the danamitator cannot b=0

       // System.out.println( a/b );
           //  the compiler cannot  check  Exp.  when  I write code
          // but  when I run code I get Exp
         // Exp.  that  you get in RunTime = unchecked Exp.
        // if I did not fix it  I will not able to
        //  Unchecked Exp.  crash  you  code
        // you will not able no get execution of next code
        System.out.println("Hello");

        char[] characters = {'A','B','C'};
        // max index number    0,  1,  2
        //System.out.println(characters[99]); //  the compiler cannot check during compile time
        // we have another Object Exceptions (ArrayIndexOutOfBoundsException)
        // if you Hava  to handle it, otherwise, you will not able to run you code
    }
}
