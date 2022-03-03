package day52Map_Continue;

import java.util.LinkedHashMap;
import java.util.Map;

public class NestedMap {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new LinkedHashMap<>();// ID  +  jobTitle
        map1.put(11, "SDET");
        map1.put(12, "SM");
        map1.put(13, "BA");
        map1.put(14, "Developer");
        map1.put(15, "PO");

        Map<String, Integer> map2 = new LinkedHashMap<>();// ID  +  jobTitle
        map2.put("Elena", 120000);
        map2.put("Bob", 100000);
        map2.put("Job", 123000);
        map2.put("Sasha", 90000);
        map2.put("Anastasia", 120000);


        Map<Map<Integer, String>, Map<String, Integer>> mapOfMap = new LinkedHashMap<>();
        mapOfMap.put(map1, map2);
        // now  we have  Map as a Key,  and  Map as a value

        for (Map.Entry<Map<Integer, String>, Map<String, Integer>> mapMapEntry : mapOfMap.entrySet()) {

            // let;s  display job title
            for (Map.Entry<Integer, String> entry : mapMapEntry.getKey().entrySet()) {
                System.out.println(entry.getValue());
            }
             // let's  display names
            for (Map.Entry<String, Integer> entry : mapMapEntry.getValue().entrySet()) {
                System.out.println(entry.getKey());

            }

        }
            //  Each  Map  consume a lot of memory
           //  Map of Map  or  NestedMap  consume a lot of memory

    }


}
