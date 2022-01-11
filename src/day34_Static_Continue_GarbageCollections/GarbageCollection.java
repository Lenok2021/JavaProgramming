package day34_Static_Continue_GarbageCollections;
import java.util.ArrayList;
import java.util.Arrays;

import day30_CustomArrayList.Dog;
import day32_ConstructorOverloading.Car;

public class GarbageCollection {

    public static void main(String[] args) {
         // int n = null;
        //String str = null; // only primitive
        // System.out.println(str.toUpperCase());
        // if you print you will get NullPointerException
        // there is no object now

       String str = "Wooden Spoon";// after line 13 this Object will be eligible for Garbage Collection, Garbage Collector will destroy Object
       str=null;
       System.out.println(str);

       //

        Car car1 = new Car("Toyota"); // imported from Car Class

        car1 = null;
        System.out.println(car1);
        System.out.println("===============================");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1 = new Dog();
        dog1.name = "max";
        System.out.println(dog1);
        System.out.println("==============================");

        String lang = "Phyton";
               lang= "Java";
        System.out.println("lang = " + lang);
        System.out.println("lang = " + lang);

        System.out.println("=====================================");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);// first door
        ArrayList<Integer>list2 = list1;
        list2.addAll(Arrays.asList(200,300));// second door
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1==list2);

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;
        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

// we have  only ONE OBJECT  two reference names
//  when you do changings through one reference name and print object
//  from another reference name the result same




    }

}
