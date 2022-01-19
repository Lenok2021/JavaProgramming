package homework;

public class PersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("Elena", 38, 'F');
        Person person2 = new Person("Farangez", 33, 'F');
        Person person3 = new Person("Anastasia", 5, 'F');
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println("====================================");
        person1.drink("vodka");
        person2.eat("Bread a lot");
        person3.sleep();




    }

}
