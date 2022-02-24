package day49Collection_contihue;

import java.util.*;

public class SetPractice2 {
    public static void main(String[] args) {

        // what if the requirement was to remove duplicates
        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper Towels"};

        /*
        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        // we added as Array List, BC  this method converts Array  to collection type
        arr = set1.toArray(new String[0]);  // we can convert from collection to Array
        System.out.println(set1);
        */
        arr = new LinkedHashSet<>( Arrays.asList(arr) ).toArray(new String[0]); // the fastest way

        //  why  we still  need  to Array method, BC Array is the fastest way
        // supports primitives

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 600, 10, 10, 10, 30, 40, 40));
        // we don't use loop  we  use set
        // if  I need  to keep same order

        list = new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println(list);

        System.out.println("------------------------------------------------------");

        String[] array = {"A", "B", "C", "B"};
        Set<String> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(array));

        String[] array1 = {"A", "B", "C", "B"};
        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(array1));

        // the constructor of each collection accepts collection type
        //  we use  Array as List method, to convert Array to Array List


    }


}
