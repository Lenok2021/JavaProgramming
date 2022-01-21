package day41_Exceptions;

import day39_Encapsulation_Inherintance_Recap.CydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {
    public static void main(String[] args) throws InterruptedException {

//1. unchecked Exception
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

        Student student=null; // no Object  was created
        // in order to use instance variable we need Object, but Object=null
        //System.out.println(  student.getName() );//NullPointerException



        String str = "Wooden Spoon";
        str = null; // now it's unreferenced Object, eligible for Garbage Collector

         //   System.out.println( str.toUpperCase()); // we got NullPointerException

        // but  if you  want to prevent your Object would not
        // be eligible for Garbage collection  give  FINAL keyword

        String str2 = "";  // str2 != null
        System.out.println( str2.isEmpty());


        // 2.  checked Exception,  occurs  during  compile time
        // you  run and see in Build OutPut

        System.out.println("Hello");

     //  Thread.sleep(3000);

        System.out.println("Cydeo");

       // FileInputStream file = new FileInputStream("path of the file");




    }
}
