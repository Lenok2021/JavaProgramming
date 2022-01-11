package day17_WhileAndDoLoop;

public class BranchingStatements2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'F' ; i++) {
            if(i == 'C'){
                continue;
            }
            System.out.println(i); //A B D E
        }


    }
    }