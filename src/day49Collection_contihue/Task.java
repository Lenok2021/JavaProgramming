package day49Collection_contihue;

import homework.Array;

import java.util.*;

public class Task {

    public static void main(String[] args) {

        //1. Example
        // we don't need to use Loop  and if conditions
        // what if  I want to remove duplicates and keep  the same order
        Integer[] nums = {1, 1, 1, 2, 3, 3, 3, 4, 2, 1, 2, 6, 7, 8};

        //new LinkedHashSet<>( nums  );  // we cannot  BC the Conc. accept the Collection type
        // we use ArrayasList method

        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);
        // (new Integer[0])  since the size is fixed we use [0]
        System.out.println(Arrays.toString(nums));

        System.out.println("====================================================");
        
        String str = "aaaabbbbccccdddeeeee";
        String result = "";  //a4b4c4d3e5
        // I can convert str to collection type
        // Then I  can find frequency 
        //I have to use LinkedHashSet
        // we have to create Array from String

        for (String each  : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
           int count  =  Collections.frequency(   Arrays.asList(str.split("")), each);
            result+=each+count;
                        
        }
        System.out.println("result = " + result);

        System.out.println("---------------------------------------------------------------");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Elena", "Elena","Anna"));
        System.out.println( names.toArray( new String[0]) [2]);

        System.out.println(  new ArrayList<>(names).get(3));


        

    }
}
