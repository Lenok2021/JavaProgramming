package day50CollectionsMap;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        // convert one collection type to another

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        System.out.println("set = " + set);

        // convert set to Array
        Integer[] array = set.toArray(set.toArray(new Integer[0]));

        //  every single collections' constructor accept any Collection type.

        List<Integer> list = new ArrayList<>(set);

        // when nullpointerExeption ossurs
        List<String> names = null;
        // null - 0  Ob  has been created
        // if I call  any methods?
        // System.out.println(names.size());
        // NullPointerException
        System.out.println("----------------------------------------------------");

        //pop () ===>  LIFO
        List<Character> stack = new Stack<>();
        stack.addAll(Arrays.asList('A', 'B', 'C', 'D'));
        System.out.println(stack); //4 elements
        (   (Stack) stack  ).pop();  // we have  cast  it BC  pop  is a Stack method
        System.out.println(stack);// 3 elements, the last inserted element was removed



        //poll()  ===>  FIFO

        List<String> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList("Tom","Jimmy","Anna","Tom"));
        System.out.println("linkedList = " + linkedList);

      ((LinkedList<String>) linkedList).poll(); // the  first inserted element will be removed

        System.out.println("linkedList = " + linkedList);






    }


}
