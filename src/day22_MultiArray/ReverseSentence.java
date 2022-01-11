package day22_MultiArray;

import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {
       /*
        1. Write a program that can reverse a sentence
            Ex:
                sentence = "Today is a good day to learn Java";

            output:
                Java learn to day good a is Today
        */
        String  sentence = "Today is a good day to learn Java";
        String[] words =  sentence.split(" ");  // create an array, that  can stored each element
        //  we splitted by space
        System.out.println(Arrays.toString(words)); // when print an array  we use toString Method

        String [] reversed = new String[words.length];// the purpose of this String
        //  i want  to store my result


             for (int i = words.length - 1, j=0 ; i >= 0; i--, j++) {// get word from last to first word
                 // we cannot use For Each Loop, because we can start from begin to last
                 reversed[j] = words[i]; //
             }
        System.out.println(Arrays.toString(reversed));




    }
}
