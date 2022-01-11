package day20_Array;
import java.util.Arrays;
public class ArrayPractice3Alphabet {
    public static void main(String[] args) {


        //  find alphabet from 'Z'  to 'A';

        char[] letters = new char[26];
        for (int i = 0, j = 'Z'; i < letters.length && j >= 'A'; i++, j--) {
            letters[i] = (char) j;

        }
        System.out.println(Arrays.toString(letters));

    }

}
