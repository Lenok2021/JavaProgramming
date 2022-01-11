package day37_Inheritance.scrum_Task;

public class BusinessAnalyst extends Employee {

    public BusinessAnalyst(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", id, salary, companyName);



        }
    public void analyze(){
        System.out.println(name+ " analyze documents");
    }
}
