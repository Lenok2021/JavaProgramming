package day51MapContinue;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        //student name, score

        //1.  put()  method    size()  method - total number pairs in a Map
        Map<String, Integer> students = new LinkedHashMap<>();
        students.put("Elena", 90);
        students.put("Olga", 54);
        students.put("Bob", 67);
        students.put("Polina", 56);
        students.put("John", 77);
        students.put("Layan", 76);

        students.put("Ali", 76);
        students.put("Ali", 77);
        students.put("Ali", 78); //we have duplicated Key, The last one pair was accepted

        System.out.println("students = " + students);

        System.out.println(students.size());

        //2. get()  method,  provide  the key
        students.get("Elena");
        students.get(77);
        System.out.println(students.get("Elena"));

        //3. replace () method - replace value of specific key
        // replace the Bob score from 67 to 10000
        students.replace("Bob", 1000);

        System.out.println("students = " + students);

        //4. remove() method - size will be decreased
        // we can remove by pair = return type is boolean
        students.remove("Olga");
        System.out.println("students = " + students);

        //5. contains ()  method

        // containsKey() =>  returns boolean
        boolean a = students.containsKey("Muhtar");
        boolean b = students.containsKey("Elena");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // containsValue()
        boolean c = students.containsValue(2000);
        System.out.println("c = " + c);


        //6. Empty()
        boolean isEmpty = students.isEmpty();
        System.out.println("isEmpty = " + isEmpty);

        //7. equals

        Map<String, Integer> map1 = new HashMap<>(); //  have same keys and values
        map1.putAll(students);


        Map<String, Integer> map2 = new HashMap<>(); //have same keys and values
        map2.putAll(students);

        // I want to compare two Maps

        System.out.println(map1 == map2);   // two memory locations, different location
        System.out.println(map1.equals(map2)); // we compare do they have same key and value

        // 7. clear

        map1.clear();
        System.out.println( map1.size() );
        System.out.println("map1 = " + map1);







    }


}
