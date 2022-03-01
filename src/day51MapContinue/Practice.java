package day51MapContinue;

public class Practice {


}


/*
1. Given the following map that contains the employee name and thier salary:
     Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);


    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K



2. Wirte a program that can return the freuqency of characters
        Not: MUST use map

        Ex: str = "bbcccaaaaa"

        output:
            {b=2, c=3, a=5}

 */

/*
1.  Given the following map that contains the names and hired date of employees:
         Map<String, LocalDate> map = new LinkedHashMap<>();
            map.put("John", LocalDate.of(2018, 9, 5));
            map.put("Antony", LocalDate.of(2012, 7, 29));
            map.put("Jimmy", LocalDate.of(2014, 4, 1));
            map.put("James", LocalDate.of(2016, 11, 2));
            map.put("Josh", LocalDate.of(2020, 5, 15));
            map.put("Cory", LocalDate.of(2015, 6, 19));
            map.put("Anderson", LocalDate.of(2013, 8, 24));
            map.put("Steven", LocalDate.of(2017, 10, 2));

        1. Display the names of the employee who were hired before 2015
                    Hint: You can use isBefore method of LocalDate

        2. display the name of the employee who were hired on 5/15/2020
                    Hint: You can use isEqual method of LocalDate

        3. How many people were hired after 2014?
                    Hint: You can use isAfter method of LocalDate

        4. display the name and hire date of the employee


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