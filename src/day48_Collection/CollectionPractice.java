package day48_Collection;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        //  List<Integer> list = new List<>();
        // we cannot  do like that  List  is Interface


        List<Integer> list = new ArrayList<>();  //  polymorphism
        list.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list.get(0));

        List<Integer> list1 = new LinkedList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list.get(0));

        List<Integer> list2 = new Vector<>();
        list2.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list.get(0));

        List<Integer> list3 = new Stack<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list.get(0));

        System.out.println("===============================================");

        System.out.println(list3);
        // last inserted OB = 60
        //  as soon as call pop, it is going to remove 60  from stack

        ((Stack) list3).pop();  // down casting  we call  method from child class
        System.out.println(list3);

        ((Stack) list3).pop();
        System.out.println(list3);

        ((Stack<Integer>) list3).push(1000);
        System.out.println(list3);

        Vector<Integer> vector = new Stack<>();
        vector.addAll(Arrays.asList(100, 200, 300, 400, 500));
        // down casting
        Stack<Integer> stack = (Stack<Integer>) vector;
        stack.pop();
        stack.push(1000);
        System.out.println("stack = " + stack);
        System.out.println("vector = " + vector);

        System.out.println("==================================");
        // set  interface

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(1, 2, 3, 100, 200, 200, 300, 300, 100, 400, 400, null));
        System.out.println("set1 = " + set1);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(1, 2, 3, 100, 200, 200, 300, 300, 100, 400, 400, null));
        System.out.println("set2 = " + set2);

        // Set<Integer> set3 = new TreeSet<>();
        //set3.addAll(Arrays.asList(1,2,3,100,200,200,300,300,100,400,400, null));
        //  System.out.println("set3 = " + set3);


        Set<Integer> set4 = new TreeSet<>();
        set4.addAll(Arrays.asList(1000, 2, 3, 100, 200, 200, 300, 300, 100, 400, 400));
        System.out.println("set4 = " + set4);

        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.addAll(Arrays.asList(1000, 2, 3, 100, 200, 200, 300, 300, 100, 400, 400));


        String[] array = {"A", "A", "B", "A", "A", "B", "C", "C", "D"};
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(array));
        System.out.println("linkedHashSet = " + linkedHashSet);

        array = linkedHashSet.toArray(linkedHashSet.toArray(new String[0]));
        System.out.println(Arrays.toString(array));


    }

}

