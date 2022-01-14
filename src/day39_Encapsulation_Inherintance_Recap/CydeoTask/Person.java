package day39_Encapsulation_Inherintance_Recap.CydeoTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("Invalid name "+ name);
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>150){
            System.out.println("Invalid age " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender!='F'){
            System.out.println("Invalid gender "+ gender);
            System.exit(1);

        }

        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(getGender());
    }

    public void eat(){
        System.out.println(name+ " is eating");

    }
    public void drink(){
        System.out.println(name+ " is drinking");

    }
    public void sleep(){
        System.out.println(name+ " is sleeping");

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }



}


/*
/*
1. Create a class named Person:
            Variables:
                name, age, gender
            Encapsulate all the fields
            Add a constructor to set all the fields
            Methods:
                eat()
                drink()
                sleep()
                toString()
 */
