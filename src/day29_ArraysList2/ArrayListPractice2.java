package day29_ArraysList2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
//  keep  the  name  of two  emplooyes
        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Elena", "Juliya", "Ahmed", "Jimmy", "David"));
        employees.retainAll(Arrays.asList("Ahmed", "Elena"));
        System.out.println(employees);

        System.out.println("-------------------------------------------");
//  remove names  starts  from "M"
        String name[] = {"Mary", "Masha", "Mia", "Hasan", "Elena", "Olga"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(name)); // convert  to list
        list.removeIf(p -> p.charAt(0) == 'M');


        //  how  to  convert  arrayList  to  array
        name = list.toArray(new String[0]);
        System.out.println(Arrays.toString(name));


    }
}
