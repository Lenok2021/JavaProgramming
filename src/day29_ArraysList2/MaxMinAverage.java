package day29_ArraysList2;
import  java.util.ArrayList;
public class MaxMinAverage {

    public static void main(String[] args) {


        // we assume  that  first number  is  max number and  we compare
        // max  number with   other numbers  in Array list
        //  we need  to get  access  to each element in AL  we  use For Each Loop
         // if  grater then current max number i can  assign to  variable max
        //  average number  =  find sum af all numbers,  than sum/ size
        //  i  can get  decimal number (result)
        //  i have  int,  int/ int = int result
        // to make  sure  to make  sure  to get  decimal result = convert to double

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println(list);

        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;

        for (Integer each : list) {
            if(each > max){
                max = each;
            }

            if(each < min){
                min = each;
            }

            sum += each;

        }

        double average =  (double)sum / list.size();  // convert to  double

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average);




    }



}
