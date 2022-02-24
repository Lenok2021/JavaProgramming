package day48_Collection;

import java.util.*;

public class ListIntro {
    public static void main(String[] args) {


        //  List<Integer> list = new List<>();
        // we cannot  do like that  List  is Interface


        List<Integer> list = new ArrayList<>();  //  polymorphism
        list.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list.get(0));

        List<Integer> list1 = new LinkedList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list.get(0));

        List<Integer> list2 = new Vector<>();
        list2.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list.get(0));

        List<Integer> list3 = new Stack<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60));
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






    }


}
