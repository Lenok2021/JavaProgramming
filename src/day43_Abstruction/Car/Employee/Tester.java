package day43_Abstruction.Car.Employee;

public final class Tester extends Employee {

    public Tester(String name, int age, char gender, String jofTitle, double salary) {
        super(name, age, gender, 112233, jofTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is testing the application");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 8 hours");
    }
     // added function that only unique for testers

    public void bugReport(){
        System.out.println(getName()+ " is creating bug report");
    }


}
