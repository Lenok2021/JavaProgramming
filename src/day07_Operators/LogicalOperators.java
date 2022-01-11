package day07_Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        /*
        Task to check is the member eligible to vote

         */
        String name = "Elena";
        int age = 19;
        String citizen = "UK";
        boolean isEligible = age >= 18 && citizen == "USA";
        // analyze:
        // 1.  19 > = 18  &&  citizen == USA
        //          true         false
        // the only time when logical AND operator returns you TRUE
        //  BOTH expressions MUST be true

        System.out.println(name + " is eligible to vote: " + isEligible);// false
        System.out.println("__________________");


        //  you want  to apply for the loan,  creditScore = 720,
        //  age 23, income = 35000
        String name2 = "Elena";
        int creditScore = 710;
        int age2 = 23;
        int income = 35000;  //  GIVEN extra expression
        boolean isEligibleForLoan = creditScore >= 720 && age2 >= 23 && income >= 35000;
        System.out.println(name2 + " is eligible for the loan: " + isEligibleForLoan);
        System.out.println("_____________");


        //  LOGICAL  Or operator
        // task: we want to check is the member is eligible to register
        // age = 19;


        String name1 = "Elena";
        int age3 = 23;
        char gender = 'F';
        boolean isEligibleForRegister = age >= 19 && (gender == 'M' || gender == 'F');
        //  analyze:                    23> 19          F=M                F=F
        //                                true    &&   (false        ||     true)
        //                                true    &&          true

        System.out.println(name1 + " is eligible to register: " + isEligibleForRegister);

        System.out.println("____________________________________");

        //  Task  you want to become  a citizenship
        String name3 = "Elena";
        String countryOfBirth = "UK";
        boolean marriedToUsCitizen = false;
        boolean isEligible3 = countryOfBirth == "USA" || marriedToUsCitizen == true;


        System.out.println(name + " is eligible to apply for citizenship: " + isEligible3);


        System.out.println("__________________");

        // task:  if the person qualify for scholarship
        // gpa = 3.5  OR family income  must be less than 100000
        String student = "Anna";
        double gpa = 3;
        int familyIncome = 100000;
        boolean isEligibleForSchoolarship = gpa >= 3.5 || familyIncome <= 100000;
        System.out.println(student+ " is eligible for scholarship: " + isEligibleForSchoolarship);

        System.out.println("_________________");
        // Logical NOT operator - opposite

       // task:  create the expression for passing the score
        int score = 76;
        boolean passed = score >=85;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);


    }
}
