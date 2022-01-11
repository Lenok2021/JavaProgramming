package day15_ForLoop;

public class LoopPractices {
    public static void main(String[] args) {
        //  write the program that  can display  numbers  betwwen  15~45,
        //  in the same line +  space  in the same line  15 16 17 18 19 20......45

        for (int i = 15; i <= 45; i++) { // i:  15 , 16, 17 ......45
            System.out.print(i + " ");// or i++"\n"  for PRINTLN
        }
        System.out.println();
        System.out.println("Hello");

        System.out.println("__________________________");

// 100  99  98  97.....50
        for (int i = 100; i >= 50; i--) { // i:  100, 99,98, 97....50
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("_______________");

        // to print  all even  numbers, 1~55

        for (int i = 1; i <= 55; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
        System.out.println("___________________________");

        // 1~55: 2,4,6,8,54

        for (int i = 2; i <= 54; i += 2) {// i: 2,4,6,8....54
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("_______________________");

    }
}