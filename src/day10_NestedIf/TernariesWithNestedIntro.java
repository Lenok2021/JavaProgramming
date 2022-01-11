package day10_NestedIf;

public class TernariesWithNestedIntro {

    public static void main(String[] args) {
        // score test
        int score = 49;

        if (score >= 0 && score <= 100) { // if the score is valid
            if (score >= 60) { // if student passed exam
                System.out.println("Passed");

            } else { //  if student failed exam
                System.out.println("Failed");
            }

        } else { // if the score is not valid
            System.out.println("Invalid Score");
        }
        System.out.println("________________________________");


        String result = (score >=0 && score <= 100)? (score>=60)? "Passed" : "Failed" :"Invalid Score";
        System.out.println(result);
    }
}




