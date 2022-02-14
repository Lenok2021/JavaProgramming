package day47_Pilymorphism_Continue;

import day37_Inheritance.Cat;
import day39_Encapsulation_Inherintance_Recap.Shapes.Circle;
import day39_Encapsulation_Inherintance_Recap.Shapes.Shapes;
import day39_Encapsulation_Inherintance_Recap.Shapes.Square;
import day43_Abstruction.Car.Employee.*;
import day44Abstraction_Continue_Interface.Animal.Animal;
import day44Abstraction_Continue_Interface.Animal.Dog;
import day45_Interface_Polymotfism_Intro.Cube;


public class ReferenceCasting {

    public static void main(String[] args) {


        Shapes shape = (Shapes) new Circle(4.5);   // upcasting
        //  we can  assign any data  type to another
        // BC reference casting was done implicitly

        Shapes shape1 = new Circle(5.5);

        //  Since  we  have casting  we can achieve Polymorphism

        System.out.println("---------------------------------------------");

        Animal animal = new Dog("Max", "Husky", 'M', 5, "Small", "Black");

        Dog dog = (Dog) animal;  //  down-casting  // explicitly
        dog.bark();
        // animal.bark();   ERROR
        ((Dog) animal).bark();
        dog.drink();


        //  we created one Object  DOG  which has two references  dog  and  animal


        System.out.println(animal.getName());
        System.out.println(dog.getName());

        System.out.println("==============================================");

        Employee employee = new Tester("Elena", 34, 'F', "SDET", 123000);
        ( (Tester)employee ).bugReport();

     //   employee.unitTesting();  error  since  there is no is a relationship between  tester  amd developer
      //  tester  does not have unit testing method
      // we can call through Developer

      //  ( ( Developer) employee).unitTest(); //ClassCastException
         // there  is no is a relationship between  tester  amd developer

     //   Driver driver = (Driver) employee;  //ClassCastException

        Person person = (Person) employee;

      //  Teacher teacher = (Teacher) employee;  //  //ClassCastException


        System.out.println("================================================");

        Shapes s1 = new  Circle(10);
        s1.area();
        s1.perimeter();
        //s1.volume();  //  volume method does not exist in Circle Class

        //  in order  to get access to volume method
        //  we cannot convert to Cube
        //  BC CUBE and Circle  does not have is a relationships




    }


}
