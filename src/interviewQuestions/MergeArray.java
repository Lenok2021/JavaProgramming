package interviewQuestions;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {

        //  first  i need to make sure that  my  third array  has enough capacity
        //  for  first  and second arrays
        //  first  i need to make sure that  my  third array  has enough capacity
        //  for  first  and second arrays
        String[] group1 = {"Ali", "Layan", "Aysenur" }; // 3
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"}; //5

        String[] students = new String[group1.length + group2.length];  // 8


        int i = 0; // since the for each loop does not accept
        // index number, we declare  i  as an index for array3
        for (String each : group1) { // Ali, Layan, Aysenur
            students[i++] = each;//  when we got  each  element from 1 array we assign to
            //  array 3  and increase the value
        }


        for (String each : group2) {
            students[i++] = each; // /  when we got  each  element from 2 array we assign to
            //  array 3  and increase the value
        }

        System.out.println(Arrays.toString(students));


        System.out.println("-----------------------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;

        for (char ch : ch1) {
            chars[j]= ch;
            j++;
        }

        for (char ch : ch2) {
            chars[j]= ch;
            j++;
        }

        System.out.println(Arrays.toString(chars));




    }
}
