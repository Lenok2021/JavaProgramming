package day26_CuctomMethodPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        int[] result = reverse(number);
        System.out.println(Arrays.toString(result));
        number = reverse(number);
        System.out.println(Arrays.toString(number));
    }


    public static int[] reverse(int[] array) {
        int[] result = new int[array.length]; //  create new array /  more capacity
        //  we  can put j=0;  in the beginning
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];  //when  i  got each element  from last index  i need to assign to index number to new array
        }
        return result;
    }


}
