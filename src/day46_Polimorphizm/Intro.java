package day46_Polimorphizm;

import day39_Encapsulation_Inherintance_Recap.Shapes.Circle;
import day39_Encapsulation_Inherintance_Recap.Shapes.Rectangle;
import day39_Encapsulation_Inherintance_Recap.Shapes.Shapes;
import day39_Encapsulation_Inherintance_Recap.Shapes.Square;
import day43_Abstruction.Car.Employee.*;
import day44Abstraction_Continue_Interface.Animal.Animal;
import day44Abstraction_Continue_Interface.Animal.Cat;
import day44Abstraction_Continue_Interface.Animal.Dog;
import day44Abstraction_Continue_Interface.Animal.Playable;
import day45_Interface_Polymotfism_Intro.Shape;
import day45_Interface_Polymotfism_Intro.Triangle;

import java.util.ArrayList;

public class Intro {

    public static void main(String[] args) {
        String str = "Wooden Spoon";
        Integer n1 = 2;
        Double b2 = 5.6;
        Boolean r1 = true;

        //  what if I want to  store them in one place
        // I can  give common parent


        Object[] array = {str, n1, b2, r1, new Circle(4.5)};

        // Object is a parent Class,  and it can be string,
        // integer, boolean, double, Circle


        Tester tester = new Tester("Elena", 38, 'F', "SDET", 125000);
        Developer developer = new Developer("Elena", 38, 'F', "Developer", 30000);
        Teacher teacher = new Teacher("Galina", 34, 'F', "Math teacher", 50000);
        Driver driver = new Driver("Max", 45, 'M', "Truck Driver", 30000);

        ArrayList<Person> cydeoEmployees = new ArrayList<>();

        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);


        System.out.println("-------------------------------------------");

        Employee employee = new Tester("Elena", 34, 'F', "SDET", 123000);
        employee.work();
        // employee.bugReport();

        /*
            WebDriver driver1 = new ChromeDriver();
            WebDriver driver2 = new ChromeDriver();
            driver1.get(amazon)
            driver2.get(google)
            Animal animal = new Dog();
            animal.drink()
            Animal animal = new Cat()
            animal.drink()
            Animal animal = new Tiger()
            animal.drink()
         */

        Animal animal = new Dog("Max", "Husky", 'F', 5, "Small", "Black");
        animal.drink();
        animal.eat();
        // animal.play();
        //  animal.bark();


        Playable animal2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        System.out.println(animal2.isFriendly);
        animal2.play();
        //  animal2.drink();
        //  animal2.eat();


        Animal animal3 = new Cat("Max", "Husky", 'M', 3, "Small", "White");

        Shapes shape = new Circle(5);
        shape.area();

        //  System.out.println( shape.getRadius());
        // System.out.println( shape.PI);

        boolean isSquare = shape instanceof Square;
        boolean isRectangle = shape instanceof Rectangle;
        boolean isCircle = shape instanceof Circle;

        System.out.println("isSquare = " + isSquare);
        System.out.println("isRectangle = " + isRectangle);
        System.out.println("isCircle = " + isCircle);



        /*
        WebDriver driver:
            if(driver instanceof Chrome){
                Chrome browser will open
            }else if(driver instanceof firefox){
                Firefox browser will open
            }
            ...

*/
    }

}



