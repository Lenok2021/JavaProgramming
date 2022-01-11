package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        // score test
        int score = 400;
        if (score >= 0 && score <= 100) { // if the score is valid
            if (score >= 60) { // if student passed exam
                System.out.println("Passed");

            } else { //  if student failed exam
                System.out.println("Failed");
            }

        } else { // if the score is not valid
            System.out.println("Invalid Score");
        }
        System.out.println("_________________");

// eligible to buy alcohol
        int age = 21;
        boolean hasID = true;


        if (hasID) { // if the person has ID (we have 2 output)
            if (age >= 21) {  // if the person is 21 and older
                System.out.println("Eligible");
            } else { // if the person is less than 21
                System.out.println("Not eligible");
            }

        } else { // the person does not have ID
            System.out.println("You must have ID to buy alcohol");
        }
        System.out.println("_________________");
// the  name of the day

        int number = 56;

        if (number >= 1 && number <= 7) {


        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");

        } else {
            System.out.println("Sunday");
        }
        }else{  // if the number is not valid
        System.out.println("Invalid");


    }

}
}
