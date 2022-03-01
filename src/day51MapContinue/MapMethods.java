package day51MapContinue;

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
        System.out.println( students.get("Elena"));

        //3. replace () method - replace value of specific key
        // replace the Bob score from 67 to 10000
        students.replace("Bob", 1000);

        System.out.println("students = " + students);
        
        //4. remove() method
        students.remove("Olga");
        System.out.println("students = " + students);

        //5.






    }


}
