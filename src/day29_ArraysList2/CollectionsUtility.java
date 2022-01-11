package day29_ArraysList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        // 1 sort method
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(12, 45, 3, 2, 1, 7));
        Collections.sort(list);
        System.out.println(list);

        System.out.println("---------------------------------------");
        // 2 reverse method

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        System.out.println(list2);

        Collections.reverse(list2);
        System.out.println(list2);

        System.out.println("-----------------------------------");
        //3  swap  element

        ArrayList<Integer> list3 = new ArrayList<>(); //  only for int,  not for String
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        //  0  1  2  3  4  5
        Collections.swap(list3, 1, 4); //  we can provide 1, 4  or  4,1
        System.out.println(list3);

        System.out.println("-----------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10, 10, 10, 20, 30, 40, 50, 60));

        int max = Collections.max(list4); //in Array Class we don't have that method, we have custom method
        System.out.println(max);

        int min = Collections.min(list4);
        System.out.println(min);

        System.out.println("=================================");

        Collections.replaceAll(list4, 10, 22);
        System.out.println(list4);

        System.out.println("=============================");

        int frequency = Collections.frequency(list, 22);
        System.out.println(frequency);

        System.out.println("==================================");

        ArrayList<String> word = new ArrayList<>();
        word.addAll(Arrays.asList("Java", "Java", "Cat", "Cat"));
        int countJava = Collections.frequency(word, "Java");
        int countCat = Collections.frequency(word, "Cat");

        System.out.println(countJava);
        System.out.println(countCat);


     /*
     write a program that can swap the
      first and last elements of an ArrayList of Integers
      */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(numbers);
        Collections.swap(numbers, numbers.size() - 1, 0);
        System.out.println(numbers);

        /*
        Write a program that can move all the zeros to the last indexes of ArrayList
                    Ex:
                        list: {1,0,2,0,3,0,4,0}
                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]
         */

        ArrayList<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        ArrayList<Integer> num1 = new ArrayList<>(); //  new ArrayList

        for(Integer each : num){
            if(each !=0){
                num1.add(each);
            }
        }
        for(Integer each : num){
            if(each == 0){
                num1.add(each);
            }
        }
        System.out.println(num1);
    }
    String  str = "ABCD123$%#@&456EFG!";
    char[] ch =str.toCharArray();





}
