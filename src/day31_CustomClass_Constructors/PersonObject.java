package day31_CustomClass_Constructors;

public class PersonObject {

    public static void main(String[] args) {


        Person person1 = new Person("Daniel", 'M', 32);
        Person person2 = new Person("Elena", 'F', 38);
        Person person3 = new Person("Anastasia", 'F',45);

        person2.age = 30; // if  you  want to change data

        System.out.println(person1);
        System.out.println(person2);


    }
}
