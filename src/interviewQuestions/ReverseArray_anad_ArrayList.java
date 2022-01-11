package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray_anad_ArrayList {
    public static void main(String[] args) {

        //  Array

        int[] array = {1, 2, 3, 4, 5};
        int[] result = new int[array.length]; // 6,4,3,2,1
        int j = 0; // represents  index number in new array
        for (int i = array.length - 1; i >= 0; i--, j++) {
            result[j] = array[i];

        }
        System.out.println(Arrays.toString(result));

        //  ArrayList

        ArrayList<Integer> number = new ArrayList<>();
        number.addAll(Arrays.asList(1,2,3,4,5,6,7));

        ArrayList<Integer> reversedList = new ArrayList<>();
        for(int i = number.size()-1;i>=0; i--){
            int each = number.get(i);
            reversedList.add(each);
        }

        System.out.println(reversedList);




    }
}
