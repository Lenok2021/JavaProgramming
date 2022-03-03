package day52Map_Continue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindUniqueCharactersMap {


    public static void main(String[] args) {

        String  str = "aabcccdeeeef";

        Map<String, Integer> result = new LinkedHashMap<>();

        // find the F  takes nested loop
        // we can use Map to find F.
        // 1. Convert String to Array
        // 2. Convert Array to Collection type, by using Arrays.asList method

        String [] arr = str.split("");
      //  to get access to each element = for each loop

        for (String each : arr) {

           int frequency = Collections.frequency(Arrays.asList(arr), each);
            // Collections.frequency  = method accept coll type that's why we convert arr to collection type

            if(frequency ==1){
                result.put(each,1);  //  if condition == 1 we passed 1
            }
            System.out.println("result = " + result);


        }



    }






}

/*
1. Write a program that can find the unique characters from a String

            Ex:
                    str = "aabcccdeeeef";

            output:
                    {b=1, d=1, f=1}

2. Go to B25 Github Organization -> JavaProgramming -> src -> Package day52_Map_FunctionalInterface -> ListOfMapPractice1.
        Complete all the given task requirements

 */