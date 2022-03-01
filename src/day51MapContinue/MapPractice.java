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

        //2. keep insertion order, accepts null values as a Key
        Map<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(10,"Elena");
        map2.put(20,"Layan");
        map2.put(3,"Jack");
        map2.put(30,"Anastasia");
        map2.put(7, "Tommy");
        map2.put(40,"Alex"); //alex was removed
        map2.put(40,"Izabella");//Izabella replaced Alex
        map2.put(null,"Cihad");
        System.out.println("map2 = " + map2);

        System.out.println("-------------------------------------------------------------");


        //3. keep sorted order, DOES not accept null values as KEY
        //SORTED  BY KEY!!!!!!!!!!!!!!
        //  if key == NULL  ==>>>>> NULL POINTER  EXCEPTION!!!!!!!!!!
        // value  can NULL!!!!!
        Map<Integer, String> map3 = new TreeMap<>();
        map3.put(10,"Elena");
        map3.put(20,"Layan");
        map3.put(3,"Jack");
        map3.put(30,"Anastasia");
        map3.put(7, "Tommy");
        map3.put(40,"Alex"); //alex was removed
        map3.put(40,"Izabella");//Izabella replaced Alex
        //map3.put(null,"Cihad"); // NULL POINTER  EXCEPTION!!!!!!!!!!
        map3.put(4, null);

        System.out.println("map3 = " + map3);

        //4. Synchronized, keep random order, DOES not accept null as Key  and  as VALUE
        Map<Integer, String> map4 = new Hashtable<>();
        map4.put(10,"Elena");
        map4.put(20,"Layan");
        map4.put(3,"Jack");
        map4.put(30,"Anastasia");
        map4.put(7, "Tommy");
        map4.put(40,"Alex"); //alex was removed
        map4.put(40,"Izabella");//Izabella replaced Alex
        //map4.put(null,"Cihad"); // NULL POINTER  EXCEPTION!!!!!!!!!!
        //map4.put(4, null);

        System.out.println("map4 = " + map4);










    }



}
