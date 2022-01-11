package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
    int[] arr = {1,1,1,1,1,2,3,3,3,6,6,6};
    arr=removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));
    }
    // removes  the duplicates  from Array
    public static int[] removeDuplicates (int[] array){

       int [] result = {};  //  store  result  //
        for (int each : array) {
           if(!ArraysUtility.contains(result, each)){
            result =   ArraysUtility.addElement(result, each);
           }
        }
       return result;
    }
}
