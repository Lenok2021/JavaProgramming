package day36_Inheritance;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setInfo("Lucy","Husky",'M',2,"Small","Black");
        dog1.drink();
        dog1.eat();
        dog1.move();
        dog1.sleep();
        dog1.bark();
       // dog1.hunt();  we can  there is no relationship between dog and tiger
        System.out.println(dog1);
        System.out.println("======================================");

        Cat cat1 = new Cat();
        cat1.setInfo("Poppy","British",'F',5,"Big","White");
        cat1.drink();
        cat1.eat();
        cat1.move();
        cat1.sleep();
        cat1.meow();
        cat1.scratching();
        System.out.println(cat1);
        System.out.println("===========================================================================");

        Tiger tiger1 = new Tiger();
        tiger1.setInfo("Jack","Bengal",'M',6,"Big", "Orange");
        tiger1.drink();
        tiger1.eat();
        tiger1.move();
        tiger1.sleep();
        tiger1.hunt();
        tiger1.roar();
        System.out.println(tiger1);


    }
}
