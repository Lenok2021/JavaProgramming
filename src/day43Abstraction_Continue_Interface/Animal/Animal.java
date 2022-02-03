package day43Abstraction_Continue_Interface.Animal;

public class Animal {

    private String name;
    //  if  you want something would be unchangeable you  can give final keyword
    final private String breed;
    final private char gender;
    private int age;
    private String size;
    final private String color;

    public final static  boolean canBreath;


    static{
        canBreath=true;
    }


    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }
}

/*
Animal Task:
    Create an abstract class named Animal:
        Variables:
            name, breed(final), gender(final),  age, size, color(final)

        Encapsulate all the fields

        Add a cosntructor that can set all the fields

        Methods:
            eat() ==> different animals eat different foods
            drink() ==> all the animals drink water
            toString() ==> to display the full info of the animal

    Create the following subclasses of Animal:
            Dog
                eat(): eats Pizza

 */
