package day20_Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

         //  if you know elements  use  this array
        // store ten elements: 10,20,30, 70;
        int[] numbers = {10,20,30,70}; // size is for
        System.out.println(Arrays.toString(numbers));
        System.out.println("________________________________");


         //  if you have  number but don't know which are those
        // create variable that can contain 5 scores

        int [] score = new int [5]; // 5 is length [0,0,0,0,0,]
        score [1] = 85;  //if [0,85......]
        score[score.length-1] = 95;  // [0, 0, 0, 0 95]
        score[3] = 75; // [0, 0, 0, 65, 0]
        score[0] = 65; // [65, 0, 0, 0, 0]
        score[2] = 55;// [0, 0, 55, 0, 0]
        System.out.println(Arrays.toString(score));//[65, 85, 55, 75, 95]

        System.out.println("______________________________");

        String[]months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November","December"};

       /* System.out.println(months[0]);
        System.out.println(months[1]);
        System.out.println(months[2]);
        System.out.println(months[3]);
        System.out.println(months[4]);
        System.out.println(months[5]);
        System.out.println(months[6]);
        System.out.println(months[7]);
        System.out.println(months[8]);
        System.out.println(months[9]);
        System.out.println(months[10]);
        System.out.println(months[11]);
        */

        for (int i = 0; i<= months.length-1; i++){ //i represents index number oa aarray starting from 0
            System.out.println(months[i]);
        }

        System.out.println("_________________________________________");
//  if we wanna ptint from 12  month to 1 month
        for (int i = months.length-1; i >=0 ; i--){// represents the index number of array starting from last index to first index
            System.out.println(months[i]);


        }




    }
}
