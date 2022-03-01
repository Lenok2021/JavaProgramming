package day51MapContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice4 {

    public static void main(String[] args) {

      /*
        String[] group1 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis"};
        String[] group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String[] group9 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"};
        String[] group24= {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
        String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};
    */

        ArrayList<String> group1 = new ArrayList<>(Arrays.asList( "Duygu","Magda","Farangez","Edison","Kerem","Farangis" ));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList( "Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat" ));
        ArrayList<String> group9 = new ArrayList<>(Arrays.asList( "Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem" ));
        ArrayList<String> group24 = new ArrayList<>(Arrays.asList( "Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas" ));
        ArrayList<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene" ));



        // pair: Id & names of students

        Map<Integer, ArrayList<String>> groups = new TreeMap<>();
        groups.put(1, group1);
        groups.put(2, group2 );
        groups.put(9, group9);
        groups.put(24, group24);
        groups.put(5, group5);

        System.out.println(groups);

        /*
        for (String each : groups.get(24)) {
            System.out.println(each);
        }
        */

        System.out.println(groups.get(2).get(1));


        System.out.println("------------------------------------------------");


        //  to get all group  to print names in each group

        // iterate Map by value

        for (ArrayList<String> eachGroup : groups.values()) {

            for (String eachClassmate : eachGroup) {

                System.out.println(eachClassmate);


            }


        }











    }
}









/*
2. Given the following arrays that contains the names of the students from each group:
        String[] group1 = {};
        String[] group2 = {};
        String[] group3 = {};
        String[] group4 = {};
        String[] group5 = {};

    Create a map that contains group id and names of group members

            Map<Integer, String[]> groups = new LinkedHashMap();

        add all the group 1d and group members into the map named groups

    display the names of each student with group id of 1

    display the names of each student from each groups


 */