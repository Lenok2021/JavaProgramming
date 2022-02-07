package day44Abstraction_Continue_Interface.Animal;

public interface Flyable {

    boolean canFly = true;

    void fly();

    default void method1(){
        System.out.println("hh");
    }

}
