package day43_Abstruction.Car.Employee;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, int ID, String jofTitle, double salary) {
        super(name, age, gender, ID, jofTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is testing the application");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 8 hours");
    }



}
