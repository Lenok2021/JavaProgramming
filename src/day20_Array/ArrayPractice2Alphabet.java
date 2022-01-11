package day20_Array;
import java.util.Arrays;
public class ArrayPractice2Alphabet {

    public static void main(String[] args) {

        char[] letters = new char[26];
        /*
        letters[0] = 'A';
        letters[1] = 'B';
        letter[2] = 'C';
        ....
         */
        /*if we know how to find each index from 1`26,  since we know there are 26 letters in alphabet
        (int i = 0,  i < letters.length ; i++)
        if  we know how to find each letter in alphabet
        we can combine
         */

        for (int i = 0, j = 'A'; i <= letters.length-1; i++, j++ ) { //i: index numbers 0 ~ last index
            letters[i] = (char)j ;
        }

       /* char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i] = ch;
        }
        */

        System.out.println(Arrays.toString(letters));  //[A~Z]

        System.out.println("_____________________________________");


        }

    }




















