package day43_Abstruction.Car.Employee;

public abstract class Employee extends Person {
    private final int ID;
    private String jofTitle;
    private double salary;

    public Employee(String name, int age, char gender, int ID, String jofTitle, double salary) {
        super(name, age, gender);
        if(ID <=0){
            throw new RuntimeException("Invalid ID: "+ ID);
                       }

        this.ID = ID;
        setJofTitle(jofTitle);
        setSalary(salary);
    }

    public int getID() {
        return ID;
    }

    public String getJofTitle() {
        return jofTitle;
    }

    public void setJofTitle(String jofTitle) {
        this.jofTitle = jofTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name"+getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "ID=" + ID +
                ", jofTitle='" + jofTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
