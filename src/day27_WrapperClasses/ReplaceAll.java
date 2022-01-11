package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {
      int[]  arr = {10, 10, 20, 30, 40, 30, 30, 30}; // want  to replace with 300
        //           0   1   2   3   4   5   6   7
     arr  = replaceAll(arr, 30,300);

        System.out.println(Arrays.toString(arr));
    }

  /*
     RecplaceAll Task:
		2.1 Create a method named replace that passes three parameters:
		 integer array, integer oldElement, integer newElement.
		 The method replaces all the element of the array that
		 matching with the given old element with the given new element,
		 and returns the new array.
			Ex:
				arr = {10, 10, 20, 30, 40, 30, 30, 30};
				replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}
   */

    // replaces all  the matching oldValue  of the array  with the new value
    public static int[] replaceAll (int[] array, int oldValue, int newValue){
      for(int i = 0; i< array.length; i++){
         if(array[i] == oldValue){  // if each element matching with the old value
             array[i] = newValue; // if match  assign  a new value
         }

      }
        return array;







    }





}
