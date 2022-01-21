package day41_Exceptions;

public class TryCatchBlock {

    public static void main(String[] args) {


        System.out.println("Test started");

        try {

            System.out.println(9 / 0);

            System.out.println("Try block");

        }catch (ArithmeticException e){  // we need to put right Class

            System.out.println("Catch black");

            System.out.println("Arithmetic Exception  was occurred");
        }



          //  after 9/0  the  program   will be terminated
         // we need try catch block
        //  after  I handled my Exception I can complete my task
        System.out.println("Test Completed");


        System.out.println("===================================================");

        System.out.println("Test2 started");


        int[] numbers = {1,2,3,4,5};


        try{
            System.out.println(numbers[200]);

            System.out.println("Try block");

        }catch( RuntimeException e){ //  what if I don't know  what the Exception??
              //  put  Parent RuntimeException
             // e.printStackTrace();  if i  want  to have full detailed report about Exception
            //  IN  THE  FUTURE  I GONNA  DO IT automation Class

            System.out.println( e.getMessage());  //  if  i  want only Exception message


        }



        System.out.println("Test2 completed");





    }
}
