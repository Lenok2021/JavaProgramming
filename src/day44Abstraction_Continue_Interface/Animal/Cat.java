package day44Abstraction_Continue_Interface.Animal;

public  final   class Cat extends Animal  implements Playable, WildAnimal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating milk");
    }

    public void meow(){
        System.out.println(getName() + " is meowing");
    }

    @Override
    public void play() {
        System.out.println("Jumping");
    }

    @Override
    public void hunt() {
        System.out.println("Hint");
    }
}
