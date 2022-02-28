package day50CollectionsMap;

import java.util.*;

public class IterableClassPractice2 {

    public static void main(String[] args) {

        //1.  remove all - not option
        List<String> name1 = new ArrayList<>();
        name1.addAll(Arrays.asList("Elene","Ahmed", "ahmed", "Anna", "Mustafa", "AhMED", "AhMED"));


        name1.addAll(Arrays.asList("Ahmed")); //  not working, next Element will be shifted to the left

        System.out.println("name1 = " + name1);

        System.out.println("====================================================================");

        //2. Apply Iterable
        // *  call iterator method()
        List<String> name2 = new ArrayList<>();
        name2.addAll(Arrays.asList("Elena","Ahmed", "ahmed", "Anna", "Mustafa", "AhMED", "AhMED"));
        Iterator<String> it = name2.iterator();


        while (it.hasNext()) {  //  if condition is true
            if (it.next().equalsIgnoreCase("ahmed")) {//  we can retrieve element
                it.remove();
            }

        }
        System.out.println("name2 = " + name2);

        System.out.println("=======================================================================");


        //3  remove with Lambda Expression
        List<String> name3 = new ArrayList<>();
        name3.addAll(Arrays.asList("Elena","Ahmed", "ahmed", "Anna", "Mustafa", "AhMED", "AhMED"));
        name3.removeIf(each -> each.equalsIgnoreCase("ahmed"));
        System.out.println("name3 = " + name3);

        System.out.println("========================================================");

        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6));

        // we call iterator method with return Integer Object
         Iterator<Integer> q = set.iterator();

         while(q.hasNext()){  // check  the element,  if true
             if(q.next() % 2 ==0 ){ // get element and check if element %2 ==0
                 q.remove();  //  remove
             }
         }







    }




}




