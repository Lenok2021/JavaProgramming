package day32_ConstructorOverloading;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name) {
        this.name = name;  //  we have duplicates// avoid that
    }

    public Employee(String name, char gender) {
        //this.name = name; ////  we have duplicates// avoid that
        this(name); //
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle) {
        this(name, gender);
        this.jobTitle = jobTitle;

    }

    public Employee(String name, char gender, String jobTitle,double salary) {
        this(name, gender,jobTitle);
        this.salary=salary;

    }

//


}
