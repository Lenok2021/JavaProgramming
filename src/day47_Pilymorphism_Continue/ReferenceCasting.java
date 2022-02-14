package day47_Pilymorphism_Continue;

import day39_Encapsulation_Inherintance_Recap.Shapes.Circle;
import day39_Encapsulation_Inherintance_Recap.Shapes.Shapes;
import day44Abstraction_Continue_Interface.Animal.Animal;
import day44Abstraction_Continue_Interface.Animal.Dog;


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
        (  (Dog) animal ).bark();
        dog.drink();


        //  we created one Object  which has two references

        System.out.println(animal.getName());
        System.out.println(dog.getName());


    }


}
