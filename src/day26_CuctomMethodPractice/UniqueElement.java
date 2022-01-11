package day26_CuctomMethodPractice;

import utilities.ArraysUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UniqueElement {

    public static void main(String[] args) {
       int [] array = {1,1,1,1,5,8,6,6,6,9,9,7};
           int [] unique = uniqueElement(array);
        System.out.println(Arrays.toString(unique));
        }


    public static int[] uniqueElement(int[] array){
        int[] result = {};
        for(int each :  array){
            if(ArraysUtility.frequencyOfElement(array,each) ==1){ // verify  the chara. is unique
              result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


}
