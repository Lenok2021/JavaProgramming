package day44Abstraction_Continue_Interface.Animal;

public final class Tiger extends Animal implements  WildAnimal{

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating deer");

    }




    @Override
    public void hunt() {
        System.out.println(getName()+ " is hunting snake");
    }
}
