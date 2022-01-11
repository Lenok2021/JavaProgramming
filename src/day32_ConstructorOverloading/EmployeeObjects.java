package day32_ConstructorOverloading;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Elena");
        System.out.println(employee1);

        Employee employee2 = new Employee("Elena", 'F');
        System.out.println(employee2);

        Employee employee3 = new Employee("Elena", 'F', "SDET");
        System.out.println(employee3);

        Employee employee4 = new Employee("Max", 'M', "QA",120000);
        System.out.println(employee4);


    }
}
