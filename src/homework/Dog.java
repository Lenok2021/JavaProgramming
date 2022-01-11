package homework;

public class Dog {
    public String name;
    public String breed;
    public String size;
    public String color;
    public char gender;
    public int age;

    public Dog(String name, String breed, String size, String color, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public static int numberOfLegs = 4;
    public static int numberOfEyes = 2;
    public static boolean isNumberOfWings = false;
    public static boolean isFriendly = true;

    public void eating() {
        System.out.println(name + " is eating");
    }

    public void sleeping() {
        System.out.println(name + "is sleeping");
    }

    public void playing() {
        System.out.println(name + " is playing");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", How many legs does the dog have?=" + numberOfLegs +
                ", How many eyes does the dog have?=" + numberOfEyes +
                ", Does the dog have wings?=" + isNumberOfWings +
                ", Does the dog friendly?=" + isFriendly +
                '}';
    }
}


/*
Dog Task:
		1. Create a class called Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly
	                Add a constructor to initialized all the fields (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()
 */