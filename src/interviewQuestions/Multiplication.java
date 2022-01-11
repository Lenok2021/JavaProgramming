package interviewQuestions;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First number: ");
        int num1 = scan.nextInt();
        System.out.println("Second number");
        int num2 = scan.nextInt();
        int multi = 0;
        for (int i = 0; i < num1; i++) {

            multi += num2;

        }
        System.out.println(multi);
scan.close();
    }


}
