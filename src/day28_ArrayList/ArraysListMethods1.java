package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysListMethods1 {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();

        // 1)  add method, add element, depends on data type
        numbers.add(10); //  index 1
        numbers.add(20);//  2
        numbers.add(30);//3
        numbers.add(40);//4
        numbers.add(50); // 5

        System.out.println(numbers);

        //  if  you  want to add 25  after specific index  INSORTING FUNCTION
        numbers.add(1,25);
        System.out.println(numbers);

        System.out.println("=======================================================");

        // 2)  size  return the total number of element
        numbers.size();
        int lastIndex = numbers.size()-1;
        System.out.println(numbers);
        System.out.println("last index" +lastIndex);

        System.out.println("======================================================");

        // 3) get method  returns you element  that presented  that index, put index number
        int num = numbers.get(3);
        System.out.println(num);
        System.out.println("===================================");

        // if you wanna get access to all elements
        for (int i = 0; i< numbers.size(); i++){
            System.out.println(numbers.get(i));

            System.out.println("==================================");

            //SET  method replace  old element with given element based on given index number.
            ArrayList<String> list = new ArrayList<>();
            list.add("Java");
            list.add("Python");
            list.add("Java");
            list.add("C#");
            list.add("Ruby");
            list.set(2, "JavaScript"); //  replace,  the  size will not be effected
            list.set(3, "C++");

            System.out.println(list);

            System.out.println(" ===========================");

//  remove  method , decrease  the size
            // remove  by index,  remove by object
            ArrayList<String> employees = new ArrayList<>();
            employees.add("Suat");
            employees.add("Aygun");
            employees.add("Olga");
            employees.add("Neira");
            employees.add("Ali");
            employees.add("Hulya");
            employees.add("Kaloyan");

            System.out.println(employees);

            employees.remove(0);

            System.out.println(employees);

            employees.remove(0);

            System.out.println(employees);

            employees.remove(0);

            System.out.println(employees);

            employees.remove(1); // remove  by index

            System.out.println(employees);

            employees.remove( employees.size() -1 );// last  index

            System.out.println(employees);

            boolean r1 = employees.remove("Hulya"); //  remove by element

            System.out.println(employees);

            boolean r2 = employees.remove("Neira");

            System.out.println(employees);


            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);


            System.out.println("====================================");

            //  equals  method

            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(100);
            list1.add(100);
            list1.add(100);  // if  1000  false

            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(100);
            list2.add(100);
            list2.add(100);

            System.out.println(list1 == list2);
            System.out.println(list1.equals(list2));


            System.out.println("================");

            //  is Empty

            ArrayList<Integer> list3 = new ArrayList<>();
       list3.addAll(Arrays.asList(1,2,3,4,5));
             list3.set(0,list3.get(4));
            list3.set(4,list3.get(0));

            System.out.println(list3);


            ArrayList<Character> yyy = new ArrayList<>();
for(char j = 'a'; j<='z'; j++){
    yyy.add(j);
    
}
boolean result1 = list.containsAll(Arrays.asList('a','c','D'));
            System.out.println("result1 = " + result1);
        }






    }

}
