package day12_ScannerPractice;
import java.util.Scanner; // regular import : imports  one class

//import java.util.*; // wild import:  imports  everything from the package

public class ScannerPtactice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number 1 to 7");
        int n = scan.nextInt();

        String result = ""; // temporary value
        if (n >= 1 && n <= 7) {
            result = (n == 1) ? "Monday" : (n == 2) ? "Tuesday" : (n == 3) ? "Wednesday" : (n == 4) ?
                    "Thursday" : (n == 5) ? "Friday" : (n == 6) ? "Saturday" : "Sunday";

        } else {
            result = "Invalid number";


        }
        System.out.println(result);
    }
}