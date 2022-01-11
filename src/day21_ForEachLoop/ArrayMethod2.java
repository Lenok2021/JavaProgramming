package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayMethod2 {

    public static void main(String[] args) {
        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 2);
        System.out.println(students.length);
        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers, 4); //{1,2,3,4}

        System.out.println(Arrays.toString(numbers));


        System.out.println("--------------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6+1 );
        System.out.println(Arrays.toString(ch2));
       int[] q = {1,2,3,4,5,6,7};
       int[]qq = Arrays.copyOf(q,4);

        System.out.println(Arrays.toString(qq));
        int w[] = Arrays.copyOfRange(q,1,2+1);
        System.out.println(Arrays.toString(w));

    }
}
