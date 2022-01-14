package day37_Inheritance;

public class AnimalObject {

    public static void main(String[] args) {

      Dog dog1 = new Dog("Alex","Husky",'M',4,"Small","Black");
      System.out.println(dog1);
      dog1.bark();


      Cat cat1 = new Cat("Bob","British",'M',5,"Small","Orange");
      System.out.println(cat1);
      cat1.scratch();



      Parrot parrot1 = new Parrot("Hello","Masaw",'F',7,"Small","Blue");
      System.out.println(parrot1);
      parrot1.sing();





    }




}
