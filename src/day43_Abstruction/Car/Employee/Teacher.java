package day43_Abstruction.Car.Employee;

public class Teacher  extends Employee{

    public Teacher(String name, int age, char gender, String jofTitle, double salary) {
        super(name, age, gender, 6778, jofTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is teaching students");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " sleeps 7 hours");
    }

    public void meetings(){
        System.out.println(getName()+ " attends meetings");
    }
}
