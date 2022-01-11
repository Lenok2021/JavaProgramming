package day31_CustomClass_Constructors.scrumTask;

public class Developer {

    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {

        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }


    public void  coding(){
        System.out.println(name + " is  responsible coding");
    }
    public void  unitTesting(){
        System.out.println(name + " is responsible for unit testing");
    }
    public void fixingBug(){
        System.out.println(name + " is responsible for fixing Box");
    }

}




/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fileds

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()

 */