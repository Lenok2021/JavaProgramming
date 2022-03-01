package day51MapContinue;

import java.util.*;

public class MapPractice {

    public static void main(String[] args) {

        //1. THE  FASTEST, keep random order, accepts null value
        // random order = if you add first pair there is no guarantee it would be first
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(10,"Elena");
        map1.put(20,"Layan");
        map1.put(3,"Jack");
        map1.put(30,"Anastasia");
        map1.put(7, "Tommy");
        map1.put(40,"Alex"); //alex was removed
        map1.put(40,"Izabella");//Izabella replaced Alex
        map1.put(null,"Cihad");

        //the  Key  Must be unique
        // the values can be duplicated
        // if Key is duplicated the last inserted pair will be appeared
        // we can have DIFFERENT key  but  SAME  value
        System.out.println("map1 = " + map1);

        System.out.println("--------------------------------------------------------------");

        //2. keep insertion order, accepts null values
        Map<Integer, String> map2 = new LinkedHashMap<>();
        map1.put(10,"Elena");
        map1.put(20,"Layan");
        map1.put(3,"Jack");
        map1.put(30,"Anastasia");
        map1.put(7, "Tommy");
        map1.put(40,"Alex"); //alex was removed
        map1.put(40,"Izabella");//Izabella replaced Alex
        map1.put(null,"Cihad");
        System.out.println("map2 = " + map2);

        System.out.println("-------------------------------------------------------------");


        //3. keep sorted order, does not accept null values
        Map<Integer, String> map3 = new TreeMap<>();

        //4.
        Map<Integer, String> map4 = new Hashtable<>();






    }



}
