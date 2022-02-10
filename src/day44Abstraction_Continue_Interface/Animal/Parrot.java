package day44Abstraction_Continue_Interface.Animal;

public class Parrot extends Animal implements Playable,Flyable{

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("eating soup");
    }

    @Override
    public void fly() {
        System.out.println("Flying very fast");
    }

    public static void main(String[] args) {
        Parrot r = new Parrot("Bob","Dod",'M',5,"Small","Black");
        r.fly();
        r.eat();
        r.drink();
        System.out.println( Flyable.canFly );

    }


    @Override
    public void play() {

    }

    @Override
    public void method1() {
        Flyable.super.method1();
    }
}
