package day43_Abstruction.Car.Employee;

public final class Developer extends Employee{

    public Developer(String name, int age, char gender,  String jofTitle, double salary) {
        super(name, age, gender, 44444, jofTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is performing unit testing");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 6 hours");
    }

    public void unitTest(){
        System.out.println(getName() + " performs unit testing");
    }


}
