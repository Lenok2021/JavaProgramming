package homework;

public class Person {

    public String name;
    public int age;
    public char gender;
    public static boolean isHuman = true;
    public static boolean hasNose = false;
    public static boolean hasWings = false;
    int numberOfHead = 1;
    int numberOfEyes = 2;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

   public void eat(String food){
       System.out.println(name+ " is eating "+ food);
   }

    public void drink(String drink){
        System.out.println(name+ " is drinking "+ drink);
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", Is the person human?=" + isHuman +
                ", Does person have nose?=" + hasNose +
                ", Does person have wings=" + hasWings +
                ", Does person have wings=" + hasWings +
                ", How many heads does the person have?=" + numberOfHead +
                ", How many eyes does the person have?=" + numberOfEyes +
                '}';
    }
}



/*
Person Task:
		1. Create a class named Person:

				Attributes:
					instance: name, age, gender
					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,
				Add a constructor that can set All the fields (instances)
				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()
 */