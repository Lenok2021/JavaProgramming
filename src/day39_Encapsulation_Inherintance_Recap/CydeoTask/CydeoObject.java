package day39_Encapsulation_Inherintance_Recap.CydeoTask;

public class CydeoObject {

    public static void main(String[] args) {

        Developer developer = new Developer("Elena",29,'F',1,"Java Developer",120000);

        Tester tester = new Tester("Olga",23,'F',2,"SDET",110000);

        Teacher teacher = new Teacher("Daniel",34,'M',3,"Math Teacher",25000);

        Student student = new Student("Anna",14,'F',4,"Biology");


        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("-------------------------------------------------");

        developer.setAge(39);

        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("-------------------------------------------");

        developer.work();
        tester.work();
        teacher.work();

        developer.fixingBugs();

        System.out.println("--------------------------------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        tester.createTickets();


    }
}
