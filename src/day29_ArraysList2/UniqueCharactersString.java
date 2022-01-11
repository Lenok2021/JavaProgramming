package day29_ArraysList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharactersString {

    public static void main(String[] args) {

        String str = "aaabcccdeeefgggggggghiiiiiiiiijkkkkkkkkkl";

        String[] arr = str.split("");  // convert  to Array

        ArrayList<String> list = new ArrayList<>( Arrays.asList(arr) ); //  convert  to  arrayList

        System.out.println("list = " + list);

        String unique = "";

        for (String each : list) {
            int frequency =  Collections.frequency(list, each);
            if(frequency == 1){
                unique += each;
            }
        }


        System.out.println("unique = " + unique);



    }
}
