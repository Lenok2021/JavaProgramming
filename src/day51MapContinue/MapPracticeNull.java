package day51MapContinue;

import java.util.*;

public class MapPracticeNull {


    public static void main(String[] args) {


        Map<Integer, String> map1 = new HashMap<>();
        map1.put(null,"Elena");
        map1.put(20,null);


        System.out.println("map1 = " + map1);

        System.out.println("--------------------------------------------------------------");


        Map<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(null,"Elena");
        map2.put(20,null);

        System.out.println("map2 = " + map2);
        System.out.println("-------------------------------------------------------------");


        Map<Integer, String> map3 = new TreeMap<>();
        map3.put(8,"Elena");
        map3.put(20,"gogog");

        System.out.println("map3 = " + map3);


        Map<Integer, String> map4 = new Hashtable<>();
        map4.put(1,"Elena");
        map4.put(20,"po");

        System.out.println("map4 = " + map4);





    }
}
