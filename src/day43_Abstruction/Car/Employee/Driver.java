package day43_Abstruction.Car.Employee;

public class Driver extends Employee {


    public Driver(String name, int age, char gender,  String jofTitle, double salary) {
        super(name, age, gender, 34566, jofTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is driving");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " sleeps 10 hours");
    }
}
