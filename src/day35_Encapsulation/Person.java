package day35_Encapsulation;

public class Person {

public String name;
public int age;
public String language;
public char gender;


public static String planet;
public static boolean isHuman, hasNose;
public static int numberOfWings, numberOfHead;

 public Person(String name, int age, String language) {
  this.name = name;
  this.age = age;
  this.language = language;
 }

static{
  planet = "Earth";
  isHuman = true;
  hasNose = true;
  numberOfHead=1;
  numberOfWings=0;
}

public static void printPlanerName(){
    System.out.println("Planet name is "+ planet);

}

public void eat(String food){
    System.out.println(name + " is eating "+ food);
}
    public void drink(String drink){
        System.out.println(name + " is eating "+ drink);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", language='" + language + '\'' +
                ", gender=" + gender +
                ", planet=" + planet +
                                '}';
    }
}
