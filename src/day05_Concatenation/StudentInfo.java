/*
 Create a class called StudentInfo, and declare variables for the followings:
                1. student name  (string)
                2. age (int)
                3. gender (Char)
                4. school name (String)
                5. phone number string)
                6. full time (boolean)
                7. GPA (double)
 */
package day05_Concatenation;

public class StudentInfo {

    public static void main(String[] args) {
        String student_name = "Elena Baidalo";
        int age = 38;
        char gender = 'F';
        String school_name = "Cydeo";
        String phone_number = "+1(719)-344-4567";
        boolean isFullTime = true;
        double GPA = 2.5;

        System.out.println("student_name = " + student_name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("school_name = " + school_name);
        System.out.println("phone_number = " + phone_number);
        System.out.println("GPA = " + GPA);
        System.out.println("isFullTime = " + isFullTime);


    }
}
