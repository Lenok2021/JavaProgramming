package day11_Switch;

public class GradeLevel {

    public static void main(String[] args) {

     /*
        Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
                For Any Other grade: Invalid grade level given

            Note:
                Solution 1: Use switch statement
                Solution 2: use if & switch both
      */


        byte number = 10;
        String result = "";
        if (number >= 0 && number <= 18) { // 1~18
            switch (number) {  // number 1~18,  because  we already  gave  a precondition
                case 6: case 7: case 8:
                    result = "Middle school";break;
                case 9: case 10: case 11: case 12:
                    result = "High School";break;
                case 13: case 14: case 15: case 16:
                    result = "College";break;
                case 17: case 18:
                    result = "Grad School";break;

                default: // number 1~5
                    result = "Elementary school";
            }
        } else {
            result = "Invalid grade";

        }


    }
}

