package day11_Switch;

public class Grade {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;
            default:
                System.out.println("Failed");


        }


    }

}
