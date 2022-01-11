package day30_CustomArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveMethodToTheEnd {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        System.out.println(numbers);

        int size = numbers.size(); //  i  have size
        // how remove  all  zeros
        // we know elements
        numbers.removeAll(Arrays.asList(0)); //  remove all zeros
        System.out.println(numbers);
        // how  to know how many 0  i removed

        int newSize = numbers.size();  //  without 0
        int totalNumberZeros = size-newSize;
        System.out.println(totalNumberZeros);




        for(int i =0; i<totalNumberZeros; i++){
            numbers.add(0);
        }
        System.out.println(numbers);



    }
}
/*
Write a program that can move all the zeros to the last indexes
of ArrayList
                    Ex:  list: {1,0,2,0,3,0,4,0}
                    output:   [1, 2, 3, 4, 0, 0, 0, 0]
                    DO  NOT CREATE ADDITIONAL ARRAYLIST
 */