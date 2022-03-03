package day52Map_Continue;

public class Test2 {

    public static void main(String[] args) {

        SecondFunctionalInterface<String> printEach;
        printEach = s -> {
            for (int i = 0; i <= s.length() - 1; i++) {
                System.out.println(s.charAt(i));
            }

        };
        printEach.test("Hello");
    }


}
