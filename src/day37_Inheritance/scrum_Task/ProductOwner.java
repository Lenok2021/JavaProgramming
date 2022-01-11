package day37_Inheritance.scrum_Task;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, "Product Owner", id, salary, companyName);
    }
    public void communicate(){
        System.out.println(name + " communicating");
    }


}
