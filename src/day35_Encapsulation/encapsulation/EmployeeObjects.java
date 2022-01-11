package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Elena", 'P', 28, 20000.0);
        System.out.println(employee1);

        employee1.setAge(33);
        System.out.println(employee1);

        Employee employee2 = new Employee("Anastasia", 'F', 23, 115000);
        System.out.println(employee2);

        employee2.setName("Nataliya");

        employee2.setSalary(employee2.getSalary()+15000);
        System.out.println(employee2);


    }
}
