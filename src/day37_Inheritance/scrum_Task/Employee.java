package day37_Inheritance.scrum_Task;

public class Employee extends Person{  //  Employee is a person

  //  create  additional variables
   public String jobTitle;
   public int id;
   public double salary;
   public String companyName;

   /*
   name, gender, age, jobTitle, id, salary, company name
    */
//  name, gender, age,  we  can extend  from parent class
//  create a constructor pass parameters from parent class
// +  add additional child variables


    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);  //  from parent class
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    // add  additional methods  only for Employee

    public void work(){
        System.out.println(jobTitle+" "+name+ " is working");
    }
   // generate String method  parent class+child class


    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                "jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }




    }

