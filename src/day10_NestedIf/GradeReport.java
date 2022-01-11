package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        /*  90-100 exel
        80-89 = great
        70-79 - good
        60-69 = passed
        0-59  failed
        5 possible outputs  and the score MUST  be 0-100

         */
        int  score = 43;
        if(score >=0 && score <= 100){
            //  if precondition is valid  we have 5 posibiliries
            if(score >= 90){  // false if score < 90
                System.out.println("Excellent");
            }else if (score >= 80){ // false if score <80
                System.out.println("Great");
            }else if (score >=70){  // false if the score < 70
                System.out.println("Good");

            }else if (score >=60){ //false if score < 60
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }


        }else{ // if the score  invalid
            System.out.println("Invalid Score");
        }

        System.out.println("_________________");





    }


}
