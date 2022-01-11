package day29_ArraysList2;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperators {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        //1  ADD  METHOD
        //  i want to  add numbers  1 to 5 at one time
        //  when  you  have  a multiple value,
        //  that  can be taken  as  array
        //  from array  utility call  aslist method

        list.addAll(Arrays.asList(1, 2, 2, 2, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 6, 7));
        System.out.println(list);

        //2  REMOVE  METHOD
        list.removeAll(Arrays.asList(2, 3, 4, 5, 6));
        //  which  element is  matching  this element will be removed
        //  you  remove element, you know element, no index number
        System.out.println(list);

        System.out.println("===================================");


        //3  RETAIN METHOD
        ArrayList<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(100, 200, 400, 500, 600, 100, 200, 300));
        //  i  want  to  keep  100, 200
        //  remove others
        //  retain method  - remove objects  that  are not matching with given value
        num.retainAll(Arrays.asList(100, 200));
        System.out.println(num);
        // output [100, 200, 100, 200]
        //  others  not  matching was removed

        System.out.println("=================================");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "Developer", "QA", "BA", "BA", "PO"));
        jobTitles.retainAll(Arrays.asList("QA", "BA"));  // i want to  keep only  those elements
        System.out.println(jobTitles);


        System.out.println("=========================================");

        // contains All
        // if  ArrayList contain multiple  values  at same time

        ArrayList<Integer> number = new ArrayList<>();
        number.addAll(Arrays.asList(2, 3, 4, 76, 7,6));
        // verify  it  AL containes  only 3 = contain method
        boolean a = number.contains(3) && number.contains(6) && number.contains(7);
        // .........  for  each each element
        //  but   when  you  want if AL containes 3 or 4 elements = containes ALL
        boolean b = number.containsAll(Arrays.asList(3,6,7));
        System.out.println(b); //  true

        boolean c = number.containsAll(Arrays.asList(33,6,7)); // if  i put 33
        System.out.println(c); // false




    }


}
