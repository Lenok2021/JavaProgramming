package day34_Static_Continue_GarbageCollections;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;

    public static String name;
    public static ArrayList<Integer>numbers=new ArrayList<>();


    // public static Sheet sheet;
    // in the future you need more steps to set variables



    public Circle(double radius){
        this.radius=radius;
        pi=3.14;  //  Static will be inisialize 5 times
    }// static needs to be inisilize 5
    // if Const. will be run 5 times+ your static variable
    // you give add. job for Constructor
    // never use Constructor to set Instances!!!!!!!!
    // you will not get an error, but it's not a best practice

    static{
        // radius = 5;  error  because radius  is instance variable
        pi=3.14;
        name = "Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
//  when you have more than 1 variable to set them
    }


    public static void main(String[] args) {

        pi=3.14;
        name = "Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("args = " + args);
        System.out.println(name);
        System.out.println(pi);

    }

}
