package day43_Abstruction;

import java.util.Scanner;

public class Trow_vs_Throws {

    public static void main(String[] args) {

        System.out.println("Enter your score:");
        int score = new Scanner(System.in).nextInt();
          if(score<0 || score >100){
              throw new RuntimeException("Invalid score: "+ score);
          }





    }


}
