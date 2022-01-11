package day09_IfStatement;

public class PosNegZero {
    public static void main(String[] args) {
        int n  = 100;
                ;
        if(n >0) {
            System.out.println("Positive");
        }
        if(n < 0);{

            System.out.println("Negative");
        }
        if(n == 0) {
            System.out.println("Zero");
        }

        System.out.println("___________");
        boolean positive = n > 0;
        boolean negative = n < 0;

        if(n > 0){  // only one block
            System.out.println("Positive");
        }else if(n<0){ // many blocks, depends on tasks
            System.out.println("Negative");

        }else{ // only one block
            System.out.println("Zero");
        }
        // 12
        // one - if,
        // 10 else if,
        // 1 else
        // only one statement will be printed

    }

}
