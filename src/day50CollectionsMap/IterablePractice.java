package day50CollectionsMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        //  remove all Elements  that are  less than 4

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4) {

            }


        }
        System.out.println(list);
        // we cannot use only remove method
        //because you removed Element and next Element would be shifted to the left

        //we can use iterator() method
        //Lambda Expression use Iterable as well

        System.out.println("==========================================================");
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        Iterator<Integer> it = list1.iterator();

        //remove all  the elements that are less than 4

      /*  boolean r1 = it.hasNext();

        System.out.println("r1 = " + r1);//true - there is Elements that can be iterated

        System.out.println(it.next());
        
        boolean r2 = it.hasNext(); //if true

        System.out.println(it.next());// next method can get Element

        // in order to get all  Elements we use while loop
        */

        // it.has()  returns Element

        while (it.hasNext()){
          if( it.next() < 4){
              it.remove();
          }

        }

        System.out.println("list1 = " + list1);

        System.out.println("=============================================================");

        // we can do same with For Loop

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for( Iterator<Integer> i=list3.iterator() ; i.hasNext() ; ){
            if(i.next() < 4 ){
                i.remove();
            }
        }

        System.out.println(list3);

        System.out.println("=====================================================================");
        //  but  with Lambda Expression was added later
        // you can do that with it, the easiest way

        list.removeIf(each -> each  < 4 );  //p (each)  represents each Element in ArrayList


        // Lambda expression is a shortcut

        System.out.println("Lambda " + list1);
    }



}
