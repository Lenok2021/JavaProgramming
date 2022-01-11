package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObject {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Poopie", "Poodie", "Small", "Black", 'M', 3);
        Dog dog2 = new Dog("Bill", "Bulldog", "Big", "Black", 'F', 5);
        Dog dog3 = new Dog("Jessica", "German Sherpherd", "Big", "Brown", 'M', 6);
        Dog dog4 = new Dog("Tamara", "Husky", "Medium", "White", 'F', 10);
        Dog dog5 = new Dog("Kolly", "Boxer", "Big", "Dark Brown", 'M', 8);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println(dog5);
        System.out.println("================================================================");
        dog1.eating();
        dog2.sleeping();
        dog3.playing();
        dog4.eating();
        dog5.sleeping();
        System.out.println("=====================================================================");






    }
}
