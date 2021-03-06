package day29_ArraysList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements2 {
    public static void main(String[] args) {
//  first  solution
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,7));

        ArrayList<Integer> unique = new ArrayList<>();
        for(Integer each: list) {
            int frequency = Collections.frequency(list, each); //  finf frequency of each element
            if (frequency == 1) {
                unique.add(each);
            }
        }
        System.out.println(unique);
        System.out.println("=======================================================");
//  second solution,  don't  use LOOP
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,7));

        ArrayList<Integer> unique1 = new ArrayList<>(list1); // add elements from list1 to unique
        unique1.removeIf(p-> Collections.frequency(list1,p)>1);

        System.out.println(unique1);



    }

}
