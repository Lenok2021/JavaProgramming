package day04_Variables;

public class EmploeeInfo {
    public static void main(String[] args) {
        /*
        Create a class named EmployeeInfo. declare the following variables:
                1. name (String)
                2. age (int)
                3. gender (char)
                4. company (String)
                5. jobTitle (String)
                6. yearsOfExperience (double)
                7. salary (int)
                8. isFullTime (boolean)
                9. isMarried (boolean)
                10. employeeId (String)
                11. SSN (String)

         */
        String name  = "Elena";
        int age = 35;
        char ch1 = 'F';
        String  company = "CYDEO";
        double yearsOfExperience = 3.5;
        int salary = 50_000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String companyName = "Yankee";
        String jobTitle = "biller";

        String emploeeId = "AA23400";
        String SSN = "234-67-890";
        System.out.println("name = " + name);
        System.out.println("emploeeId = " + emploeeId);
        System.out.println("ch1 = " + ch1);
        System.out.println("age = " + age);

        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = " + salary);
        System.out.println("SSN = " + SSN);        
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);



    }

}
