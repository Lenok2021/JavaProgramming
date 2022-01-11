package day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person();
       // person1.name="Daniel"  we don't have access it's private
      // person1.age=21;
        person1.setName("Elena");
        person1.setAge(34);
      //  System.out.println(person1.name + ":" +person1.age);
        System.out.println(person1.getAge()+ " : "+person1.getName());



    }
}
