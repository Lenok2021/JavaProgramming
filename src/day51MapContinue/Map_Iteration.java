package day51MapContinue;

import java.util.*;

public class Map_Iteration {


    public static void main(String[] args) {


        Map<String, Integer> students = new LinkedHashMap<>();
        students.put("Elena", 90);
        students.put("Olga", 54);
        students.put("Bob", 67);
        students.put("Polina", 56);
        students.put("John", 77);
        students.put("Layan", 76);
        students.put("Helen", 98);
        students.put("Kate", 95);
        students.put("Layan", 76);
        System.out.println("students = " + students);


        // ITERATE  MAP  BY USING KEYGET () METHOD!!!!!!!!!!!!!!!!!

        //1.  I want  to print out the name of all students
        // the student name is a kye
        // I can Iterate my Map by using keySet()==> return type is a Set
        // Why Set? Because key is unique, Set does not accept duplicates

        Set<String> keys = students.keySet();  //  get all keys from Map

        for (String eachKey : keys) {
            System.out.println(eachKey + " : " + students.get(eachKey));
            students.replace(eachKey, students.get(eachKey) + 5);  //  increase value by one
        }
        // when you  found the key during the Iteration you can:

        //* find the value = get ( key)
        //* you can change the value = replace ()
        //* you can remove the value by key


        //2.  Iterate Map  by keySet()
        // Print out  all students whose score is less than 70
        // students.keySet() = return type is  a  Set

        for (String eachKey : students.keySet()) {

            Integer eachValue = students.get(eachKey);

            if (eachValue < 70) {

                System.out.println(eachKey);
            }

        }

        System.out.println("====================================================");

        Map<String, Integer> earlyBirds = new HashMap<>();// >=90
        Map<String, Integer> angryBirds = new HashMap<>();// < 90

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if (value >= 90) {
                earlyBirds.put(key, value);
            } else {
                angryBirds.put(key, value);
            }
        }
        System.out.println("angryBirds = " + angryBirds);
        System.out.println("earlyBirds = " + earlyBirds);

        System.out.println("===========================================================");

         // ITERATE  MAP BY USING VALUE ()!!!!!!!!!!!!!!


        // values()  method = returns a Collection
        // we can iterate map by value
        // since it returns  a Collection we can apply For each Loop

        // Collection <Integer> scores = students.values();
        // since the return type a collection I can put in a Constructor

        List<Integer> scores = new ArrayList<>(students.values());//collection I can put in a Constructor

        System.out.println("scores = " + scores);
        // since ArrayList  has index number I  can  you for Loop

        for (Integer eachValue : students.values()) {
            System.out.println("eachValue = " + eachValue);

        }

        System.out.println("============================================================");

        // find MAX  score
        int maxScore = Integer.MAX_VALUE;

        for (Integer score : students.values()) {

            if (score > maxScore) {
                maxScore = score;
            }
        }
        System.out.println(maxScore);

        // find MIN  score

        int minScore = Integer.MIN_VALUE;

        for (Integer score : students.values()) {

            if (score > minScore) {
                minScore = score;
            }
        }
        System.out.println(minScore);


        System.out.println("===================================================");

        // find Min  and Max  with no loop

        int max = Collections.max(students.values());
        // Collections.max  BC  this  method accept Collection as a Parameter
        // value method returns Collection,  that's why we can do that

        System.out.println("max = " + max);

        int min = Collections.min(students.values());
        // Collections.max  BC  this  method accept Collection as a Parameter
        // value method returns Collection,  that's why we can do that

        System.out.println("min = " + min);

        System.out.println("========================================================");

        // how many students has the score of 95 or greater

        int count = 0;
        for (Integer eachScore : students.values()) {
            if (eachScore >= 90) {
                count++;
            }

        }
        System.out.println("count = " + count);

        System.out.println(" ====================================================");

        // ITERATION BY ENTRY - VALUE  +  KEY!!!!!!!!!!!!!!!!!!!

        //3.  If you  want To Iterate Map by pairs (Key + Value)

        for (Map.Entry<String, Integer> entry : students.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }
}