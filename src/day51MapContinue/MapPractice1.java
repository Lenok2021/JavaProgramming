package day51MapContinue;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");
        System.out.println("employeeMap = " + employeeMap);

        //  1. Update the "M" to Male and "F" to Female
        // if  you have  a Key  you  can get a value
        // at first we need to get each key  we  iterated Map  by using Key
        for (String key : employeeMap.keySet()) {

            if (employeeMap.get(key).equalsIgnoreCase("m")) {
                employeeMap.replace(key, "Male");
            }
            if (employeeMap.get(key).equalsIgnoreCase("f")) {
                employeeMap.replace(key, "Female");
            }

        }
        System.out.println("employeeMap = " + employeeMap);


        System.out.println("==================================================================");


        // 2. Same task = iterate by using entrySet () method

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            System.out.println(entry);

            if (entry.getValue().equalsIgnoreCase("m")) {
                entry.setValue("Male");
                //  employeeMap.replace(entry.getKey(), "Male");

            }
            if (entry.getValue().equalsIgnoreCase("f")) {
                entry.setValue("Female");
                //  employeeMap.replace(entry.getKey(), "Male");


            }

        }
        System.out.println("========================================================");

    // 2. Display  the name of all female  Employees

        for (Map.Entry<String, String> pair : employeeMap.entrySet()) {

            String eachKey = pair.getKey(); // represents each name
            String eachValue = pair.getValue();  //  presents gender
            if(eachValue.equals("Female")){
                System.out.println(eachKey);
            }

        }


    }

}
