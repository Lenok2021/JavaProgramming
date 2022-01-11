package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {
        System.out.println(true == !false); // true
        System.out.println(!true != false);// false
        System.out.println(!false == true); // true
        System.out.println(!!false);// false
        System.out.println(!!!true); // false


       /*
        90 ~ 100 = excellent  A
        80~89 = good B
        70~79 = great C
        60~69 = passed D
        0~59 = failed
We need to create  a five condition
        */

        int score = 34; // 0~100
        boolean gradeA = score >= 90 && score <= 100;
        boolean gradeB = score >= 80 && score <= 89;
        // boolean gradeB = score >= 80 && !gradeA
        boolean gradeC = score >= 70 && score <= 79;
        //boolean gradeC = !gradeA && !gradeB && score >=70
        boolean gradeD = score >= 60 && score  <= 69;
        boolean gradeE = !gradeA && !gradeB && !gradeC && !gradeD;
        // boolean failed = score >= 0 && score <= 59
        if(gradeA){
            System.out.println("Excellent");
        }
        if(gradeB){
            System.out.println("Good");

        }
        if(gradeC){
            System.out.println("Great");
        }
        if(gradeD){
            System.out.println("Passed");
        }
        if(gradeE)
            System.out.println("Failed");

    }
}
