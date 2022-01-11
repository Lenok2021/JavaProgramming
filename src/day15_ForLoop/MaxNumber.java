package day15_ForLoop;
import java.util.Scanner;
public class MaxNumber {
    public static void main(String[] args){
        //write  the program that  ask  user  enter
        //  number  5 time  and program
        //  ant return  a  max number
        Scanner scan = new Scanner(System.in); //  scanner  must  be  inside the LOOP if
        //  you   wanna it  should be repeated
         int max = -2147483648; // any  user  entered number  will  be greater than  - 2147483648



        for(int i = 0; i<5; i++){
            System.out.println("Enter a number");
            int num = scan.nextInt(); // 1, 2 , 3 , 4 , 5

            if(num > max){ // if  the user  enter number is greater than current maximum  number
                max = num;
            }
        }
        System.out.println("max = " + max);

        scan.close();

    }


}

