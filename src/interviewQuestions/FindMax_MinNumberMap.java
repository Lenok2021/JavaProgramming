package interviewQuestions;

import java.util.*;

public class FindMax_MinNumberMap {

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




        List<Integer> scores = new ArrayList<>(students.values());
        System.out.println("scores = " + scores);
        // since ArrayList  has index number I  can  you for Loop

        for (Integer eachValue : students.values()) {
            System.out.println("eachValue = " + eachValue);

        }

        System.out.println("============================================================");


        // find MAX  score
        int maxScore = Integer.MAX_VALUE;

        for (Integer score : students.values()) {

            if(score > maxScore){
                maxScore = score;
            }
        }
        System.out.println(maxScore);

        // find MIN  score

        int minScore = Integer.MIN_VALUE;

        for (Integer score : students.values()) {

            if(score > minScore){
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






    }
}
