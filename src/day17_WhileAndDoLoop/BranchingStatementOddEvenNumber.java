package day17_WhileAndDoLoop;

public class BranchingStatementOddEvenNumber {
    public static void main(String[] args) {
        // print all even numbers 1 ~ 10 (skip the odd numbers)

        for (int i = 1; i < 11; i++) {// i:1,2,3,4,5,6,7,8,9,10
            if(i%2 != 0) { //1, 3, 5, 7, 9
                continue; //Skip
            }

            System.out.println(i); //2 4 6 8 10
        }


        System.out.println("-------------------------------------");
        // print all odd numbers between 1 ~ 10 ( skip the even numbers)

        for (int i = 1; i < 11; i++) {

            if(i%2==0){ //2, 4, 6, 8, 10
                continue;
            }

            System.out.println(i);

        }

    }


}
