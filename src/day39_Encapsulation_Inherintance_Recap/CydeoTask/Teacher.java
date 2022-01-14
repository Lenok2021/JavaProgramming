package day39_Encapsulation_Inherintance_Recap.CydeoTask;

public class Teacher extends Employee {

    public Teacher(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void teach(){
        System.out.println(getJobTitle()+ " "+getName()+ " is teaching");

    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+ " "+ getName()+ " is teaching");
    }
}

/*
/*
5. Create a sub class of Employee named Teacher
            Override the work method
 */
