package day30_CustomArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapToElementsInArrayList {

    public static void main(String[] args) {

       /* write a program that can swap the first and last
        elements of an ArrayList of Integers
*/
        ArrayList<Integer> numbers =  new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(numbers);
        Collections.swap(numbers, 0, numbers.size()-1);
        System.out.println(numbers);

    }

}
