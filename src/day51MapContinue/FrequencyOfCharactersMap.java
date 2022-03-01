package day51MapContinue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharactersMap {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";

        //when  we add multiple character we do not worry about dunplicates
        // map does not accept them
        // Collection.frequency(  accept  collection type)

        Map<String, Integer> result = new LinkedHashMap<>();// {b=2, c=3, a=5}

        //1.  convert String to Collection type
        String arr[] = str.split("");

        for( String each : arr ){
            result.put(each, Collections.frequency(Arrays.asList(arr), each));

        }
        System.out.println("result = " + result);

    }


/*
Write a program that can return the frequency of characters
        Not: MUST use map

        Ex: str = "bbcccaaaaa"

        output:
            {b=2, c=3, a=5}


 */


}
